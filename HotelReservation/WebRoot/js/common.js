$(function (){ 
			
	$("#singleRooms").change(function(){
		var singleValue = $(this).attr('value');
		var doubleValue = $("#doubleRooms").val();
		var sum = parseInt(singleValue)+2*parseInt(doubleValue);
		$("#adults ").val(sum); 
	});
	
	$("#doubleRooms").change(function(){
		var singleValue = $("#singleRooms").val();
		var doubleValue = $(this).attr('value');
		var sum = parseInt(singleValue)+2*parseInt(doubleValue);
		$("#adults").val(sum); 
	});
	
});

function getUrlParam(name){  
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");  
    var r = window.location.search.substr(1).match(reg);  
    if (r!=null) return unescape(r[2]); return null;  
}  