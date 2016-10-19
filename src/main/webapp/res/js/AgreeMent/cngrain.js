function cngrain(url, param, type, resultType) {
    this.url = url;
    this.param = param;
    this.type = type;
    this.resultType = resultType;
}
cngrain.prototype = {
    AjaxControl: function() {
        $.ajax({
            type: this.type,
            url: this.url + '?a=' + Math.random(),
            data: this.param,
            dataType: this.resultType,
            success: function(msg) {
                switch (msg.result) {
                    case "noLogin":
                        {
                            alert('您还没有登录，请先登录！');
                            break;
                        }
                    case "noFocus":
                        {
                            $('#pf_tbl_wrap').html("");
                            break;
                        }
                    case "delSuccess":
                        {
                            setShowOrHide();
                            break;
                        }
                    case "error":
                        {
                            alert('用户不存在或被禁用！');
                            break;
                        }
                    case "success":
                        {
                            setLoginInfo(msg.userName);
                            setShowOrHide();
                            break;
                        }
                    case "exitLogin": 
                        {
                            exitLoginControl();
                            break;
                        }
                }
            },
            error: function(msg) {
                alert("删除用户失败！");
            }
        });
    }
}

function setLoginInfo(fullName) {

    $('#spanTopUserLogin').hide();
    $('#spanUserInfo').html('欢迎您：' + fullName + "&nbsp;&nbsp;<a href='Main.aspx'>进入用户中心</a>");
    $('#spanUserInfo').show();
    $('#pf_logout').show();
    $('#pf_login').hide(); // 隐藏登录
}
//设置Div部分的可见
function setShowOrHide() {
    json2.GetDate();
    //setInterval("json2.GetPartData()", 1000);

    $('#pf_tbl_wrap').show();
}

// 退出登录后操作
function exitLoginControl() {
    $('#spanTopUserLogin').show();
    $('#pf_logout').hide();
    $('#spanUserInfo').hide();
    $('#pf_login').show(); // 隐藏登录

    $('#pf_tbl_wrap').hide();
}