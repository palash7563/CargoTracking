$(document).ready(
function(){
$('#btn').prop('disabled',true);
$('#cpassword').keyup(function(){
	if($('#cpassword').val()==$('#password').val())
		{
		$('#msg').html("<font color=green>Password Matched</font>");
		$('#btn').prop('disabled',false);
		
		}
	else
		{$('#msg').html("<font color=red>Password Not Match</font>");
		$('#btn').prop('disabled',true);
		
		}
});
});