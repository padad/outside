/**
*创建名空间
*/
function createNameSpace(str) {
    var strs = str.split(".");
    var strT = strs[0];
    if (window[strT] == undefined) {
        window[strT] = new Object();
    }
    for (var i = 1; i < strs.length; i++) {
        if (eval(strT)[strs] == undefined) {
            eval(strT)[strs] = new Object();
        }
        strT += "." + strs;
    }
}
createNameSpace("specialtrade");
function HashTable() {
    this.Items = [];
    this.Count = function() { return this.Items.length; };        //长度                 
    this.DictionaryEntry = function(key, value) {
        this.Key = key || null;
        this.Value = value || null;
    }
    this.Add = function(key, value) { this.Items.push(new this.DictionaryEntry(key, value)); }
    this.Clear = function() { this.Items.length = 0; }
    this.Remove = function(key) {
        var index = this.GetIndexWithKey(key);
        if (index > -1)
            this.Items.splice(index, 1);
    }
    this.GetItem = function(key) {
        var index = this.GetIndexWithKey(key);
        if (index > -1)
            return this.Items[index];
    }
    this.GetValue = function(key) {
        var index = this.GetIndexWithKey(key);
        if (index > -1)
            return this.Items[index].Value;
    }
    this.SetValue = function(key, value) {
        if (this.ContainsKey(key)) {
            this.Remove(key);
        }
        this.Items.push(new this.DictionaryEntry(key, value));
    }
    this.ContainsKey = function(key) {
        if (this.GetIndexWithKey(key) > -1)
            return true;
        return false;
    }
    this.ContainsValue = function(value) {
        if (this.GetIndexWithValue(value) > -1)
            return true;
        return false;
    }
    this.Keys = function() {
        var iLen = this.Count();
        var resultArr = [];
        for (var i = 0; i < iLen; i++)
            resultArr.push(this.Items[i].Key);
        return resultArr;
    }
    this.Values = function() {
        var iLen = this.Count();
        var resultArr = [];
        for (var i = 0; i < iLen; i++)
            resultArr.push(this.Items[i].Value);
        return resultArr;
    }
    this.IsEmpty = function() { return this.Count() == 0; }
    this.GetIndexWithKey = function(key) {
        var iLen = this.Count();
        for (var i = 0; i < iLen; i++)
            if (this.Items[i].Key === key)
            return i;
        return -1;
    }
    this.GetIndexWithValue = function(value) {
        var iLen = this.Count();
        for (var i = 0; i < iLen; i++)
            if (this.Items[i].Value === value)
            return i;
        return -1;
    }
}
//判断浏览器是否ie
function isIE() { //ie? 
    try {
        if (window.navigator.userAgent.toLowerCase().indexOf("msie") >= 1)
            return true;
        else
            return false;
    }
    catch (err) {
        return false;
    }
}
//限制文本框输入字符长度
function textlen(textarea, label, len) {
    try {
        if (textarea.value.length >= len)
            textarea.value = (textarea.value.substring(0, len))
        if (label != null)
            label.innerText = len - textarea.value.length;
    }
    catch (e) {
        alert('已到达最大长度！');
    }
}
//限制文本框输入中英文绝对字符长度
function textlenCN(textarea, len, label) {
    try {
        if (textarea.value.lengthCN >= len)
            textarea.value = (textarea.value.substring(0, len))
        if (label != null)
            label.innerText = len - textarea.value.lengthCN;
    }
    catch (e) {
        return false;
    }
}
//显示遮罩层
function showMask(page) {    
    if (typeof (page) != 'object') {
        Mask = document.createElement("div");
        Mask.id = "MaskDiv";
        Mask.className = "DialogMask";
        document.body.appendChild(Mask);
        Mask.style.height = document.body.offsetHeight + "px";
    }
    else {
        Mask = page.createElement("div");
        Mask.id = "MaskDiv";
        Mask.className = "DialogMask";
        page.body.appendChild(Mask);
        Mask.style.height = parseInt(page.body.clientHeight) + parseInt(document.all ? "0" : "40") + "px";
    }

}
//关闭遮罩层
function closeMask(page) {
    if (typeof (page) != 'object') {
        Mask = document.getElementById("MaskDiv");
        if (Mask) {
            Mask.style.display = "none";
            document.body.removeChild(Mask);
        }
    }
    else {
        Mask = page.getElementById("MaskDiv");
        if (Mask) {
            Mask.style.display = "none";
            page.body.removeChild(Mask);
        }
    }
}
//图片加载并按比例缩小到合适大小
//<img src=""  width="80" height="80" onload="DownImage(this,80,80,0,0);">
function DownImage(ImgD, MaxWidth, MaxHeight, alignX, alignY) {
    alignX = alignX || 1;
    alignY = alignY || 1;
    var image = new Image();
    image.src = ImgD.src;
    if (image.width > 0 && image.height > 0) {
        var rate = (MaxWidth / image.width < MaxHeight / image.height) ? MaxWidth / image.width : MaxHeight / image.height;
        var wid = 0;
        var hid = 0;
        if (rate <= 1) {
            wid = ImgD.width = image.width * rate;
            hid = ImgD.height = image.height * rate;
        }
        else {
            wid = ImgD.width = image.width;
            hid = ImgD.height = image.height;
        }
        if (alignX == 1) {
            var ii = (MaxWidth - wid) / 2;
            ImgD.style.marginLeft = ImgD.style.marginRight = ii + "px";
        }
        if (alignY == 1) {
            var ii = (MaxHeight - hid) / 2;
            ImgD.style.marginTop = ImgD.style.marginBottom = ii + "px";
        }
    }
}
//图片加载并按比例缩小到合适大小
//<img src=""  width="80" onload="DownImage(this,80,0,0);">
function DownImageWidth(ImgD, MaxWidth, alignX, alignY) {
    alignX = alignX || 1;
    alignY = alignY || 1;
    var image = new Image();
    image.src = ImgD.src;
    if (image.width > 0 && image.height > 0) {
        var rate = MaxWidth / image.width;
        var wid = 0;
        var hid = 0;
        if (rate <= 1) {
            wid = ImgD.width = image.width * rate;
            hid = ImgD.height = image.height * rate;
        }
        else {
            wid = ImgD.width = image.width;
            hid = ImgD.height = image.height;
        }
    }
}
function ShowWithElementoffsetXY(ElementId, WithElementId, offsetX, offsetY) {
    var elem = getAbsoluteLocation(document.getElementById(ElementId));
    var welem = document.getElementById(WithElementId);
    welem.style.left = (elem.absoluteLeft + offsetX) + "px";
    welem.style.top = (elem.absoluteTop + offsetY) + "px";
}
//ie6下隐藏元素防遮挡浮动层
function hideElementAll() {
    HideElement("SELECT");
    //HideElement("OBJECT");
    //HideElement("IFRAME");
}
function showElementAll() {
    ShowElement("SELECT");
    //ShowElement("OBJECT");
    //ShowElement("IFRAME");
}
function HideElement(strElementTagName) {
    try {
        for (i = 0; i < window.document.getElementsByTagName(strElementTagName).length; i++) {
            var objTemp = window.document.getElementsByTagName(strElementTagName)[i];
            if (objTemp.id.indexOf("LoginHeader") == -1)
                objTemp.style.visibility = "hidden";
        }
    } catch (e) {
        alert(e.message);
    }
}
function ShowElement(strElementTagName) {
    try {
        for (i = 0; i < window.document.getElementsByTagName(strElementTagName).length; i++) {
            var objTemp = window.document.getElementsByTagName(strElementTagName)[i];
            objTemp.style.visibility = "visible";
        }
    } catch (e) {
        alert(e.message);
    }
}
//attach(window,"load",function(){alert('111')})
function attach(o, e, f) {
    if (document.attachEvent)
        o.attachEvent("on" + e, f);
    else if (document.addEventListener)
        o.addEventListener(e, f);
}
function tabs(Id, Ids, activeClass, normalClass) {
    for (var i = 0; i < Ids.length; i++) {
        if (Ids[i] == Id) {
            document.getElementById('tab' + Id).className = activeClass;
        }
        else {
            document.getElementById('tab' + Ids[i]).className = normalClass;
        }
    }
}
//tabpanel面板
//     var divIds1=["001001003005001","001001003005002","001001003005003","001001003005004","001001003005005"];
//     var divIds2=["001001003006001","001001003006002","001001003006003","001001003006004"];
//<a id="span001001003005001" class="ac_span" href="javascript:displayDiv('001001003005001',divIds1,'ac_span','');"></a>
//<div id="div001001003005001"></div>
function tabpanels(Id, Ids, activeClass, normalClass) {
    for (var i = 0; i < Ids.length; i++) {
        if (Ids[i] == Id) {
            document.getElementById('div' + Id).style.display = 'block';
            document.getElementById('span' + Id).className = activeClass;
        }
        else {
            document.getElementById('div' + Ids[i]).style.display = 'none';
            document.getElementById('span' + Ids[i]).className = normalClass;
        }
    }
}
function tabdisplay(Id, Ids) {
    for (var i = 0; i < Ids.length; i++) {
        if (Ids[i] == Id) {
            document.getElementById('div' + Id).style.display = 'block';
            document.getElementById('span' + Id).style.display = 'none';
        }
        else {
            document.getElementById('div' + Ids[i]).style.display = 'none';
            document.getElementById('span' + Ids[i]).style.display = 'block';
        }
    }
}
function tabnodisplay(Id, Ids) {
    for (var i = 0; i < Ids.length; i++) {
        if (Ids[i] == Id) {
            document.getElementById('div' + Id).style.display = 'none';
            document.getElementById('span' + Id).style.display = 'block';
        }
        else {
            document.getElementById('div' + Ids[i]).style.display = 'none';
            document.getElementById('span' + Ids[i]).style.display = 'block';
        }
    }
}
function changeclass(Id, Class) {
    document.getElementById(Id).style.classname = Class;
}
//JSON2
if (!this.JSON) {
    JSON = function() {
        function f(n) {
            return n < 10 ? '0' + n : n;
        }
        Date.prototype.toJSON = function(key) {

            return this.getUTCFullYear() + '-' +
                 f(this.getUTCMonth() + 1) + '-' +
                 f(this.getUTCDate()) + 'T' +
                 f(this.getUTCHours()) + ':' +
                 f(this.getUTCMinutes()) + ':' +
                 f(this.getUTCSeconds()) + 'Z';
        };
        String.prototype.toJSON =
        Number.prototype.toJSON =
        Boolean.prototype.toJSON = function(key) {
            return this.valueOf();
        };
        var cx = /[\u0000\u00ad\u0600-\u0604\u070f\u17b4\u17b5\u200c-\u200f\u2028-\u202f\u2060-\u206f\ufeff\ufff0-\uffff]/g,
            escapeable = /[\\\"\x00-\x1f\x7f-\x9f\u00ad\u0600-\u0604\u070f\u17b4\u17b5\u200c-\u200f\u2028-\u202f\u2060-\u206f\ufeff\ufff0-\uffff]/g,
            gap,
            indent,
            meta = {
                '\b': '\\b',
                '\t': '\\t',
                '\n': '\\n',
                '\f': '\\f',
                '\r': '\\r',
                '"': '\\"',
                '\\': '\\\\'
            },
            rep;
        function quote(string) {
            escapeable.lastIndex = 0;
            return escapeable.test(string) ?
                '"' + string.replace(escapeable, function(a) {
                    var c = meta[a];
                    if (typeof c === 'string') {
                        return c;
                    }
                    return '\\u' + ('0000' +
                            (+(a.charCodeAt(0))).toString(16)).slice(-4);
                }) + '"' :
                '"' + string + '"';
        }
        function str(key, holder) {
            var i,
                k,
                v,
                length,
                mind = gap,
                partial,
                value = holder[key];
            if (value && typeof value === 'object' &&
                    typeof value.toJSON === 'function') {
                value = value.toJSON(key);
            }
            if (typeof rep === 'function') {
                value = rep.call(holder, key, value);
            }
            switch (typeof value) {
                case 'string':
                    return quote(value);
                case 'number':
                    return isFinite(value) ? String(value) : 'null';
                case 'boolean':
                case 'null':
                    return String(value);
                case 'object':
                    if (!value) {
                        return 'null';
                    }
                    gap += indent;
                    partial = [];
                    if (typeof value.length === 'number' &&
                        !(value.propertyIsEnumerable('length'))) {
                        length = value.length;
                        for (i = 0; i < length; i += 1) {
                            partial[i] = str(i, value) || 'null';
                        }
                        v = partial.length === 0 ? '[]' :
                        gap ? '[\n' + gap +
                                partial.join(',\n' + gap) + '\n' +
                                    mind + ']' :
                              '[' + partial.join(',') + ']';
                        gap = mind;
                        return v;
                    }
                    if (rep && typeof rep === 'object') {
                        length = rep.length;
                        for (i = 0; i < length; i += 1) {
                            k = rep[i];
                            if (typeof k === 'string') {
                                v = str(k, value);
                                if (v) {
                                    partial.push(quote(k) + (gap ? ': ' : ':') + v);
                                }
                            }
                        }
                    } else {
                        for (k in value) {
                            if (Object.hasOwnProperty.call(value, k)) {
                                v = str(k, value);
                                if (v) {
                                    partial.push(quote(k) + (gap ? ': ' : ':') + v);
                                }
                            }
                        }
                    }
                    v = partial.length === 0 ? '{}' :
                    gap ? '{\n' + gap + partial.join(',\n' + gap) + '\n' +
                            mind + '}' : '{' + partial.join(',') + '}';
                    gap = mind;
                    return v;
            }
        }
        return {
            stringify: function(value, replacer, space) {
                var i;
                gap = '';
                indent = '';
                if (typeof space === 'number') {
                    for (i = 0; i < space; i += 1) {
                        indent += ' ';
                    }
                } else if (typeof space === 'string') {
                    indent = space;
                }
                rep = replacer;
                if (replacer && typeof replacer !== 'function' &&
                        (typeof replacer !== 'object' ||
                         typeof replacer.length !== 'number')) {
                    throw new Error('JSON.stringify');
                }
                return str('', { '': value });
            },
            parse: function(text, reviver) {
                var j;
                function walk(holder, key) {
                    var k, v, value = holder[key];
                    if (value && typeof value === 'object') {
                        for (k in value) {
                            if (Object.hasOwnProperty.call(value, k)) {
                                v = walk(value, k);
                                if (v !== undefined) {
                                    value[k] = v;
                                } else {
                                    delete value[k];
                                }
                            }
                        }
                    }
                    return reviver.call(holder, key, value);
                }
                cx.lastIndex = 0;
                if (cx.test(text)) {
                    text = text.replace(cx, function(a) {
                        return '\\u' + ('0000' +
                                (+(a.charCodeAt(0))).toString(16)).slice(-4);
                    });
                }
                if (/^[\],:{}\s]*$/.
test(text.replace(/\\(?:["\\\/bfnrt]|u[0-9a-fA-F]{4})/g, '@').
replace(/"[^"\\\n\r]*"|true|false|null|-?\d+(?:\.\d*)?(?:[eE][+\-]?\d+)?/g, ']').
replace(/(?:^|:|,)(?:\s*\[)+/g, ''))) {
                    j = eval('(' + text + ')');
                    return typeof reviver === 'function' ?
                        walk({ '': j }, '') : j;
                }
                throw new SyntaxError('JSON.parse');
            }
        };
    } ();
}
//一维数组的排序
// type 参数 
// 0 字母顺序（默认） 
// 1 大小 比较适合数字数组排序
// 2 拼音 适合中文数组
// 3 乱序 有些时候要故意打乱顺序，呵呵
// 4 带搜索 str 为要搜索的字符串 匹配的元素排在前面
Array.prototype.SortBy = function(type, str) {
    switch (type) {
        case 0: this.sort(); break;
        case 1: this.sort(function(a, b) { return a - b; }); break;
        case 2: this.sort(function(a, b) { if (a.length > b.length) return 1; else if (a.length == b.length) return a.localeCompare(b); else return -1; }); break;
        case 3: this.sort(function() { return Math.random() > 0.5 ? -1 : 1; }); break;
        case 4: this.sort(function(a, b) { return a.indexOf(str) == -1 ? 1 : -1; }); break;
        default: this.sort();
    }
}
Array.prototype.Exist = function(str) {
    if (this.length == 0)
        return false;
    for (var i = 0; i < this.length; i++) {
        if (this[i] == str)
            return true;
    }
    return false;
}
String.prototype.Exist = function(str) {
    if (this.length == 0)
        return false;
    for (var i = 0; i < this.length; i++) {
        if (this[i] == str)
            return true;
    }
    return false;
}

String.prototype.lengthCN = function() {
    return this.replace(/[^\x00-\xff]/g, "**").length;
};
//window.onerror=function(sErr,sSrc,nLine){
//    var oFun=window.onerror.caller
//    var sMsg=sErr+"\n"
//    sMsg+="位于"+sSrc+"\n"
//    sMsg+="第"+nLine+"行\n"
//    if(!oFun){
//        sMsg+="未捕获到源函数(函数外错误或非IE)"
//    }
//    while(oFun!=null){
//        var oArgs=oFun.arguments;
//        var sArgs=""
//        for(var i=0;i<oArgs.length;i++){
//            sArgs += (sArgs!=""?",":"")+oArgs[i];
//        }
//        
//        sMsg+="实参:"+sArgs+"\n";
//        sMsg+=oFun+"\n";
//        oFun=oFun.caller;
//    }
//    alert(sMsg);
//    return true;
//}
function openWindow(url, title, prams, returnEvent) {
    if (window.showModalDialog != null)//IE判断
    {
        var returnValue = window.showModalDialog(url, title, prams);
        if (returnValue != null) {
            returnEvent(returnValue);
        }
        return;
    }
    else {
        this.returnAction = function(returnValue) {
            if (returnValue != null) {
                returnEvent(returnValue);
            }
        }
        window.open(url, title, prams);
        return;
    }
}


