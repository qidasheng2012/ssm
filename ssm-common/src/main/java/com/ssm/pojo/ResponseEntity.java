package com.ssm.pojo;

import com.ssm.constant.Constants;

import java.io.Serializable;

/**
 * @author qp
 * @date 2019/5/1
 */
public class ResponseEntity<T> implements Serializable {

    private String code = Constants.RESPONSE_SUCCESS;
    private String msg;
    private T data;
    private long count;

    public ResponseEntity() { }

    public ResponseEntity(T data) {
        this.data = data;
    }

    public ResponseEntity(T data, long count) {
        this.data = data;
        this.count = count;
    }

    public ResponseEntity(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public ResponseEntity<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return this.data;
    }

    public ResponseEntity<T> setData(T data) {
        this.data = data;
        return this;
    }

    public long getCount() {
        return this.count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public String getCode()
    {
        return this.code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ResponseEntity(super=" + super.toString() + ", msg=" + getMsg() + ", data=" + getData() + ", count=" + getCount() + ", code=" + getCode() + ")";
    }
}
