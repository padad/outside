function checkLogins() {
    var uname = $('#pf_user').val();
    var upass = $('#pf_pw').val();
    if ("" != uname && "" != upass) {
        $.ajax({
            type: 'POST',
            url: 'LoginAjax.aspx',
            data: 'uname=' + uname + '&upass=' + upass,
            dataType: "html",
            success: function(msg) {
                if (msg == 'error') {
                    alert('用户不存在或被禁用！');
                } else {
                    $('#pf_login').hide();      // 隐藏登录
                    initMemberFocus();          // 加载用户关注
                    $('#pf_tbl_wrap').show();   // 显示用户关注列表
                }
            }
        });
    } else {
        alert('请填写用户名和密码！');
    }
}

function initMemberFocus() {
    $.ajax({
        type: 'POST',
        url: '../../../Data/RequestInfo.ashx',
        data: 'cmd=focusrequest',
        dataType: 'json',
        error: function(dataMsg) {
            alert('error');
        },
        success: function(dataMsg) {
            alert('xx');
            var tbody = document.getElementById('tbMemberFocus');
            for (m = 0; m < dataMsg.Table1.Rows.length; m++) {
                var t_row = tbody.insertRow(m);
                 
                var t_ra = t_row.insertCell(0);
                t_ra.innerHTML = dataMsg.Table1.Rows[m].ra;

                var t_pz = t_row.insertCell(1);
                t_pz.innerHTML = dataMsg.Table1.Rows[m].pz;

                var t_dj = t_row.insertCell(2);
                t_dj.innerHTML = dataMsg.Table1.Rows[m].dj;

                var t_bs = t_row.insertCell(3);
                t_bs.innerHTML = dataMsg.Table1.Rows[m].bs;

                var t_jk = t_row.insertCell(4);
                t_jk.innerHTML = dataMsg.Table1.Rows[m].jk;

                var t_yy = t_row.insertCell(5);
                t_yy.innerHTML = dataMsg.Table1.Rows[m].yy;

                var t_cl = t_row.insertCell(6);
                t_cl.innerHTML = dataMsg.Table1.Rows[m].cl;

                var t_sy = t_row.insertCell(7);
                t_sy.innerHTML = dataMsg.Table1.Rows[m].sy;

                var t_zl = t_row.insertCell(8);
                t_zl.innerHTML = dataMsg.Table1.Rows[m].zl;

                var t_je = t_row.insertCell(9);
                t_je.innerHTML = dataMsg.Table1.Rows[m].je;

                var t_js = t_row.insertCell(10);
                t_js.innerHTML = dataMsg.Table1.Rows[m].js;

                var t_gl = t_row.insertCell(11);
                t_gl.innerHTML = '<a href="javascript:delRn(\'' + dataMsg.Table1.Rows[m].rn + '\');">删除</a>';

            }
        }
    });
}


