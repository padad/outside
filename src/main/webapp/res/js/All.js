
//����֤���ո�
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

//����֤���Ƿ��ַ�
function chkfilter(str){
	if(str.search("^[^\'`~\$\^\"]+$")==-1){
		return true;
	}
	return false;
}

//����֤�������
function chknumber(str){
	if(str.search("^[^0-9]+$")>=0){
		return true;
	}
	return false;
}

//��ʾ����֤��ʾ��Ϣ
function showerr(str){
    var frmmsg = $("#errmsg");
    frmmsg.html(str);
    frmmsg.css("display", "block"); 
}

//������֤��
function refccode() {
    var imgSrc = $("#ccodeframe");
    var src = imgSrc.attr("src"); imgSrc.attr("src", '/AgreeMent/ValidateCode.aspx');
	
}
