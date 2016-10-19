var bErr = false;
var Err = new Error();
var Digest = "01234567890123456"

//var Epass = document.getElementById('ePass');

function readEPass() {

   //获得ePass1000ND的应用程序版本
   ePass.GetLibVersion();
   
   if (Err.number == 0x1B6) {
      alert("产生未知错误，获得应用程序版本号失败！")
   }
   else {
      var i = 0
      for (i = 0; i < 5; i++) {
         readDevice(i);
      }

   }
}

//读取第i个Epass设备
function readDevice(i) {
   //var Epass = document.getElementById('ePass');

   var objStatus = document.getElementById("txtStatus" + i);
   var objCardNo = document.getElementById("txtCardNo" + i);
   var objSendStatus = document.getElementById("txtSendStatus" + i);
   var objOwner = document.getElementById("txtOwner" + i);
   objStatus.value = "尚未插入身份证";
   objCardNo.value = "";
   objSendStatus.value = "";
   objOwner.value = "";

   var ret = Digest;
   try {
      if (i=="0")
         ePass.OpenDevice(1, "");
      else
         ePass.OpenDevice(0, "");

      ret = ePass.GetStrProperty(7, 0, 0);

      if (ret != "") {
         objStatus.value = "已插入身份证";
         objCardNo.value = ret;
      }

      bErr = true;
   }
   catch (e) {
      //window.alert("打开ePass1000ND失败！");
      //validate = false;
   }
   finally {
      ePass.CloseDevice();
     
   }

}

function btnGetEpass_onclick() {
   readEPass();
}