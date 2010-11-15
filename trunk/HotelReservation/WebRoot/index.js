$(document).ready(function(){	
	//alert($('ul.topNav').children('li').size());
	$.each( $('ul.topNav').children('li'), function(i, n){
		//alert( "Item #" + i + ": " + $(n).html() );
		
		$(n).mouseover(function(e){
			$(n).addClass('hover');
			$(n).children('ul').css('display','block');
		});
		
		$(n).mouseout(function(e){
			$(n).removeClass('hover');
			$(n).children('ul').css('display','none');
		});
		
	});
	
	
});