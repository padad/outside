<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>管理系统</title>
    <link href="res/css/platform/Loading.css" rel="stylesheet" type="text/css" />
    <link href="res/css/platform/css.css" rel="stylesheet" type="text/css" />
    <link href="res/js/ext/resources/css/ext-all.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="res/css/platform/Stylepop.css" />
    <script type="text/javascript">
        rootsid = "001";
    </script>

    <script src="res/js/ext/adapter/ext/ext-base.js" type="text/javascript"></script>

    <script src="res/js/ext/ext-all.js" type="text/javascript"></script>

    <script src="res/js/frame/ALLEvents.js" type="text/javascript"></script>

    <script src="res/js/frame/Main.js" type="text/javascript"></script>

    <script type="text/javascript">

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
            var v_str = '2000/01/01' + ' ' + document.getElementById('lbTime').innerText;

            var v_hh = "";
            var v_mi = "";
            var v_ss = "";
            var v_datetime = new Date('2000/01/01' + ' ' + document.getElementById('lbTime').innerText);

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

            document.getElementById('lbTime').innerText = v_hh + ":" + v_mi + ":" + v_ss;

            //alert(v_datetime);
            LoadTimer();
        }

        function LoadTimer() {
            setTimeout("ShowTime()", 1000);
        }
        function loaduser() {
        }


    </script>

</head>
<body onload="LoadTimer();loading();">
<form id="form1">

    <div id="loading">
        <div class="loading-indicator">
            <img src="res/images/framework/extanim32.gif" alt="" width="32" height="32" style="margin-right: 8px;"
                 align="absmiddle" />
            加载中......
        </div>
    </div>
    <div id="loading-mask">
    </div>
    <div id="top" class="fiterall">
        <table width="100%" border="0" cellspacing="0" cellpadding="0" style="background: url(res/images/framework/top_bg.jpg) repeat-x;
            background-attachment: inherit; background-position: center;">
            <tr valign="top">
                <td style="background: url(res/images/framework/top_bg.jpg) repeat; border: 0px;">
                    <div class="zi1">
                        <label ID="lbDate" runat="server" Text=""></label>&nbsp;
                        <label ID="lbWeek" runat="server" Text=""></label>&nbsp;
                        <labell ID="lbTime" runat="server" Text=""></label>
                    </div>
                </td>
                <td width="77" style="border:0px;"><a href="#" id="laHref"><img style="border:0px;margin:0px;padding:0px;" src="res/images/framework/help.gif" width="77" height="92" /></a></td>
                <td width="72" style="border:0px;"><a href="loginout.aspx"><img src="res/images/framework/anni02.jpg" width="72" height="92" style="border:0px;margin:0px;padding:0px;" /></td>
                <td width="20" align="right" style="padding-right:5px;padding-top:55px;border:0px;"><span style="text-align:right;">
                            <a href="javascript:void(0);" onmouseover="imgCollapse.src='res/images/head/02.gif';" onmouseout="imgCollapse.src='res/images/head/01.gif';" onclick="north.collapse(true);"><img id="imgCollapse" src="res/images/head/01.gif" /></a></span></td>
            </tr>
        </table>
    </div>
    <div style="display: block; padding-top: 5px;" id="botton" class="bottonall">
        <b>2010&nbsp;&nbsp; padad_erp System,Inc.</b>
    </div>
</form>
</body>
</html>