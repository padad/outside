function Dialog(diviId, x, y, width, height) {
    var object = this;
    var dialogMask;
    this.id = diviId;
    this.Width = width ? width : 300;
    this.Height = height ? height : 200;
    var dialog = this.Dialog = document.getElementById(diviId);

    dialog.style.zIndex = 99991;
    dialog.style.width = this.Width;
    
    this.State = "Expand";

    this.SetPositon = function() {
        this.X = x ? x : ((document.documentElement.clientWidth - this.Width) / 2);
        this.Y = y ? y : (document.documentElement.scrollTop + (document.documentElement.clientHeight - this.Height) / 2);
        //alert(document.documentElement.scrollLeft);
        dialog.style.left = this.X + "px";
        dialog.style.top = this.Y + "px";
    }
    this.SetPositon();
    this.SetXY = function(x, y) {
        this.X = x;
        this.Y = y;
        dialog.style.left = this.X + "px";
        dialog.style.top = this.Y + "px";
    }
    this.SetWithElementoffsetXY = function(ElementId, offsetX, offsetY) {
        var elem = getAbsoluteLocation(document.getElementById(ElementId));
        this.SetXY(elem.absoluteLeft + offsetX, elem.absoluteTop + offsetY);
    }
    this.SetRange = function(width, height) {
        this.Width = width;
        this.Height = height;
        dialog.style.width = this.Width + "px";
        dialog.style.top = this.Height + "px";
    }

    this.Show = function() {
        this.SetPositon();
        dialog.style.display = "block";
        hideElementAll();
        //this.showModelessDialog();
    }
    this.ShowAndDorp = function() {
        this.SetPositon();
        dialog.style.display = "block";
        hideElementAll();
        //this.showModelessDialog();
    }
    this.ShowAndMask = function() {
        this.SetPositon();
        dialog.style.display = "block";
        this.showModelessDialog();
        this.Dialog.focus();
        //dialogMask.style.display="block";
    }
    this.Hide = function() {
        if (dialogMask) {
            dialogMask.style.display = "none";
            document.body.removeChild(dialogMask);
        }
        dialog.style.display = "none";        
    }
    
    this.Alert = function() {

    }
    this.Confirm = function() {

    }
    this.showModelessDialog = function() {
        dialogMask = document.createElement("div");
        dialogMask.className = "DialogMask";
        document.body.appendChild(dialogMask);
        dialogMask.style.height = window.screen.availHeight + "px"; //document.body.offsetHeight + "px";
        dialogMask.style.zIndex = 10099;
    }

    this.Expand = function(img, contentId) {
        var content = document.getElementById(contentId);
        window.event.cancelBubble = true;
        if (this.State == "Expand") {
            this.title = "展开";
            this.State = "Collapse";
            content.style.display = "none";
        }
        else {
            this.title = "折叠";
            this.State = "Expand";
            content.style.display = "block";
        }
        //this.src="/blog/images/"+this.getAttribute("State")+"_hover.gif"; 
    }
    function getEvent() //同时兼容ie和ff的写法
    {
        if (document.all) return window.event;
        func = getEvent.caller;
        while (func != null) {
            var arg0 = func.arguments[0];
            if (arg0) {
                if ((arg0.constructor == Event || arg0.constructor == MouseEvent) || (typeof (arg0) == "object" && arg0.preventDefault && arg0.stopPropagation)) {
                    return arg0;
                }
            }
            func = func.caller;
        }
        return null;
    }
    this.Drag = function(header, e) {
        var ie = ! -[1, ];
        if (!ie) {
            window.event = getEvent();
            window.event.srcElement = getEvent().target;
        }

        window.event.returnValue = true;
        header.style.cursor = "move";
        var offsetX = window.event.clientX - GetLeft(dialog);
        var offsetY = window.event.clientY - GetTop(dialog);

        document.onmousemove = function(e) {
            if (!ie) {
                window.event = getEvent();
                window.event.srcElement = getEvent().target;
            }
            window.event.returnValue = true;
            object.SetXY(window.event.clientX - offsetX, window.event.clientY - offsetY);
        }
        document.onmouseup = function(e) {
            header.style.cursor = "move";
            document.onmousemove = null;
            document.onmouseup = null;
        }
    }

}
function GetLeft(src) {
    var left = 0;
    while (src) {
        left += src.offsetLeft;
        src = src.offsetParent;
    }
    return left;
}
function GetTop(src) {
    var top = 0;
    while (src) {
        top += src.offsetTop;
        src = src.offsetParent;
    }
    return top;
}
function getAbsoluteLocation(element) {
    if (arguments.length != 1 || element == null) {
        return null;
    }
    var elmt = element;
    var offsetTop = elmt.offsetTop;
    var offsetLeft = elmt.offsetLeft;
    var offsetWidth = elmt.offsetWidth;
    var offsetHeight = elmt.offsetHeight;
    var scrollWidth = elmt.scrollWidth; //滚动条宽度

    while (elmt = elmt.offsetParent) {
        if (elmt.style.position == 'absolute' || elmt.style.position == 'relative'
            || (elmt.style.overflow != 'visible' && elmt.style.overflow != '')) {
            break;
        }
        offsetTop += elmt.offsetTop;
        offsetLeft += elmt.offsetLeft;
    }
    return { absoluteTop: offsetTop, absoluteLeft: offsetLeft,
        offsetWidth: offsetWidth, offsetHeight: offsetHeight, scrollWidth: scrollWidth
    };
}

