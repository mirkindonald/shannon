/**
 * Author	: Mirkin
 * Comment	: For Showing info, warn, error level info message 
  **/
function showInfo(message){	
	var divStr = "<div id='infoMessage' class='infoMessage' align='center'>"
	+"</div>";
	$('body').append(divStr);
	if(document.getElementById("infoMessage").style.display+""=="block"){
		alert("Please wait while the operation is under Process!!");
		return false;			
	}
	if(document.getElementById("info")!=null){
		if(document.getElementById("info").style.display=="block"){
			//alert("Please wait while the operation is under Process!!");
			//return false;		
			 $('body').find(".infoMessage").remove();
		}
	}
	var viewPortW = $(window).width();
	var viewPortH = $(window).height();
	var popUpW = Math.floor(viewPortW/2);
	var popUpH = Math.floor(viewPortH/2);
	var infoElem =  document.getElementById("infoMessage");
	infoElem.style.left = Math.floor(viewPortW/3)+"px";
	infoElem.style.top = Math.floor(viewPortH/3)+"px";
	
	$('#infoMessage').html("<img src='images/loading.gif' width='32' height='32' />");
	$('#infoMessage').append(message);
	$('#infoMessage').fadeIn(1);
	$('#infoMessage').hide();
	$('#infoMessage').slideDown('fast');
	return true;			
}
function hideInfo(message){
	$('#infoMessage').delay(1000).slideToggle('medium',function() {
	 	info(message,"info");
	 });
}

function hideInfo(){
	$('#infoMessage').slideToggle('medium');
}
function hideInfoError(message){
	$('#infoMessage').delay(1000).slideToggle('medium',function() {
	 	info(message,"error");
	 });
}
function hideInfo(message,level){
	try{
		$('#infoMessage').delay(1000).slideToggle('medium',function() {
			info(message,level);
		 });
		}catch(e){
			info(message,level);
		}
}
	 	
function info(message,status,model){
	if((model+""=="null") || (model==undefined)){
		model=false;
		
	}
	var imgSrc="";
	var heading="";
	if(status+""=="info"){
		heading="Information";
		imgSrc="<img src='images/info.png' style='width:40px;'/>";
	} else if(status+""=="error"){
		heading="Error";
		imgSrc="<img src='images/error.png' style='width:40px;'/>";
	}  else if(status+""=="warn"){
		heading="Warning";
		imgSrc="<img src='images/alert.png' style='width:40px;'/>";
	} else{
		heading="Information";
		imgSrc="<img src='images/info.png' style='width:40px;'/>";
	}
	
	var divStr = "<div id='info' class='infoMessage' align='center'>";
	divStr=divStr+"<div class=infoHeader>"+heading+"<span onclick='clearInfoDiv()' class='infoPPCloseBtn' src='images/close.png'>&nbsp;X&nbsp;</span></div>";
	divStr=divStr+"<table style='width: 100%'>";
	divStr=divStr+"<tr>";
	divStr=divStr+"<td style='width: 15%'>"+imgSrc+"</td>";
	divStr=divStr+"<td>";
	divStr=divStr+"<div id='levelImg' style='float: left; padding: 0px; margin: 0px'>"+message+"</div>";
	divStr=divStr+"</td>";
	divStr=divStr+"</tr>";
	divStr=divStr+"</table>";
	divStr=divStr+"</div>";
	 $('body').find(".infoMessage").remove();
	$('body').append(divStr);
	var viewPortW = $(window).width();
	var viewPortH = $(window).height();
	var popUpW = Math.floor(viewPortW/2);
	var popUpH = Math.floor(viewPortH/2);
	var infoElem =  document.getElementById("info");
	infoElem.style.left = Math.floor(viewPortW/3)+"px";
	infoElem.style.top = Math.floor(viewPortH/3)+"px";
	$('#info').fadeIn(1);
	$('#info').hide();
	$('#info').slideDown('fast');
	if(model!=true){
		$('#info').delay(6000).fadeOut("medium");
	}
	
}
function clearInfoDiv(){
	$('body').find('.infoMessage').remove();
}