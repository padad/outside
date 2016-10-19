//设置焦点样式 type:1为获得焦点 0 为失去焦点
function setFocusClass(objName, type) {
    if (objName != '') {
        if (type == 1) {
            $('#' + objName).attr("class", "x-form-focus");
            if ($('#' + objName).next().attr("class") == "x-form-invalid-icon")
                $('#' + objName).next().remove();
        }
        else
            $('#' + objName).attr("class", "x-form-text");
    }
}
//设置错误样式 type:1为添加错误 0 为删除错误
function setErrorClass(objName, type, message) {
    
    if (objName != '') {
        if (type == 1) {
            if ($('#' + objName).next().attr("class") != "x-form-invalid-icon") {
                $('#' + objName).attr("class", "x-form-invalid");
                $('#' + objName).after('<span class="x-form-invalid-icon"></span>');
                if ($('#' + objName).next().attr("class") == "x-form-invalid-icon")
                    $('#' + objName).next().html(message);
            }
        }
        else {
            $('#' + objName).attr("class", "x-form-text");
            if ($('#' + objName).next().attr("class") == "x-form-invalid-icon")
                $('#' + objName).next().remove();
        }
    }
}

function BASEisNotFloat(theFloat) {
    //判断是否为浮点数
    len = theFloat.length;
    dotNum = 0;
    if (len == 0)
        return true;
    for (var i = 0; i < len; i++) {
        oneNum = theFloat.substring(i, i + 1);
        if (oneNum == ".")
            dotNum++;
        if (((oneNum < "0" || oneNum > "9") && oneNum != ".") || dotNum > 1)
            return true;
    }
    if (len > 1 && theFloat.substring(0, 1) == "0") {
        if (theFloat.substring(1, 2) != ".")
            return true;
    }
    return false;
}

function BASEisNotNum(theNum) {
    //判断是否为数字
    if (theNum.trim() == "")
        return false;
    for (var i = 0; i < theNum.length; i++) {
        oneNum = theNum.substring(i, i + 1);
        if (oneNum < "0" || oneNum > "9")
            return true;
    }
    return false;
}

function checkMail(str) {
    var strReg = "";
    var r;
    var strText = str;
    strReg = /^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/i;


    r = strText.search(strReg);
    if (r == -1)
        return false //错误
    else return true;
}

function isLaterDate(d) {//和当前日期比较
    try {
        var now = new Date();
        var dateArr = d.split("-");
        var arrLen = dateArr.length;

        now.setFullYear(now.getYear(), now.getMonth(), now.getDate());

        var checkDate = new Date();
        checkDate.setFullYear(dateArr[0], dateArr[1] - 1, dateArr[2]);

        var nowTime = now.getTime();
        var checkTime = checkDate.getTime();

        if (nowTime < checkTime) {
            return true;
        } else {
            return false;
        }
    } catch (e) { return false; }
}

function isLaterDate_tow(d, d1) {//比较两个日期
    try {
        var dateArr = d.split("-");
        var arrLen = dateArr.length;

        var dateArr1 = d1.split("-");
        var arrLen1 = dateArr1.length;

        var now = new Date();
        now.setFullYear(dateArr1[0], dateArr1[1] - 1, dateArr1[2]);

        var checkDate = new Date();
        checkDate.setFullYear(dateArr[0], dateArr[1] - 1, dateArr[2]);

        var nowTime = now.getTime();
        var checkTime = checkDate.getTime();

        if (nowTime <= checkTime) {
            return true;
        } else {
            return false;
        }
    } catch (e) { return false; }
}

function clearinp()//清空所以输入框
{
    inp = document.getElementsByTagName("input");
    for (var i = 0; i < inp.length; i++) {
        if (inp[i].type == "text") {
            inp[i].value = "";
        }
    }
    return false;
}

function checkall(id, kind)//全选(kind可以是checkbox或者radio)
{
    checkbox = document.getElementById(id).getElementsByTagName("input");
    for (var i = 0; i < checkbox.length; i++) {
        if (checkbox[i].type == kind)
            checkbox[i].checked = true;
    }
}


function checknotall(id, kind)//反选(kind可以是checkbox或者radio)
{
    checkbox = document.getElementById(id).getElementsByTagName("input");
    for (var i = 0; i < checkbox.length; i++) {
        if (checkbox[i].type == kind)
            checkbox[i].checked = false;
    }
}

/*
数字控制
1.第一个输入必须是数字，不能是小数点。例如.111
2 不能存在多个.连续，只能一个。例如12....1
3 不多出现一个.在不同地方。例如12.1.1
*/
function clearNoNum(obj) {
    //先把非数字的都替换掉，除了数字和.
    obj.value = obj.value.replace(/[^\d.]/g, "");
    //必须保证第一个为数字而不是.
    obj.value = obj.value.replace(/^\./g, "");
    //保证只有出现一个.而没有多个.
    obj.value = obj.value.replace(/\.{2,}/g, ".");
    //保证.只出现一次，而不能出现两次以上
    obj.value = obj.value.replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
}
 
