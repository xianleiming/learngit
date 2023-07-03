$(function () {
    var error_email = false;
    var error_pwd = false;
    var error_code = false;


    $('#email').blur(function() {
        check_email();
    });

    $("#send_code").click(function () {
        send_code();
    });

    var re = /^[a-z0-9][\w\.\-]*@[a-z0-9\-]+(\.[a-z]{2,5}){1,2}$/;

    function check_email() {

        if (re.test($('#email').val())) {
            $('#email').next().hide();
            error_email = false;
        } else {
            $('#email').next().html('你输入的邮箱格式不正确')
            $('#email').next().show();
            error_email = true;
        }

    }

    function check_code(){
        if ($("#code").val() != ''){
            $('#code').next().next().hide();
            error_code = false;
        }else{
            $('#code').next().next().html('请输入验证码')
            $('#code').next().next().show();
            error_code = true;
        }
    }

    function check_pwd(){
        if ($("#newPwd").val() != ''){
            $('#newPwd').next().hide();
            error_pwd = false;
        }else{
            $('#newPwd').next().html('请输入新密码')
            $('#newPwd').next().show();
            error_email = true;
        }
    }

    /*
        发送验证码
     */
    function send_code(){

        if ($('#email').val() == '' || !re.test($('#email').val())){
            alert('请输入正确的邮箱');
        }else{
           alert("验证码已发送，请注意查收！");
        }

    }


    $('#forget_form').submit(function (e) {
        check_email();
        check_pwd();
        check_code();
        if (error_email == false && error_pwd==false && error_code==false) {

          	alert("忘记密码");

            return false;
        } else {
            return false;
        }

    });

});

