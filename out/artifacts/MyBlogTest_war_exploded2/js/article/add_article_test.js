// 保存文章
function saveArticle(){
    var arr = [];

    //获取输入的内容，包含输入和页面相关的标签
    arr.push(UE.getEditor('editor').getContent());
    var content = arr.join("\n");
    // alert(content);
    
    // 简介 获取纯文本的标签
    var description = UE.getEditor('editor').getContentTxt().substring(0,10);

    // 保存文章
    $.ajax({
        type : "POST",
        url : '/test/addContent',
        data : "content="+content+"&description="+description,
        success  : function(data) {
        	if(data.resultCode != 'success'){
                window.location.href = "../test/detail";
                // autoCloseAlert(data.errorInfo,1000);
				return false;
			}else{
        	    alert("失败哦");
				// 调到列表页
				window.location.href = "../test/add";
			}
		}
    });
}

function cancelSaveArticle(){
	window.location.href = "../test/add";
}