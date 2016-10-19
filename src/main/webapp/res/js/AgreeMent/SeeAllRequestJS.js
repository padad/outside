
//实时刷新
$(function() {
    setInterval(load, 5000);
});

//添加时刷新
function load() {
    function OnSuccess(result) {
        html = result;
        $("#hellotest li:eq(0)").after(html);
    }
    $.ajax({ type: "POST", url: "Service/ServerData.ashx", data: "m=test", success: OnSuccess });
}