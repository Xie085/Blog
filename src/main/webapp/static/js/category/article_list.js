$(function(){
	loadNextPage(99999999999);

	// $(window).scroll(function(){
	// 	checkload();
	// });
	
// //建立加载判断函数
// function checkload(){
// 	totalheight = parseFloat($(window).height()) + parseFloat($(window).scrollTop());
//     if ($(document).height() <= totalheight) {
//     	if($("#lastId").val() != 'undefined' && $("#lastId").val() != null && $("#lastId").val() != ''){
//         	loadNextPage($("#lastId").val());
//     	}
//     }
// }

//创建ajax加载函数，并设置变量C，用于输入调用的页面频道,请根据实际情况判断使用，非必要。
function loadNextPage(lastId){
		$.ajax({
									url : '../loadPage1/'+$("#categoryId").val(),
									type : "get",
									success : function(data) {
										if($.trim(data) != ''){
											$("#lastId").remove();
											$("#content").append(data);
											$('img').lazyload();
										}
									}
		});	
}  
});  

function goTag(tagName){
	window.location.href = "http://coriger.com/tag/"+encodeURI(encodeURI(tagName))
}


