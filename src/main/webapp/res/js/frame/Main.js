/*----------------------------------------------------------------
// Copyright (C) 2010 郑州华粮科技股份有限公司
// 版权所有。 
//          
// 文件名：Main.js
// 文件功能描述：首页加载js
//
// 
// 创建标识：kzcui 20100409
//
// 修改标识：
// 修改描述：
//
// 修改标识：
// 修改描述：

------------------------------------------------------------------*/
//加载效果
function loading() {
    setTimeout(function() {
        Ext.get('loading').remove();
        Ext.get('loading-mask').fadeOut({ remove: true });
    }, 2000);
}
//得到用户ID
//loaduser();
//alert(user);

//--设置一些共有参数
Ext.BLANK_IMAGE_URL = "../../images/framework/s.gif";
Ext.QuickTips.init();


///=================================================头部
var top = new Ext.BoxComponent({
    el: "top",
    height: 92
});

//------------------------------------------north设置
var north = new Ext.Panel({
    titleCollapse: false,
    collapsedCls: '',
    border: false,
    collapsible: true,
    bodyStyle: {  
        //background: '#ffc',  
        background: 'url(../../images/framework/top_bg.gif)',  
         
    },
    //添加动画效果
    layoutConfig: {
        animate: true
    },
    region: "north",
    height: 92,
    items: [top]
});


//----------------------------------------------左边
var root = new Ext.tree.AsyncTreeNode({
    id: rootsid + '',
    url: '#',
    text: "管理系统",
    loader: new Ext.tree.TreeLoader({
        url: "tree_menu/treemenu.do",
        listeners: {
            "beforeload": function(treeloader, node) {
                treeloader.baseParams = {
                    id: node.attributes.id,
                    url: node.attributes.url,
                    method: 'POST'
                };
            }
        }
    })
});

var treenode = new Ext.tree.TreePanel({
    //如果超出范围带自动滚动条
    autoScroll: true,
    root: root,
    //默认根目录不显示
    rootVisible: true,
    border: false,
    animate: true,
    lines: true,
    enableDD: true,
    containerScroll: true,
    listeners:
    {
        "click": function(node, event) {
            //叶子节点点击不进入链接             
            if (node.isLeaf()) {
                // 显示叶子节点菜单
                event.stopEvent();
                var n = center.getComponent(node.id);
                if (!n) { //判断是否已经打开该面板   
                    n = center.add({
                        xtype: "panel",
                        id: node.id,
                        iconCls: node.attributes.iconCls,
                        title: node.text,
                        closable: true,  //通过html载入目标页
                        //autoLoad: { url: node.attributes.url, callback: this.initSearch, scope: this }
                        html: '<iframe scrolling="auto" frameborder="0" width="100%" height="100%" src="'
                                + (node.attributes.url.indexOf('?') > 0 ? node.attributes.url +
                                '&' : node.attributes.url + '?') + 'MenuID=' + node.id + '"></iframe>'
                    });
                }
                else {
                    center.remove(n);
                    n = center.add({
                        xtype: "panel",
                        id: node.id,
                        iconCls: node.attributes.iconCls,
                        title: node.text,
                        closable: true,  //通过html载入目标页
                        html: '<iframe scrolling="auto" frameborder="0" width="100%" height="100%" src='
                             + (node.attributes.url.indexOf('?') > 0 ? node.attributes.url
                             + '&' : node.attributes.url + '?') + 'MenuID=' + node.id + '></iframe>'
                    });
                }
                center.setActiveTab(n);
            } else {
                //不是叶子节点不触发事件
                event.stopEvent();
                //点击时展开
                node.toggle();
            }
        }
    }

});
//加载时自动展开根节点
//treenode.getRootNode().toggle();
//treenode.expandAll();

//添加左边
var west = new Ext.Panel({
    //自动收缩按钮 
    collapsible: true,
    border: false,
    width: 225,
    layout: "accordion",
    extraCls: "roomtypegridbbar",
    //添加动画效果
    layoutConfig: {
        animate: true
    },
    region: "west",
    title: '系统',
    //
    items: [{
        title: "<b>操作菜单</b>",
        autoScroll: true,
        iconCls: "roomicons",
        items: [treenode]
}]
    });

    //-------------------------------------------------中间

    var center = new Ext.TabPanel({
        //距两边间距
        style: "padding:0 5px 0 5px",
        region: "center",
        //默认选中第一个
        activeItem: 0,
        //如果Tab过多会出现滚动条
        enableTabScroll: true,
        //加载时渲染所有
        //deferredRender:false,
        layoutOnTabChange: true,
        items: [{
            xtype: "panel",
            id: "index",
            iconCls: "indexicon",
            title: "首 页",
            //closable:true,
            html: "<iframe src='intro.jsp' scrolling='auto' frameborder=0 width=100% height=100%></iframe>"}],
            plugins: new Ext.ux.TabCloseMenu()
        });

        var botton = new Ext.BoxComponent({
            el: "botton",
            height: 30
        });
        //底部
        var south = new Ext.Panel({
            border: false,
            region: "south",
            height: 30,
            items: [botton]
        });


        //////////////////////////////////////////////////////////
        Ext.onReady(function() {
            var vp = new Ext.Viewport({
                layout: "border",
                items: [north, west, center]
            });
        });

