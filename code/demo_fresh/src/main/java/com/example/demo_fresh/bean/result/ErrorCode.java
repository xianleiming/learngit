package com.example.demo_fresh.bean.result;

/**
 * 返回码和信息
 */
public enum ErrorCode {

    CODE_200(200,"请求成功！"),
    CODE_403(403,"权限不足，请求被拒绝！"),
    CODE_404(404,"请求的URL地址错误！"),
    CODE_500(500,"服务器出现错误，请稍后再试！"),
    CODE_1000(1000,"账号或密码不正确！"),
    CODE_1001(1001,"请先登录再来访问！"),
    ;

    private int code;
    private String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}