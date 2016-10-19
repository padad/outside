
//表单验证检查空格
function chkspace(str){
	if(str.length==0){
		return true;
	}
	else{
		var strs = '';
		for(i = 0; i < str.length; i++) {
		strs = strs + ' ';
		}
		return (str==strs);
	}
}

//表单验证检查非法字符
function chkfilter(str){
	if(str.search("^[^\'`~\$\^\"]+$")==-1){
		return true;
	}
	return false;
}

//表单验证检查数字
function chknumber(str){
	if(str.search("^[^0-9]+$")>=0){
		return true;
	}
	return false;
}

//显示表单验证提示信息
function showerr(str){
    var frmmsg = $("#errmsg");
    frmmsg.html(str);
    frmmsg.css("display", "block"); 
}

//更新验证码
function refccode() {
    var imgSrc = $("#ccodeframe");
    var src = imgSrc.attr("src"); imgSrc.attr("src", '/AgreeMent/ValidateCode.aspx');
	
}
