$(document).ready(
function(){
	
$('#btn').click(function(){
	$.getJSON("SearchByTrackingIDJSON",{ajax:true,tid:$('#tid').val()},function(data){
	var h='<table>';
	h+='<tr><td>'
    h+='<table width=400>';
	h+='<tr><td><b><i>Consignee:</i></b></td><td>'+data[0].CEO+'</td><td><b><i>Consigner:</i></b></td><td>'+data[0].CNO+'</td></tr>';
	h+='<tr><td><b><i>Firm:</i></b></td><td>'+data[0].CEF+'</td><td><b><i>Firm:</i></b></td><td>'+data[0].CNF+'</td></tr>';
	h+='<tr><td><b><i>Contact Person:</i></b></td><td>'+data[0].CEC+'</td><td><b><i>Contact Person:</i></b></td><td>'+data[0].CNC+'</td></tr>';
	h+='<tr><td><b><i>Product Desc:</i></b></td><td>'+data[0].PRODUCTDESC+'<br> Dispatch by Vehicle No:'+data[0].VEICHELNO+'</td><td><b><i>Dispatch Date:</i></b></td><td>'+data[0].DISPATCHDATE+'</td></tr></table>';
	h+='<br><table border=1 width=400>';
	h+='<tr><th>Trancation Id</th><th>Date</th><th>Time</th><th>Description</th><th>Location</th></tr>';
	$.each(data,function(i,item){
	h+='<tr><td>'+item.TRACKINGTRANSACTIONID+'</td><td>'+item.TDATE+'</td><td>'+item.TTIME+'</td><td>'+item.DESCRIPTION+'</td><td>'+item.LAT+","+item.LNG+"</td></tr>";
	});	 
    h+='</table></td>';
    h+='<td valign=top>';
    h+='<table>';
    h+='<caption><b>Insert Tracking Details Here</b></caption>'
    h+='<tr><td><i>Current Date:</i></td><td><input type=text name=tcd></td></tr>';
    h+='<tr><td><i>Current Time:</i></td><td><input type=text name=tct></td></tr>';
    h+='<tr><td><i>Description:</i></td><td><textarea name=td rows=5 cols=30></textarea></td></tr>';
    h+='<tr><td><i>Loaction:</i></td><td><input type=text name=lat placeholder=Latitude>&nbsp;&nbsp;<input type=text name=lng placeholder=Longitude></td></tr>';
    h+='<tr><td><input type=submit></td><td><input type=reset></td></tr>';
    h+='</table></td></tr></table>'; 	
	$('#result').html(h);	
	});

});	

});