/**//*  
*     消息构造  
*/
function CLASS_MSN_MESSAGE(id, width, height, caption, title, message, target, action) {
    this.id = id;
    this.title = title;
    this.caption = caption;
    this.message = message;
    this.target = target;
    this.action = action;
    this.width = width ? width : 200;
    this.height = height ? height : 120;
    this.timeout = 150;
    this.speed = 20;
    this.step = 1;
    this.right = screen.width - 1;
    this.bottom = screen.height;
    this.left = this.right - this.width;
    this.top = this.bottom - this.height;
    this.timer = 0;
    this.pause = false;
    this.close = false;
    this.autoHide = true;
}

/**//*  
*     隐藏消息方法  
*/
CLASS_MSN_MESSAGE.prototype.hide = function() {
    if (this.onunload()) {

        var offset = this.height > this.bottom - this.top ? this.height : this.bottom - this.top;
        var me = this;

        if (this.timer > 0) {
            window.clearInterval(me.timer);
        }

        var fun = function() {
            if (me.pause == false || me.close) {
                var x = me.left;
                var y = 0;
                var width = me.width;
                var height = 0;
                if (me.offset > 0) {
                    height = me.offset;
                }

                y = me.bottom - height;

                if (y >= me.bottom) {
                    window.clearInterval(me.timer);
                    me.Pop.hide();
                } else {
                    me.offset = me.offset - me.step;
                }
                me.Pop.show(x, y, width, height);
            }
        }

        this.timer = window.setInterval(fun, this.speed)
    }
}

/**//*  
*     消息卸载事件，可以重写  
*/
CLASS_MSN_MESSAGE.prototype.onunload = function() {
    return true;
}
/**//*  
*     消息命令事件，要实现自己的连接，请重写它  
*  
*/
CLASS_MSN_MESSAGE.prototype.oncommand = function() {
    //this.close = true;
    window.open(this.action, this.target);
    this.hide();
}

