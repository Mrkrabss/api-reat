package com.rest_api.rest_api.model;

public class MyData<T> {
    private T data;
    private int code;
    private String msg;
    public MyData(T data){
        this.data=data;
        code=200;
        msg="成功";
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public MyData(T data, int code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
}
