function checkLogin(upObj) {
    var uname = $('#pf_user').val();
    var upass = $('#pf_pw').val();
    if ("" != uname && "" != upass) {
        var obj = new cngrain('../LoginAjax.aspx', 'uname=' + uname + '&upass=' + upass + "&upObj=" + upObj + "&action=memberLogin", "POST", "json");
        obj.AjaxControl();
    } else {
        alert('请填写用户名和密码！');
    }
}