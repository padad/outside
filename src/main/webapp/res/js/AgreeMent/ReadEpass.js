function SubLand() {
    if (isReadEpass == 'isTrue') {
        if (document.getElementById('txtSeriNo').value == '') {
            return readEPass();
        }
        return true;
    }
    return true;
}
var bErr = false;
var Err = new Error();
var Digest = "01234567890123456"
function readEPass() {
    var validate = true;
    try {
        ePass.GetLibVersion();
    }
    catch (e) {
        document.activeElement.id = '';
        alert('提示：请安装系统所需软件！');
        frames['isSecure'].location.href = 'script/setup.exe';
        document.getElementById('lbMsg').innerHTML = "<a href='script/setup.exe' style=\"color: Red;\">点击此处手动下载安装软件</a>";
        validate = false;
        return validate;
    }
    if (Err.number == 0x1B6) {
        document.getElementById('lbMsg').innerHTML = "密钥检测失败";
        validate = false;
        return validate;
    }
    else {

        //ePass1000ND打开设备！
        try {
            ePass.OpenDevice(1, "");
            //获取ePass1000ND的唯一硬件串号				
            //var results;
            results = "01234567890123456";
            results = ePass.GetStrProperty(7, 0, 0);
            //alert(results);
            document.getElementById('txtSeriNo').value = results;
            validate = (results != "");
        }
        catch (e) {
            //alert("打开中华粮网网上交易密钥失败！");
            document.getElementById('lbMsg').innerHTML = "密钥检测失败";
            validate = false;
            return validate;
        }
        finally {
            ePass.CloseDevice();
        }


    }

    return validate;
}
          
