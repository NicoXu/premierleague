package com.shaw.base.exception;

/**
 * 业务相关异常
 * Created by shaw on 2018/1/19.
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1531126892119856544L;

    private String errCode;

    public BusinessException(String message){
        super(message);
    }

    public BusinessException(String errCode, String message){
        super(message);
        this.errCode = errCode;
    }

    public BusinessException(String message, Throwable e){
        super(message, e);
    }

    public BusinessException(String errCode, String message, Throwable e){
        super(message, e);
        this.errCode = errCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

}
