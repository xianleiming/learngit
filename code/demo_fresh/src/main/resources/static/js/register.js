$(function(){

	var error_name = false;
	var error_phone = false;
	var error_password = false;
	var error_email = false;
	var error_check = false;


	$('#user_name').blur(function() {
		check_user_name();
	});

	$('#phone').blur(function() {
		check_phone();
	});

	$('#pwd').blur(function() {
		check_pwd();
	});

	$('#email').blur(function() {
		check_email();
	});

	$('#allow').click(function() {
		if($(this).is(':checked'))
		{
			error_check = false;
			$(this).siblings('span').hide();
		}
		else
		{
			error_check = true;
			$(this).siblings('span').html('请勾选同意');
			$(this).siblings('span').show();
		}
	});


	function check_user_name(){
		var len = $('#user_name').val().length;
		if(len<5||len>20)
		{
			$('#user_name').next().html('请输入5-20个字符的用户名')
			$('#user_name').next().show();
			error_name = true;
		}
		else
		{
			$('#user_name').next().hide();
			error_name = false;
		}
	}

	function  check_phone(){

		var phone = $("#phone").val();
		if(!(/^1[3456789]\d{9}$/.test(phone))){
			$('#phone').next().html('手机号码不合法，请重新输入')
			$('#phone').next().show();
			error_phone = true;
		}else{
			$('#phone').next().hide();
			error_phone = false;
		}
	}

	function check_pwd(){
		var len = $('#pwd').val().length;
		if(len<8||len>20)
		{
			$('#pwd').next().html('密码最少8位，最长20位')
			$('#pwd').next().show();
			error_password = true;
		}
		else
		{
			$('#pwd').next().hide();
			error_password = false;
		}		
	}


	function check_email(){

		var re = /^[a-z0-9][\w\.\-]*@[a-z0-9\-]+(\.[a-z]{2,5}){1,2}$/;

		if(re.test($('#email').val()))
		{
			$('#email').next().hide();
			error_email = false;
		}
		else
		{
			$('#email').next().html('你输入的邮箱格式不正确')
			$('#email').next().show();
			error_email = true;
		}

	}


	$('#reg_form').submit(function(e) {
		check_user_name();
		check_phone();
		check_pwd();
		check_email();

		if(error_name == false && error_password == false && error_phone ==false && error_email ==false  &&  error_check == false)
		{
			return true;
		}
		else
		{
			return false;
		}

	});








})