package com.marvel.backend.character.application;

import lombok.Data;

import java.util.Date;

@Data
public class ExceptionResponse {
    private Integer code;
    private Date timestamp;
    private String message;
    private String details;

    public ExceptionResponse(Integer code, Date timestamp, String message, String details) {
        super();
        this.code = code;
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
