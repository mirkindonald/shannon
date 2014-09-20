/**
 * Author	: Mirkin
 * Comment	: Focusing the html element alert hints on validation
  **/

function focusTips(id,formId,message){
	 $("#"+formId).find('input[type=text],textarea,select').not('script, style, noscript').each(function(){ 
		 if(this.id+""==id+""){
			 $("#"+id).focus();
			 var divStr = "<div id='toolHints' class='toolHints' align='center'><img src='images/alertIcon.png' width='15' height='15' /></div>";
	 		 $('body').find(".toolHints").remove();
			 $('body').append(divStr);
			 var x = $("#"+id).offset().left;
			 var y = $("#"+id).offset().top;
			 var toolHeight = $("#"+id).height();
			 var d = document.getElementById('toolHints');
			 $('#toolHints').append(" This Field is required!! ");
			 d.style.position = "absolute";
			  d.style.display='block';
			 d.style.left = x+"px";
			 d.style.top = (y+toolHeight+5)+"px";
			 info(message,"warn");
			 $("#toolHints").delay(3000).fadeOut(400);
		 }
	 });
}
function removeFocusTips(){
	 $('body').find(".toolHints").remove();
}