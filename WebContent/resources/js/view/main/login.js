
$('#btn_login').click(function(){
	var account = $('#account').val();
	var password = $('#password').val();
	if(account == '' || password == '') {
		alert('用户名或密码不能为空');
		return;
	}
	$.ajax({
		type: 'POST',
		url: 'user/login',
		data: {'account': account, 'password': password},
		dataType: 'json',
		success: function(result) {
			if(result && result.success) {
				window.location.href = "index.jsp";
			}else {
				alert(result.msg);
			}
		}
	});
});

