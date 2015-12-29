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
	
	$(document).on("click","#close",function(){
		$(this).closest('div').remove();
	});
	
	$(document).on("click","#employee",function(){
		/*for ( var obj  in divObjects) {
			if(obj.contact.value.toString()==this.attr('class')){
					var image = document.getElementById('image').src;
				 	var name = obj.name.value.toString();
				    var contact = obj.contact.value.toString();
				    var email = obj.email.value.toString();
				    $('#show').append("<div id='employee'class='"+contact+"'> <table> "+
				    		"<tr><td colspan='2' align='right'><input type='button' value='X' id='close' ></td></tr>"+
				            "<tr> <td align='right'> <image src ="+image +" height=100px width=100px> </td>"+
				            "</tr>" +
				            "<tr> <td> Name : </td>   <td> "+ name + "</td> </tr>" +
				            "<tr> <td> Contact : </td>   <td> "+ contact + "</td> </tr>" +
				            "<tr> <td> Email : </td>   <td> "+ email + "</td> </tr>" +
				            
				            "</table> " +
				            "</div>");
				    
			}
		}*/
		$(document).on('click','#employee',function(){
			var id=$(this).closest('div').attr('id');
			$('#show').empty();
			$('#'+id).clone().appendTo('#show');
			});
	});
	
});
function read(input) {

    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function(e) {
            $('#image').attr('src', e.target.result).width(100).height(100);
        };

        reader.readAsDataURL(input.files[0]);
    }

}
var divObjects=new Array();
function add(){
    var f = new Object();
    divObjects.push(f);
    f = document.getElementById('fid');
    var image = document.getElementById('image').src;
    var name = f.name.value.toString();
    var contact = f.contact.value.toString();
    var email = f.email.value.toString();
    $('#details').append("<div id='employee'class='"+contact+"'> <table> "+
    		"<tr><td colspan='2' align='right'><input type='button' value='X' id='close' ></td></tr>"+
            "<tr> <td align='right'> <image src ="+image +" height=100px width=100px> </td>"+
            "</tr>" +
            "<tr> <td> Name : </td>   <td> "+ name + "</td> </tr>" +
            "<tr> <td> Contact : </td>   <td> "+ contact + "</td> </tr>" +
            "<tr> <td> Email : </td>   <td> "+ email + "</td> </tr>" +
            
            "</table> " +
            "</div>");
    $("#dialog").dialog("close");
    
}