var Top_Json = {
     _thead : 1,
	 _frame : "cnlts",
	 _param : {cmd:"wsxsrequest",sort:"ra",direct:"desc",size:"5",area:"",mm:""},
	 css : {up:"red",down:"green",highlight:"highlight",sortasc:"sort_down",sortdesc:"sort_up",pagediv:"pages",pagedisabled:"pagedisabled",pagecurr:"pagecurr"},
	 _css: "sort_up",
	 targetPage : "../Data/RequestInfo.ashx",
	 thead : "colorize",
	 aFields : [{
					f: "ra",
					t: "标的号",
					a: 1,
					info: "RnInfo.aspx",
					ty: "link",
					sf: "rn",
					css: "lf"
				 },{
					 f: "pz",
					 t: "品种",
					 a: 1,
					 ty: "text",
					 css: "ce"
				 },{
					 f: "dj",
					 t: "等级",
					 a: 1,
					 ty: "text",
					 css: "ce"
				 },{
					 f: "bs",
					 t: "买卖方向",
					 a: 1,
					 ty: "text",
					 css: "ce"
				 },{
					 f: "jk",
					 t: "今开",
					 a: 1,
					 ty: "text"
				 },{
					 f: "yy",
					 t: "最新邀约价",
					 a: 1,
					 ty: "text"
				 },{
					 f: "cl",
					 t: "最新承诺价",
					 a: 1,
					 ty: "text"
				 },{
					 f: "sy",
					 t: "剩余数量",
					 a: 1,
					 ty: "text"
				 },{
					 f: "zl",
					 t: "成交数量",
					 a: 1,
					 ty: "text"
				 },{
					 f: "je",
					 t: "成交金额/万元",
					 a: 1,
					 ty: "text"
				 },{
					 f: "rq",
					 t: "倒计时",
					 a: 1,
					 ty: "text",
					 css: "ce"
				 },{
				     f: "rn",
				     t: "收藏",
				     a: 0,
				     ty: "img",
				     src:"../res/images/showdemo/addto_p.gif",
				     funct: "addFocus",
				     css: "ce"
				 }]
}
var HomePage_Json = {
     _thead : 1,
	 _frame : "cnlts",
	 _param : {cmd:"wsxsrequest",sort:"ra",direct:"desc",size:"5",area:"",mm:""},
	 css : {up:"red",down:"green",highlight:"highlight",sortasc:"sort_down",sortdesc:"sort_up",pagediv:"pages",pagedisabled:"pagedisabled",pagecurr:"pagecurr"},
	 _css: "sort_up",
	 targetPage : "../Data/RequestInfo.ashx",
	 thead : "colorize",
	 aFields : [{
					f: "ra",
					t: "标的号",
					a: 1,
					ty: "text",
					css: "lf"
				 },{
					 f: "pz",
					 t: "品种",
					 a: 1,
					 ty: "text",
					 css: "ce"
				 },{
					 f: "dj",
					 t: "等级",
					 a: 1,
					 ty: "text",
					 css: "ce"
				 },{
					 f: "bs",
					 t: "买卖方向",
					 a: 1,
					 ty: "text",
					 css: "ce"
				 },{
					 f: "jk",
					 t: "今开",
					 a: 1,
					 ty: "text"
				 },{
					 f: "yy",
					 t: "最新邀约价",
					 a: 1,
					 ty: "text"
				 },{
					 f: "cl",
					 t: "最新承诺价",
					 a: 1,
					 ty: "text"
				 },{
					 f: "sy",
					 t: "剩余数量",
					 a: 1,
					 ty: "text"
				 },{
					 f: "zl",
					 t: "成交数量",
					 a: 1,
					 ty: "text"
				 },{
					 f: "je",
					 t: "成交金额/万元",
					 a: 1,
					 ty: "text"
				 },{
					 f: "rq",
					 t: "截止日期",
					 a: 1,
					 ty: "text",
					 css: "ce"
				 },{
				     f: "rn",
				     t: "收藏",
				     a: 0,
				     ty: "img",
				     src:"../res/images/showdemo/addto_p.gif",
				     funct: "addFocus",
				     css: "ce"
				 },{
				     f: "rn",
				     t: "下单",
				     a: 0,
				     ty: "img",
				     src:"../res/images/showdemo/addto_p.gif",
				     funct: "answerRequest",
				     css: "ce"
				 }]
}
var Tol_Json = {
     _thead : 1,
	 _frame : "tol",
	 _param : {cmd:"stat",sort:"issd",direct:"desc",size:"5",area:"",mm:""},
	 css : {up:"red",down:"green",highlight:"highlight",sortasc:"sort_down",sortdesc:"sort_up",pagediv:"pages",pagedisabled:"pagedisabled",pagecurr:"pagecurr"},
	 _css: "sort_up",
	 targetPage : "../Data/RequestInfo.ashx",
	 thead : "colorize",
	 aFields : [{
					f: "id",
					t: "序列号",
					a: 0,
					ty: "text",
					css: "ce"
				 },{
					 f: "pz",
					 t: "品种",
					 a: 0,
					 ty: "text",
					 css: "ce"
				 },{
					 f: "dj",
					 t: "等级",
					 a: 0,
					 ty: "text",
					 css: "ce"
				 },{
					 f: "kmax",
					 t: "开盘最高价",
					 a: 0,
					 ty: "text"
				 },{
					 f: "kmin",
					 t: "开盘最低价",
					 a: 0,
					 ty: "text"
				 },{
					 f: "kavg",
					 t: "开盘均价",
					 a: 0,
					 ty: "text"
				 },{
					 f: "cmax",
					 t: "成交最高价",
					 a: 0,
					 ty: "text"
				 },{
					 f: "cmin",
					 t: "成交最低价",
					 a: 0,
					 ty: "text"
				 },{
					 f: "cavg",
					 t: "成交均价",
					 a: 0,
					 ty: "text"
				 },{
					 f: "cnum",
					 t: "成交量",
					 a: 0,
					 ty: "text"
				 },{
					 f: "cmoney",
					 t: "成交金额",
					 a: 0,
					 ty: "text"
				 },{
				     f: "cper",
				     t: "成交率",
				     a: 0,
				     ty: "text"
				 }]
}   
var Self_Json = {
     _thead : 1,
	 _frame : "pf_tbl_wraps",                                      //要添加的容器
	 _param : {cmd:"focusrequest",sort:"jkesxs",direct:"asc",type:"0",size:"5"},     //所要传递的参数
	 //css样式
	 css : {up:"red",down:"green",highlight:"highlight",sortasc:"sort_down",sortdesc:"sort_up",pagediv:"pages",pagedisabled:"pagedisabled",pagecurr:"pagecurr"},
	 _css : "sort_down",                                    //默认样式
	 targetPage: "../Data/RequestInfo.ashx",                           //传参的页面
	 thead : "colorize",                                    //单元格基本样式
	 //标题表
	 aFields : [{
					f: "ra",
					t: "标的号",
					a: 0,
					ty: "text",
					css: "lf"
				 },{
					 f: "pz",
					 t: "品种",
					 a: 0,
					 ty: "text",
					 css: "ce"
				 },{
					 f: "dj",
					 t: "等级",
					 a: 0,
					 ty: "text",
					 css: "ce"
				 },{
					 f: "bs",
					 t: "买卖方向",
					 a: 0,
					 ty: "text",
					 css: "ce"
				 },{
					 f: "jk",
					 t: "今开",
					 a: 0,
					 ty: "text"
				 },{
					 f: "yy",
					 t: "最新邀约价",
					 a:0,
					 ty: "text"
				 },{
					 f: "cl",
					 t: "最新承诺价",
					 a: 0,
					 ty: "text"
				 },{
					 f: "sy",
					 t: "剩余数量",
					 a: 0,
					 ty: "text"
				 },{
					 f: "zl",
					 t: "成交数量",
					 a: 0,
					 ty: "text"
				 },{
					 f: "je",
					 t: "成交金额/万元",
					 a: 0,
					 ty: "text"
				 },{
					 f: "js",
					 t: "倒计时",
					 a: 0,
					 ty: "text",
					 css: "ce"
				 },{
					 f: "rn",
					 t: "管理",
					 a: 0,
					 ty: "link",
					 funct: "delFocus",
					 css: "ce"
				 }]
}
//共用创建表格方法
function JSON(obj,newobj)
{
    var _t=this;
    var objs;
    var newobjs;
    this.objs = obj;
    this.newobjs = newobj;
    //获取初始Json数据
    this.GetDate = function()
    {
        $.ajax({
           type: 'POST',
           url: this.objs.targetPage + "?aa=" + Math.random(),
           data : this.objs._param,
           dataType: 'json',
	       success : function(json){
	            //创建表
	            _t.CreateTable(json.Table1.Rows);
	            _t.ChageCss();
	        }
        })
        setInterval(this.newobjs +".GetPartData()",1000);
    }
    //创建表
    this.CreateTable = function(json)
    {
        //获取表所在的容器
        var target = $("#"+this.objs._frame);
        
        
        //添加表框架
        if(this.objs._thead==0)
        {
            target.css("overflow-y","scroll");
            target.append("<table border=0 ><tbody>"+ _t.CreateButtom(json) +"</tbody></table>");
        }
        else
        {
            //清空容器
            target.empty();
            target.append("<table border=0 ><thead>"+ _t.CreateTop() +"</thead><tbody>"+ _t.CreateButtom(json) +"</tbody></table>");    
        }
        
    }
    //添加表头
    this.CreateTop = function()
    {
        var str="";
        var str1="";
        //根据参数添加单元格
        for(var x=0;x<this.objs.aFields.length;x++)
        {
            var cssStr="";
            //获取参数组
            var item = this.objs.aFields[x];
            //添加排序样式
            if(item.f == this.objs._param.sort) cssStr=this.objs._css;
            var title = typeof(item.t)=="undefined" ? "":item.t;
            var width = typeof(item.w)=="undefined" ? "":"width='"+item.w+"'";
            //是否有排序功能
            if(item.a == 1)
            {
                str1 += "<td "+ width +" class='"+ this.objs.thead +" "+ cssStr +"'><a href='javascript:"+ this.newobjs +".ChageClumn("+ (x+1) +")'>"+ title +"</a></td>";
            }
            else
            {
                str1 += "<td "+ width +" class='"+ this.objs.thead +" "+ cssStr +"'>"+ title +"</td>";
            }
        }
        str = "<tr>"+ str1 +"</tr>";
        return str;
    }
    //添加表主体
    this.CreateButtom = function(json){
        var str = "";
        //根据条数添加行
        $.each(json,function(i,item){
            //每行添加单元格
            str += "<tr>"+ _t.CreateDataTd(i,item) +"</tr>";
        })
        return str;
    }
    this.CreateDataTd = function(i, items) {
        var str = "";
        //根据参数添加单元格
        for (var x = 0; x < this.objs.aFields.length; x++) {
            var cssStr = "";
            //获取参数组
            var item = this.objs.aFields[x];
            //根据排序添加样式
            if (item.f == this.objs._param.sort) cssStr = this.objs._css;
            //添加内容
            //判断 是否存在标题
            var title = typeof (items[item.f]) == "undefined" ? "" : items[item.f];
            if (item.f == "bs") {
                if (title == "销售") {
                    title = "<font color='red'>" + title + "</font>";
                }
                else {
                    title = "<font color='green'>" + title + "</font>";
                }
            }
            var width = typeof (item.w) == "undefined" ? "" : "width='" + item.w + "'";
            var floatcss = typeof (item.css) == "undefined" ? "" : item.css;
            switch (item.ty) {
                case "text":
                    str += "<td " + width + " class='" + this.objs.thead + " " + cssStr + " " + floatcss + "'>" + title + "</td>";
                    break;
                case "img":
                    str += "<td " + width + " class='" + this.objs.thead + " " + cssStr + " " + floatcss + "''>" + '<a href="javascript:' + item.funct + '(\'' + items[item.f] + '\');"><img src=\'' + item.src + '\'/></a>' + "</td>";
                    break;
                case "link":
                    {
                        if (typeof (item.info) == "undefined") {
                            str += "<td " + width + " class='" + this.objs.thead + " " + cssStr + " " + floatcss + "''>" + "<a href='javascript:" + item.funct + "(\"" + title + "\")'> 删除</a>" + "</td>";
                        } else {
                            str += "<td " + width + " class='" + this.objs.thead + " " + cssStr + " " + floatcss + "''>" + "<a href='" + item.info + "?rnid=" + items[item.sf] + "'>" + items[item.f] + "</a>" + "</td>";
                        }

                        break;
                    }
            }
        }
        return str;
    }
    this.ChageCss = function(){
        //获取要添加单元格的行
         var target = $("#"+this.objs._frame+" table tbody tr");
         //添加样式alt
         target.addClass("alt");
         //鼠标移动添加over样式，鼠标移出移出样式over
         target.mouseover(function(){$(this).addClass("over");}).mouseout(function(){$(this).removeClass("over");});
    }
    //部分刷新
    this.GetJsonData = function(){
        this.objs._css = this.objs.css.sortdesc;
        $.ajax({
           type: 'POST',
           url: this.objs.targetPage + "?aa=" + Math.random(),
	       data : this.objs._param,
	       dataType : 'json',
	       success : function(json){
	            //创建表
	            _t.ChageButtom(json.Table1.Rows);
	        }
        })
    }
    //添加表主体
    this.ChageButtom = function(json){
        var tar = $("#"+this.objs._frame+" table tbody");
        tar.html("");
        var str = "";
        //根据条数添加行
        $.each(json,function(i,item){
            //每行添加单元格
            str += "<tr>"+ _t.CreateDataTd(i,item) +"</tr>";
        })
        if(str!=null)
        {
            tar.html(str);
        }
    }
    //部分获取
    this.GetPartData = function(){
        $.ajax({
           type: 'POST',
           url: this.objs.targetPage + "?aa=" + Math.random(),
	       data : this.objs._param,
	       dataType : 'json',
	       success : function(json){
	            //获取替换
	              $.each(json.Table1.Rows,function(i,item){
	                _t.refreshData(i,item);
	                });
	        }
        })
    }
    //部分替换
    this.refreshData = function(i,item){
        //根据参数数组
        for(var x=0;x<this.objs.aFields.length;x++)
        {
            var field = this.objs.aFields[x];
            //获取所要替换的单元格
            var targetTd = $("#"+ this.objs._frame + " table tbody tr:nth-child("+ (i+1) +") td:nth-child("+ (x+1) +")");
            //发生变化，改变单元格内容
           if(field.ty == "text")
            {
	            if(targetTd.text()!=item[field.f])
	            {
		            if(field.f == "bs")
		            {
			            if(item[field.f]=="销售")
			            {
				            targetTd.html("<font color='red'>"+item[field.f]+"</font>");
			            }
			            else
			            {
				            targetTd.html("<font color='green'>"+item[field.f]+"</font>");
			            }
		            }
		            else
		            {
		                targetTd.html(item[field.f]);
			            //targetTd.html("<font color='blue'>"+item[field.f]+"</font>");
		            }
	            }
	            else
	            {
	                //if(field.f!="bs")
	                //{
		                //targetTd.html(targetTd.text());
		            //}
	            }
            }
            if(field.ty == "link")
            {
                if(typeof (field.info) == "undefined")
                {
                    if(targetTd.find("a [href='javascript:"+ field.funct +"("+item[field.f]+")']").html()==null)
	                {
		                targetTd.find("a").removeAttr("href");
		                targetTd.find("a").attr("href","javascript:"+ field.funct +"("+item[field.f]+")");
	                }
                }
                else
                {
                    targetTd.html("");
                    targetTd.html("<a href = '"+ field.f +"?rnid="+item[field.sf]+"'>"+item[field.f]+"</a>");
                }
	            
            }
            if(field.ty == "img")
            {
	            if(targetTd.find("a [href='javascript:"+ field.funct +"("+item[field.f]+")']").html()==null)
	            {
		            targetTd.find("a").removeAttr("href");
		            targetTd.find("a").attr("href","javascript:"+ field.funct +"("+item[field.f]+")");
	            }
            }

        }
    }
    //列排序
    this.ChageClumn = function(num){
        //设置排序字段
        this.objs._param.sort = this.objs.aFields[ num - 1 ].f;
	    //判断是否包含排序样式
        if( $("#"+ this.objs._frame + " table tr td:nth-child("+ num +")").attr("class").indexOf(this.objs.css.sortasc)>=0)
        {
             $("#"+ this.objs._frame + " table tr td:nth-child("+ num +")").removeClass(this.objs.css.sortasc);
             $("#"+ this.objs._frame + " table tr td:nth-child("+ num +")").addClass(this.objs.css.sortdesc);
             this.objs._param.direct="desc";
        }
        else
        {
		    //判断是否包含排序样式
            if( $("#"+ this.objs._frame + " table tr td:nth-child("+ num +")").attr("class").indexOf(this.objs.css.sortdesc)>=0)
            {
                 $("#"+ this.objs._frame + " table tr td:nth-child("+ num +")").removeClass(this.objs.css.sortdesc);
                 $("#"+ this.objs._frame + " table tr td:nth-child("+ num +")").addClass(this.objs.css.sortasc);
                 this.objs._param.direct="asc";
            }
            else
            {
                //改变样式,首先清除所有排序样式
                 $("#"+ this.objs._frame + " table tr ."+this.objs.css.sortdesc).removeClass(this.objs.css.sortdesc);
                 $("#"+ this.objs._frame + " table tr ."+this.objs.css.sortasc).removeClass(this.objs.css.sortasc);
			     //为指定行添加默认排序样式
                 $("#"+ this.objs._frame + " table tr td:nth-child("+ num +")").addClass(this.objs._css);
                 this.objs._param.direct="desc";
            }
        }
        _t.GetPartData();
    }
    //设置显示行数
    this.ChagePage = function(num){
        //设置显示行数
        this.objs.pagetags = num;
        this.objs._param.size = num;
        //重新加载数据
        _t.GetDate();
    }
    //切换
    this.ChageTab = function(tar){
        this.objs._param.mm = tar;
        _t.GetJsonData();
    }
    this.ChageAare = function(areaId){
        this.objs._param.area = areaId;
        _t.GetJsonData();
    }
}