/**//*  
*     消息显示方法  
             var MSG = new CLASS_MSN_MESSAGE("aa",200,120,"短消息提示：","您有1封消息","今天请我吃饭哈");  
                 MSG.show();  
*/
CLASS_MSN_MESSAGE.prototype.show = function() {

    var oPopup = window.createPopup(); //IE5.5+  

    this.Pop = oPopup;

    var w = this.width;
    var h = this.height;

    var str = "<DIV style='BORDER-RIGHT: #455690 1px solid; BORDER-TOP: #a6b4cf 1px solid; Z-INDEX: 99999; LEFT: 0px; BORDER-LEFT: #a6b4cf 1px solid; WIDTH: " + w + "px; BORDER-BOTTOM: #455690 1px solid; POSITION: absolute; TOP: 0px; HEIGHT: " + h + "px; BACKGROUND-COLOR: #c9d3f3'>"
    str += "<TABLE style='BORDER-TOP: #ffffff 1px solid; BORDER-LEFT: #ffffff 1px solid' cellSpacing=0 cellPadding=0 width='100%' bgColor=#cfdef4 border=0>"
    str += "<TR>"
    str += "<TD style='FONT-SIZE: 12px;COLOR: #0f2c8c' width=30 height=24></TD>"
    str += "<TD style='PADDING-LEFT: 4px; FONT-WEIGHT: normal; FONT-SIZE: 12px; COLOR: #1f336b; PADDING-TOP: 4px' vAlign=center width='100%'>" + this.caption + "</TD>"
    str += "<TD style='PADDING-RIGHT: 2px; PADDING-TOP: 2px' vAlign=center align=right width=19>"
    str += "<SPAN title=关闭 style='FONT-WEIGHT: bold; FONT-SIZE: 12px; CURSOR: hand; COLOR: red; MARGIN-RIGHT: 4px' id='btSysClose' >×</SPAN></TD>"
    str += "</TR>"
    str += "<TR>"
    str += "<TD style='PADDING-RIGHT: 1px;PADDING-BOTTOM: 1px' colSpan=3 height=" + (h - 28) + ">"
    str += "<DIV style='BORDER-RIGHT: #b9c9ef 1px solid; PADDING-RIGHT: 8px; BORDER-TOP: #728eb8 1px solid; PADDING-LEFT: 8px; FONT-SIZE: 12px; PADDING-BOTTOM: 8px; BORDER-LEFT: #728eb8 1px solid; WIDTH: 100%; COLOR: #1f336b; PADDING-TOP: 8px; BORDER-BOTTOM: #b9c9ef 1px solid; HEIGHT: 100%'>" + this.title + "<BR><BR>"
    str += "<DIV style='WORD-BREAK: break-all' align=left><A href='javascript:void(0)' hidefocus=true id='btCommand'><FONT color=#ff0000>" + this.message + "</FONT></A></DIV>"
    str += "</DIV>"
    str += "</TD>"
    str += "</TR>"
    str += "</TABLE>"
    str += "</DIV>"

    oPopup.document.body.innerHTML = str;


    this.offset = 0;
    var me = this;

    oPopup.document.body.onmouseover = function() { me.pause = true; }
    oPopup.document.body.onmouseout = function() { me.pause = false; }

    var fun = function() {
        var x = me.left;
        var y = 0;
        var width = me.width;
        var height = me.height;

        if (me.offset > me.height) {
            height = me.height;
        } else {
            height = me.offset;
        }

        y = me.bottom - me.offset;
        if (y <= me.top) {
            me.timeout--;
            if (me.timeout == 0) {
                window.clearInterval(me.timer);
                if (me.autoHide) {
                    me.hide();
                }
            }
        } else {
            me.offset = me.offset + me.step;
        }
        me.Pop.show(x, y, width, height);

    }

    this.timer = window.setInterval(fun, this.speed)



    var btClose = oPopup.document.getElementById("btSysClose");

    btClose.onclick = function() {
        me.close = true;
        me.hide();
    }

    var btCommand = oPopup.document.getElementById("btCommand");
    btCommand.onclick = function() {
        me.oncommand();
    }
}
/**//* 
** 设置速度方法 
**/
CLASS_MSN_MESSAGE.prototype.speed = function(s) {
    var t = 20;
    try {
        t = praseInt(s);
    } catch (e) { }
    this.speed = t;
}
/**//* 
** 设置步长方法 
**/
CLASS_MSN_MESSAGE.prototype.step = function(s) {
    var t = 1;
    try {
        t = praseInt(s);
    } catch (e) { }
    this.step = t;
}

CLASS_MSN_MESSAGE.prototype.rect = function(left, right, top, bottom) {
    try {
        this.left = left != null ? left : this.right - this.width;
        this.right = right != null ? right : this.left + this.width;
        this.bottom = bottom != null ? (bottom > screen.height ? screen.height : bottom) : screen.height;
        this.top = top != null ? top : this.bottom - this.height;
    } catch (e) { }
} 