package com.demo.common.module.exception.type;

public class UndefinedException extends ServiceException{
    public UndefinedException(String message, Throwable throwable) {
        super(ServiceExceptionType.UNDEFINED_EXCEPTION, message, throwable);
    }

    public UndefinedException(String message) {
        super(ServiceExceptionType.UNDEFINED_EXCEPTION, message);
    }
}
