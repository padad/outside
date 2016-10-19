/*----------------------------------------------------------------
// Copyright (C) 2010 郑州华粮科技股份有限公司
// 版权所有。 
//          
// 文件名：Member.js
// 文件功能描述：会员管理主页面js
//
// 
// 创建标识：zfyin 20100422
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
//--设置一些共有参数
Ext.BLANK_IMAGE_URL = "res/images/framework/s.gif";
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
    //添加动画效果
    layoutConfig: {
        animate: true
    },
    region: "north",
    height: 92,
    items: [top]
});



//-------------------------------------------------中间

var center = new Ext.TabPanel({
    
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
        html: "<iframe src='HomePage.aspx' scrolling='auto' frameborder=0 width=100% height=100%></iframe>"}],
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
            iconCls: 'icon-show-all',
            items: [north, west, center]
        });

        var ab = west.body;

        //绑定单击事件
        ab.on('click', doAction, null, { delegate: 'a' });
        //跳转页面
        function GotoPage(t) {            
            var n = center.getComponent(t.id);
            if (!n) { //判断是否已经打开该面板   
                n = center.add({
                    xtype: "panel",
                    id: t.id,
                    title: t.innerHTML,
                    closable: true,  //通过html载入目标页
                    //autoLoad: { url: node.attributes.url, callback: this.initSearch, scope: this }
                    html: '<iframe scrolling="auto" frameborder="0" width="100%" height="100%" src="'
                            + t.href + '"></iframe>'
                });
            }
            else {
                center.remove(n);
                n = center.add({
                    xtype: "panel",
                    id: t.id,
                    title: t.innerHTML,
                    closable: true,  //通过html载入目标页
                    html: '<iframe scrolling="auto" frameborder="0" width="100%" height="100%" src="'
                            + t.href + '"></iframe>'
                });
            }

            center.setActiveTab(n);
        }

        function doAction(e, t) {
            e.stopEvent(); 
             GotoPage(t); 
        }
    });

