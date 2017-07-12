$(document).ready(
function(){
$.getJSON("GetAllCountryJSON",{ajax:true},function(data){
$('#country').append($('<option>').val('-Select-').text('-Select-'));
$.each(data,function(i,item){
	$('#country').append($('<option>').val(item.COUNTRYID).text(item.COUNTRYNAME));	
	
});
	
});

$('#country').change(function(){
$.getJSON('GetAllStateJSON',{ajax:true,countryid:$('#country').val()},
function(data){
	$('#state').empty();
	$('#state').append($('<option>').val('-Select-').text('-Select-'));
	$.each(data,function(i,item){
		$('#state').append($('<option>').val(item.STATEID).text(item.STATENAME));	
		
	});	
 });	
	
});


$('#state').change(function(){
	$.getJSON('GetAllCityJSON',{ajax:true,stateid:$('#state').val()},
	function(data){
		$('#city').empty();
		$('#city').append($('<option>').val('-Select-').text('-Select-'));
		$.each(data,function(i,item){
			$('#city').append($('<option>').val(item.CITYID).text(item.CITYNAME));	
			
		});	
	 });	
		
	});






});




