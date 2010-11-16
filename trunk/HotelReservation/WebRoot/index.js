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
	
	$.get('ads.xml',function(xml){
		//alert($(xml).find("ad").size());
		var ads = $(xml).find("ad");
		$.each(ads, function(i, n){
			//alert( "Item #" + i + ": " + $(n).find('description').text());
			var html = "<div class='ad' style='display:none'>"+
							"<div class='images_box'>"+
								"<a href='"+$(n).find('href').text()+"'>"+
									"<img title='"+$(n).find('description').text()+"' src='"+$(n).find('photo').text()+"'/>"+
								"</a>"+
							"</div>"+
							"<h3>"+$(n).find('description').text()+"</h3>"+	
						"</div>"
							
			//alert(html);
			$('#ads').append(html);
			
			$('.images_btn_bar').append("<a class='' href='javascript:void(0)'>"+(i+1)+"</a>");
		}); 
		var timeIndex = 0;
		//alert($($('.ad').get(timeIndex)).css('display'));
		
		var _ad = $('.ad');
		var _ad_a = $('.images_btn_bar a');
		
		$(_ad.get(timeIndex)).css('display','block');
		$(_ad_a.get(timeIndex)).attr('class','active');
		
		var set = window.setInterval(function () {
			_ad.css('display','none');
			_ad_a.attr('class','');
			if(timeIndex+1<_ad.size()){
				timeIndex++;
				$(_ad.get(timeIndex)).css('display','block');
				$(_ad_a.get(timeIndex)).attr('class','active');
			}else{
				timeIndex = 0;
				$(_ad.get(timeIndex)).css('display','block');
				$(_ad_a.get(timeIndex)).attr('class','active');
			}
		},5000);		//设置时间间隔 ms
		
		
		$('.images_btn_bar a').click(function(){
			window.clearInterval(set);
			_ad_a.attr('class','');
			//alert($(this).text());
			$(this).attr('class','active');
			_ad.css('display','none');
			$(_ad.get($(this).text()-1)).css('display','block');
			set = window.setInterval(function () {
				_ad.css('display','none');
				_ad_a.attr('class','');
				if(timeIndex+1<_ad.size()){
					timeIndex++;
					$(_ad.get(timeIndex)).css('display','block');
					$(_ad_a.get(timeIndex)).attr('class','active');
				}else{
					timeIndex = 0;
					$(_ad.get(timeIndex)).css('display','block');
					$(_ad_a.get(timeIndex)).attr('class','active');
				}
			},5000);
		});
	});
	
	
	
	//16 shift
	//32 space
	//107 +
	//109 -
	//37 <- 左方向键
	
	//38 ^
	//39 -> 右方向键
	//40 \/ 
	
	
});