package com.demo.common.module.exception.type;

public class ConnectionRefusedException extends ServiceException{
    public ConnectionRefusedException(String message, Throwable throwable) {
        super(ServiceExceptionType.REST_API_CONNECTION_REFUSED, message, throwable);
    }

    public ConnectionRefusedException(String message) {
        super(ServiceExceptionType.REST_API_CONNECTION_REFUSED, message);
    }
}
