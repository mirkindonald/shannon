function init(){
	var ht = $("#headerDiv").height();
	ht=ht+$("#headerTable").height();
	$("#timeSheetArea").height($(window).height()-ht-30);
}