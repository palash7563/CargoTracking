$(document).ready(function()
		{
	$.getJSON("DispatchConsigneeIdJSON",{ajax:true},function(data){
		$.each(data,function(i,item){
			$('#consigneeid').append($('<option>').val(item.ID).text(item.ID));
		});
	});
		});