Date.prototype.add = function(datepart, number, returnNewObjec) {
    ///<summary> 
    ///日期加减。 
    ///若returnNewObjec参数为true值，则操作结果由一个新的日期对象返回，原日期对象不变， 
    ///否则返回的是原日期对象,此时原日期对象的值是操作结果. 
    ///</summary> 
    ///<param name="datepart" type="string"> 
    ///日期加减的部分: 
    ///Year, yy, yyyy--年 
    ///quarter, qq, q --季 
    ///Month, mm, m -- 月 
    ///dayofyear, dy, y-- 日 
    ///Day, dd, d -- 日 
    ///Week, wk, ww -- 周 
    ///Hour, hh -- 小时 
    ///minute, mi, n -- 分钟 
    ///second, ss, s -- 秒 
    ///millisecond, ms -- 毫秒 
    ///</param> 
    ///<param name="number" type="int"> 
    ///要加减的数量 
    ///</param> 
    ///<param name="returnNewObjec" type="bool"> 
    ///是否返回新的日期对象。若参数为true值，则返回一个新的日期对象，否则返回的是当前日期对象. 
    ///</param> 
    ///<returns type="Date"> 
    ///返回一个日期对象 
    ///</returns> 
    var regExp = /^\d+$/;
    if (regExp.test(number)) {
        number = parseInt(number);
    }
    else { number = 0; }
    datepart = datepart.toLowerCase();
    var tDate;
    if (typeof (returnNewObjec) == "boolean") {
        if (returnNewObjec == true) {
            tDate = new Date(this);
        }
        else { tDate = this; }
    }
    else { tDate = this; }
    switch (datepart) {
        case "year":
        case "yy":
        case "yyyy":
            tDate.setFullYear(this.getFullYear() + number);
            break;
        case "quarter":
        case "qq":
        case "q":
            tDate.setMonth(this.getMonth() + (number * 3));
            break;
        case "month":
        case "mm":
        case "m":
            tDate.setMonth(this.getMonth() + number);
            break;
        case "dayofyear":
        case "dy":
        case "y":
        case "day":
        case "dd":
        case "d":
            tDate.setDate(this.getDate() + number);
            break;
        case "week":
        case "wk":
        case "ww":
            tDate.setDate(this.getDate() + (number * 7));
            break;
        case "hour":
        case "hh":
            tDate.setHours(this.getHours() + number);
            break
        case "minute":
        case "mi":
        case "n":
            tDate.setMinutes(this.getMinutes() + number);
            break
        case "second":
        case "ss":
        case "s":
            tDate.setSeconds(this.getSeconds() + number);
            break;
        case "millisecond":
        case "ms":
            tDate.setMilliseconds(this.getMilliseconds() + number);
            break;
    }
    return tDate;
}


function ShowTime() {
    var timeObj = document.getElementById("lbTime");
    var v_str = '2000/01/01' + ' ' + timeObj.innerHTML;
    
    var v_hh = "";
    var v_mi = "";
    var v_ss = "";
    var v_datetime = new Date(v_str);
    v_datetime.add('ss', 1, false);

    if (v_datetime.getHours() < 10) {
        v_hh = "0" + v_datetime.getHours();
    }
    else {
        v_hh = v_datetime.getHours();
    }

    if (v_datetime.getMinutes() < 10) {
        v_mi = "0" + v_datetime.getMinutes();
    }
    else {
        v_mi = v_datetime.getMinutes();
    }

    if (v_datetime.getSeconds() < 10) {
        v_ss = "0" + v_datetime.getSeconds();
    }
    else {
        v_ss = v_datetime.getSeconds();
    }

    timeObj.innerText = v_hh + ":" + v_mi + ":" + v_ss;

    //alert(v_datetime);
    LoadTime();
}

function LoadTime() {
    setTimeout("ShowTime()", 1000);
}