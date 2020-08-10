var images = ["bee","tractor","meadow"] 
var x = 0;

function startTimer() {
		setInterval(slideshow, 10000);
}

function slideshow() { 
	if($(window).width() > 575) { //removes slideshow from mobile
		$(".overlay").fadeIn(2000,"linear"); 
		setTimeout(function() {
		if(x == images.length - 1) {
			x=0;
		} else {
			x = x+1;
		}
		$("#hero-container").attr("class", images[x]);
		}, 2000);
		setTimeout(function() {
			$(".overlay").fadeOut(2000,"linear");
		},2100);
	}
}

