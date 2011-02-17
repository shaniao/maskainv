$(function () { 
	var url = document.URL;		
	$("#hotelSearch").click(function(){
		var destiny = $("#destiny").val();
		var from = $("#comeTime").val();
		var to = $("#leftTime").val();
		var singleRooms = $("#singleRooms").val();
		var doubleRooms = $("#doubleRooms").val();
		var hotelName = $("#hotelName").val();
		var newURL = url+"results.jsp"
			+"?destiny="+destiny
			+"&from="+from
			+"&to="+to
			+"&single="+singleRooms
			+"&double="+doubleRooms
			+"&hotelName="+hotelName;
		alert(newURL);
		window.open(newURL);
	});
	
});