//地区省模板
var provinceTemplate = "{for p in Rows}" +
                                "<h1>" +
                                    "<a href=\"javascript:loadcity('${p.AreaCode}',1);\">" +
                                        "${p.AreaName}</a></h1>" +
                       "{/for}";
//地区市模板动态生成                     
function gettemstr(cityid) {
    var cityTemplate = "{for p in Rows}" +
                            "<h1>" +
                                "<a href=\"javascript:areaUrl('${p.AreaCode}','${p.AreaName}');\">" +
                                    "${p.AreaName}</a></h1>" +
               "{/for}" +
               "<div class=\"return\">" +
                  "<a href=\"javascript:void(0);\" onclick=\"loadcity('000000',2)\">返回其他省</a>" +
               "</div>";
    return cityTemplate;
}
//地区html代码生成
function loadcity(code,type) {
    $("#zhitiao").html('<div style="height:150px;text-align:center;"><img style="vertical-align:middle;margin-top:50px;" src="script/Jst/loading_v2.gif" /><div>');
    function OnSuccess(result) {
        if (result.Table1.Rows != null) {
            if (type != 1)
                html = TrimPath.parseTemplate(provinceTemplate).process(result.Table1);
            else {
                html = TrimPath.parseTemplate(gettemstr(code)).process(result.Table1);
            }
            $("#zhitiao").html(html);
        }
        else
        {
            $("#zhitiao").html("");
        }
    }
    $.ajax({ type: "POST", url: "../Data/ServerData.ashx", data: "code=" + code , dataType: "json", success: OnSuccess });
}


// 添加关注
function addFocus(rnid) {
    var del = new cngrain('../LoginAjax.aspx?a=' + Math.random(), 'action=addFocus&rnid='+rnid,"POST","json");
    del.AjaxControl();    
}

//删除用户关注
function delFocus(rnid) {
    var del = new cngrain('../LoginAjax.aspx?a=' + Math.random(), 'action=delFocus&rnid=' + rnid,"POST","json");
    del.AjaxControl();
}

// 退出登录
function exitLogin(){
    var exit = new cngrain('../LoginAjax.aspx?a=' + Math.random(), 'action=exitLogin',"POST","json");
    exit.AjaxControl();
}

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
                    case "exitLogin":{
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

// 进入用户承诺页面
function answerRequest(rnid) {
    openPanelWithOutMenu("answerRequest", "我的承诺", "answerRequest.aspx?rnid=" + rnid);    
    //window.location.href = "answerRequest.aspx?rnid=" + rnid;
}