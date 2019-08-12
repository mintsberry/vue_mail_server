package com.mint.vuemailserver.dto;

import com.mint.vuemailserver.enums.StatusCode;
import lombok.Data;

@Data
public class ResultDTO<T> {
    private int status;
    private String message;
    private T data;

    public void setStatusCode(StatusCode statusCode) {
        this.status = statusCode.getStatus();
        this.message = statusCode.getMessage();
    }
}
