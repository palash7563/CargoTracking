$(document).ready(function()
		{
	$.getJSON("DispatchConsignerIdJSON",{ajax:true},function(data){
		$.each(data,function(i,item){
			$('#consignerid').append($('<option>').val(item.ID).text(item.ID));
		});
	});
		});