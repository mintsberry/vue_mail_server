package com.mint.vuemailserver.enums;

public enum  StatusCode {
    SUCCESS(200,"Success");

    private int status;
    private String message;

    StatusCode(int status,String message){
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}