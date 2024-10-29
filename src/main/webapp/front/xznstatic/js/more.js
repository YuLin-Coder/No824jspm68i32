$(function() {	
	

	$('.codebtn').click(function() {
		$('.topcode').toggleClass('on')
	})

	
		//input		
	$('input[type=text]').bind({
		focus: function() {
			if(this.value == this.defaultValue) {
				this.value = "";
			}
		},
		blur: function() {
			if(this.value == "") {
				this.value = this.defaultValue;
			}
		}
	});

		
	 $('.index-sec2 .hd li').hover(function(){			
		var index=$(this).index();
		$(this).addClass('on').siblings().removeClass('on')
		$('.index-sec2 .pal').eq(index).addClass('on').siblings().removeClass('on');
	})
	 
	 
	  $('.index-sec4 .tab-hd li').hover(function(){			
		var index=$(this).index();
		$(this).addClass('on').siblings().removeClass('on')
		$('.index-sec4 .pal').eq(index).addClass('on').siblings().removeClass('on');
	})
	 
	jQuery(".index-sec4 .pal").slide({titCell:".hd ul",mainCell:".bd ul",autoPage:true,effect:"leftLoop",autoPlay:true,vis:4});	
	jQuery(".index-sec5 .div1").slide({ titCell:".hd ul", mainCell:".bd ul", effect:"fade",  autoPlay:true, autoPage:true, trigger:"click" })	
	jQuery(".youlian").slide({mainCell:".bd ul",autoPlay:true,effect:"leftMarquee",interTime:50,trigger:"click",vis:10});
	$('.about-brief-more').click(function(){
		  $('.about-brief-words').css('height', 'auto');
	 	 $(this).hide();
	})
	$('.baojia').click(function(){
		$('.ancitc').show();
	
	})
	
	$('.close1').click(function(){
		$('.ancitc').hide();
	
	})
	
    
   
    
    
})