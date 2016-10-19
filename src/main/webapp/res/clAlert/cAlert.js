//加载样式
var cssSrc = "";
for (var i = 0; i < document.getElementsByTagName('script').length; i++) {
    var jsscr = document.getElementsByTagName('script')[i].src;
    if (jsscr.indexOf("cAlert.js") > 0) {
        cssSrc = jsscr.replace("cAlert.js", "MsgBox.css");
    }
}
var cssTag = document.createElement('link');
cssTag.setAttribute('rel', 'stylesheet');
cssTag.setAttribute('type', 'text/css');
cssTag.setAttribute('href', '' + cssSrc + '');
document.getElementsByTagName('head')[0].appendChild(cssTag);
//end
/*****************警告对话框，作者：cLei***********************
//共4个参数
title:提示标题；
content:提示的内容
imgType:1:提示，2：严重提示，3：警告，4成功提示
retType:1：都返回true（仅有一个确定按钮）；2：（确定按钮返回true，其他返回false）
******************************************************************/
var isShow = false;
function cAlert(title, content, imgType, retType) {
    if (isShow) {
        return;
    } else {
        isShow = true;
    }
    if (title.length > 20) title = title.substring(0, 20);
    if (imgType > 4) imgType = 1;
    if (retType > 2) retType = 1;
    var sWidth = document.documentElement.offsetWidth;
    var sHeight = document.documentElement.offsetHeight;
    //定义弹出框住结构
    var msgBox = document.createElement("div");
    msgBox.setAttribute('id', 'msgBox');
    msgBox.className = 'gSys-msg';
    document.body.appendChild(msgBox);
    //定义弹出框的内容去
    var msgMain = document.createElement("div");
    msgMain.setAttribute("id", "msgMain");
    msgMain.className = 'gSys-msg-win';
    msgMain.style.width = 370 + "px";
    msgMain.style.top = 220 + "px";
    msgMain.style.left = (sWidth - 370) / 2 + "px";
    document.getElementById("msgBox").appendChild(msgMain);
    //弹出框的标题
    var msgHead = document.createElement("div");
    msgHead.setAttribute("id", "msgHead");
    msgHead.className = 'fn-bgx bg-main-2 hd';
    msgHead.innerHTML = "<span class='fn-bg rc-l'>&nbsp;</span><h4>&nbsp;" + title + "</h4>";
    msgHead.innerHTML = msgHead.innerHTML + "<span class='sub txt-14'></span><span class='fn-bg rc-r'></span>";
    msgHead.innerHTML = msgHead.innerHTML + "<a id='lnkClose' onclick='javascript:isShow = false;document.body.removeChild(document.getElementById(\"msgBox\")); ' class='fn-bg Aclose' title='关闭' hidefocus='true'>关闭</a>";
    msgHead.onmousedown = function(e) {
        fDragging(msgMain, e);
    }
    document.getElementById("msgMain").appendChild(msgHead); //绑定到显示区
    //弹出框的内容
    var msgContent = document.createElement("div");
    msgContent.setAttribute("id", "msgContent");
    msgContent.className = 'cont bdr-c-dark';
    document.getElementById("msgMain").appendChild(msgContent); //绑定到显示区
    //要显示的内容｛imgType图片绑定1:提示，2：严重提示，3：警告，4成功提示｝
    var contRan = document.createElement("div");
    contRan.setAttribute("id", "contRan");
    contRan.className = 'gSys-inner-comm';
    switch (imgType) {
        case 1: contRan.innerHTML = "<b class='ico ico-point' title='提示：'></b>"; break;
        case 2: contRan.innerHTML = "<b class='ico ico-imp' title='严重提示：'></b>"; break;
        case 3: contRan.innerHTML = "<b class='ico ico-warn' title='警告：'></b>"; break;
        case 4: contRan.innerHTML = "<b class='ico ico-suc' title='成功：'></b>"; break;
        default: contRan.innerHTML = "<b class='ico ico-point' title='提示：'></b>";
    }
    document.getElementById("msgContent").appendChild(contRan);
    //具体要显示的内容content
    var contText = document.createElement("div");
    contText.setAttribute("id", "contText");
    contText.className = 'ct';
    contText.innerHTML = content;
    document.getElementById("contRan").appendChild(contText); //绑定到显示区
    //弹出框的按钮区
    var msgButton = document.createElement("div");
    msgButton.setAttribute("id", "msgButton");
    msgButton.className = 'ft bdr-c-dark bg-cont';
    document.getElementById("msgMain").appendChild(msgButton); //绑定到显示区
    var MsgBottomDiv = document.createElement("div");
    MsgBottomDiv.setAttribute("id", "MsgBottomDiv");
    MsgBottomDiv.className= 'sup';
    document.getElementById("msgButton").appendChild(MsgBottomDiv); //绑定到显示区
    //按钮用div制作
    var msgButRan = document.createElement("div");
    msgButRan.setAttribute("id", "msgButRan");
    msgButRan.className = 'opt';
    document.getElementById("msgButton").appendChild(msgButRan); //绑定到显示区
    //确定按钮
    var butOK = document.createElement("div");
    butOK.setAttribute("id", "butOK");
    butOK.className = 'btn btn-dft';
    butOK.innerHTML = "<span id='butOK' class='btnspan'>确 定</span>";
    butOK.onmouseup = function() {
        this.className = 'btn btn-dft btn-dft-hover';
    }
    butOK.onmousedown = function() {
        this.className = 'btn btn-dft btn-dft-active';
    }
    butOK.onmouseout = function() {
        this.className = 'btn btn-dft';
    }
    butOK.onmouseover = function() {
        this.className = 'btn btn-dft btn-dft-hover';
    }
    butOK.onclick = function() {
        isShow = false;
        document.body.removeChild(document.getElementById("msgBox"));
        renResult(true);
    }
    document.getElementById("msgButRan").appendChild(butOK); //绑定到显示区
    //取消按钮
    if (retType == 2) {
        var butCenter = document.createElement("div");
        butCenter.setAttribute("id", "butCenter");
        butCenter.className = 'btn btn-dft';
        butCenter.innerHTML = "<span id='butCenter' class='btnspan'>取 消</span>";
        butCenter.onmouseup = function() {
            this.className = 'btn btn-dft btn-dft-hover';
        }
        butCenter.onmousedown = function() {
            this.className = 'btn btn-dft btn-dft-active';
        }
        butCenter.onmouseout = function() {
            this.className = 'btn btn-dft';
        }
        butCenter.onmouseover = function() {
            this.className = 'btn btn-dft btn-dft-hover';
        }
        butCenter.onclick = function() {
            isShow = false;
            document.body.removeChild(document.getElementById("msgBox"));
            renResult(false);
        }
        document.getElementById("msgButRan").appendChild(butCenter); //绑定到显示区  
    }
    //页面的整体背景颜色
    var msgMask = document.createElement("div");
    msgMask.setAttribute("id", "msgMask");
    msgMask.setAttribute('class', 'mask');
    msgMask.innerHTML = "&nbsp;";
    document.getElementById("msgBox").appendChild(msgMask);
    document.getElementById("butOK").focus();
}
function renResult() {
}
//取标签的绝对位置
function Offset(e) {
    var t = e.offsetTop;
    var l = e.offsetLeft;
    var w = e.offsetWidth;
    var h = e.offsetHeight - 2;
    while (e = e.offsetParent) {
        t += e.offsetTop;
        l += e.offsetLeft;
    }
    return {
        top: t,
        left: l,
        width: w,
        height: h
    }
}
/*************弹出层的操作*********************
content:要现实的内容[url.obj,content]
position:如果不为空，则显示在传过来的对象处，如果为空，剧中
height对象的高度；width:对象的宽度
type:[1:url;2:obj;3:content]
*/
function show(title, content, height, width, type, positionObj) {
    if (isShow) {
        return;
    } else {
        isShow = true;
    }
    type = (type == undefined) ? 2 : type;
    height = (height == undefined) ? 800 : height;
    width = (width == undefined) ? 600 : width;
    var sWidth = document.documentElement.offsetWidth;
    var sHeight = document.documentElement.offsetHeight;
    var showtop = 0;
    var showleft = 0;
    if (positionObj == undefined) {
        showtop = (sHeight - height) / 2;
        showtop = (showtop < 0) ? 0 : showtop;
        showleft = (sWidth - width) / 2;
        showleft = (showleft < 0) ? 0 : showleft;
    } else {
    var offset = Offset(positionObj);
    showtop = offset.top + 25;
    showleft = offset.left;
    showleft = (showleft + width > sWidth) ? showleft + 60 - width : showleft;
    }
    
    //定义弹出框住结构
    var divBox = document.createElement("div");
    divBox.setAttribute('id', 'divBox');
    divBox.className= 'gSys-msg';
    document.getElementById("form1").appendChild(divBox);
    //定义弹出框的内容去
    var divMain = document.createElement("div");
    divMain.setAttribute("id", "divMain");
    divMain.className= 'gSys-msg-win';
    divMain.style.width = width + "px";
    divMain.style.height = height + "px";
    divMain.style.top = showtop + "px";
    divMain.style.left = showleft + "px";
    document.getElementById("divBox").appendChild(divMain);
    //弹出框的标题
    var divHead = document.createElement("div");
    divHead.setAttribute("id", "divHead");
    divHead.className= 'fn-bgx bg-main-2 hd';
    divHead.innerHTML = "<span class='fn-bg rc-l'>&nbsp;</span><h4>&nbsp;" + title + "</h4>";
    divHead.innerHTML = divHead.innerHTML + "<span class='sub txt-14'></span><span class='fn-bg rc-r'></span>";
    var closeA = document.createElement("a");
    closeA.setAttribute("id", "lnkClose");
    closeA.setAttribute("title", "关闭")
    closeA.setAttribute("hidefocus", "true")
    closeA.className = "fn-bg Aclose";
    closeA.innerHTML = "关闭";
    closeA.onclick = function() {
        isShow = false;
        document.getElementById("form1").removeChild(document.getElementById("divBox"));
        if (type == 2) {
            content.innerHTML = divContent.innerHTML;
            content.setAttribute("display", "none");
        }
    }
    divHead.onmousedown = function(e) {
        fDragging(divMain, e);
    }
    document.getElementById("divMain").appendChild(divHead); //绑定到显示区
    document.getElementById("divHead").appendChild(closeA);
    //弹出框的内容
    var divContent = document.createElement("div");
    divContent.setAttribute("id", "divContent");
    divContent.className= 'cont';

    switch (type) {
        case 1: break;
        case 2: divContent.innerHTML = content.innerHTML;
            content.innerHTML = "";
            divContent.setAttribute("display",""); break;
        case 3: divContent.innerHTML = content; break;
    }
    document.getElementById("divMain").appendChild(divContent); //绑定到显示区


    //页面的整体背景颜色
    if (type != 3) {
        var divMask = document.createElement("div");
        divMask.setAttribute("id", "divMask");
        divMask.className = 'mask';
        divMask.innerHTML = "&nbsp;";
        document.getElementById("divBox").appendChild(divMask);
    }
    document.getElementById("divContent").focus();
}
/*
函数 fDragging(obj, e) 的各参数解释:
obj: HTML元素对象, 要拖曳的元素
e: 指定为 event 对象, 主要为兼容 Firefox
*/
function fDragging(obj, e) {
    if (!e) e = window.event;


    var x = parseInt(obj.style.left);
    var y = parseInt(obj.style.top);

    var x_ = e.clientX - x;
    var y_ = e.clientY - y;

    if (document.addEventListener) {
        document.addEventListener('mousemove', inFmove, true);
        document.addEventListener('mouseup', inFup, true);
    } else if (document.attachEvent) {
        document.attachEvent('onmousemove', inFmove);
        document.attachEvent('onmouseup', inFup);
    }

    inFstop(e);
    inFabort(e)

    function inFmove(e) {
        if (!e) e = window.event;
        obj.style.left = e.clientX - x_ + 'px';
        obj.style.top = e.clientY - y_ + 'px';

        inFstop(e);
    } // shawl.qiu script
    function inFup(e) {
        var evt;
        if (!e) e = window.event;

        if (document.removeEventListener) {
            document.removeEventListener('mousemove', inFmove, true);
            document.removeEventListener('mouseup', inFup, true);
        } else if (document.detachEvent) {
            document.detachEvent('onmousemove', inFmove);
            document.detachEvent('onmouseup', inFup);
        }

        inFstop(e);
    } // shawl.qiu script

    function inFstop(e) {
        if (e.stopPropagation) return e.stopPropagation();
        else return e.cancelBubble = true;
    } // shawl.qiu script
    function inFabort(e) {
        if (e.preventDefault) return e.preventDefault();
        else return e.returnValue = false;
    } // shawl.qiu script
}