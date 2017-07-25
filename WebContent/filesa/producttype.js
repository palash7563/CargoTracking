$(document).ready(function()
		{
	$.getJSON("DisptachProducttypeJSON",{ajax:true},function(data){
		$.each(data,function(i,item){
			$('#producttype').append($('<option>').val(item.PRODUCTTYPE).text(item.PRODUCTTYPE));
		});
	});
		});