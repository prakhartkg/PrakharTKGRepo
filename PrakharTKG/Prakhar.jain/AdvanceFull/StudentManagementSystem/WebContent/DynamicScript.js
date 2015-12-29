$(document).ready(function(){
	$( "#add" ).click(function(){
		$( "#dialog" ).dialog({
			  height: 300,
		      width: 400,
		      show: {
		          effect: "blind",
		          duration: 500
		        },
		        hide: {
		          effect: "explode",
		          duration: 500
		          }
		});
	});

});

