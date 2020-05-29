package com.yanl.api.enums;

/**
 * @Author: YanL
 * @Time: 20:28 2020/5/27
 * @Email: imyanl.dt@gmail.com
 * @Description: 状态码
 */
public enum StatusCode {
    //成功
    Success(0, "成功"),
    //失败
    Fail(-1, "失败"),
    //非法参数
    InvalidParams(201, "非法参数"),
    //用户未登录
    UserNotLogin(202, "用户未登录");


    private Integer code;
    private String msg;
    StatusCode(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
