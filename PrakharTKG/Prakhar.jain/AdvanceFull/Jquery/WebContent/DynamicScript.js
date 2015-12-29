$(document).ready(function(){
	$("#add").click(function(){
		var title=prompt("Enter Field Name");
		var type=prompt("Enter Field Type");
		vartext="";
		if(title!=null && type!=null && title!="" && type!=""){
		$("#addField").before(
				"<tr id='"+title+""+type+"'>" +
				"<td>"+title+" :  </td>" +
				"<td><input type='"+type+"' name='"+title+""+type+"' >" +
				"</td>" +
				"<td><input type='button' value='--' id='remove'></td>"+
				"</tr>" 
		);
			
		}	
	});
	$(document).on("click","#remove",function(){
		$(this).parent().parent().remove();
	});
});