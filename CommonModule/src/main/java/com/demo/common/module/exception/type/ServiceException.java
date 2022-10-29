package com.demo.common.module.exception.type;

import lombok.Getter;

@Getter
public class ServiceException extends Exception{
    private final int serviceExceptionType;
    private final String message;

    public ServiceException(int serviceExceptionType, String message, Throwable throwable) {
        super(message, throwable);
        this.serviceExceptionType = serviceExceptionType;
        this.message = message;
    }

    public ServiceException(int serviceExceptionType, String message) {
        super(message);
        this.serviceExceptionType = serviceExceptionType;
        this.message = message;
    }
}
