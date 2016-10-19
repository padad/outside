function openPanelWithOutMenu(node_id, node_text, node_url) {
    var n = window.top.center.getComponent(node_id);

    if (n) { //判断是否已经打开该面板
        window.top.center.remove(n);
    }
    n = window.top.center.add({
        xtype: "panel",
        id: node_id,
        iconCls: 'totalicon',
        title: node_text,
        closable: true,  //通过html载入目标页
        html: '<iframe scrolling="auto" frameborder="0" width="100%" height="100%" src="' + node_url + '"></iframe>'
    });
    window.top.center.setActiveTab(n);
}

function openPanelWithMenu(MenuCode) {
    var n = window.top.center.getComponent(MenuCode);
    var node = window.top.treenode.getNodeById(MenuCode);
    var ifmu = false;
    try {
        eval('ifmu=menu' + MenuCode + ';');
    }
    catch (e) {
        ifmu = false;
    }
    //alert(ifmu);
    if (node != null) {
        if (n) { //判断是否已经打开该面板
            window.top.center.remove(n);
        }
        n = window.top.center.add({
            xtype: "panel",
            id: node.id,
            iconCls: node.attributes.iconCls,
            title: node.text,
            closable: true,  //通过html载入目标页
            html: '<iframe scrolling="auto" frameborder="0" width="100%" height="100%" src='
                            + (node.attributes.url.indexOf('?') > 0 ? node.attributes.url + '&' : node.attributes.url + '?') + 'MenuCode=' + node.id + '&remind=true' + '></iframe>'
        });
        window.top.center.setActiveTab(n);
    }
    else {
        node = window.top.treenode.getNodeById(MenuCode.substring(0, 3));

        if (node != null && !ifmu) {
            //node.select();
            //debugger;
            node.expand(false, true, function() { eval('menu' + MenuCode + '=true;'); openPanelWithMenu(MenuCode); });
            //openPanelWithMenu(MenuCode);
        }
        else {
            alert('对不起，你没权限访问这个页面，请与中华粮网技术支持联系！');
        }
    }
}