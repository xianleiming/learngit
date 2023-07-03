package com.example.demo_fresh.bean.result;


import lombok.Data;

/**
 * 返回JSON数据的基类-统一返回结果类
 */
@Data
public class BaseResult {

    private int code;//返回码
    private String msg;//返回信息
    private Object data;//返回数据

    public BaseResult() {
        //默认
        code = ErrorCode.CODE_200.getCode();
        msg = ErrorCode.CODE_200.getMsg();
    }


    public BaseResult(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    public BaseResult(ErrorCode errorCode, Object data) {
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
        this.data = data;
    }
}