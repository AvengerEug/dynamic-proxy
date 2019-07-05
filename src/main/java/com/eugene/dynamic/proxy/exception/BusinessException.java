package com.eugene.dynamic.proxy.exception;

public class BusinessException extends Exception {

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BusinessException(String message, String code) {
        this.code = code;
        this.message = message;
    }
}
