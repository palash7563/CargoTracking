$(document).ready(function()
		{
	$.getJSON("DispatchByJSON",{ajax:true},function(data){
		$.each(data,function(i,item){
			$('#route').append($('<option>').val(item.ROUTE).text(item.ROUTE));
		});
	});
		});