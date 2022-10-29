package com.demo.common.module.exception.type;

/**
 * Constant class that define the type of exception service is creating or handling
 */
public final class ServiceExceptionType {
    private ServiceExceptionType(){}

    public static final int REST_API_EXCEPTION = 1;
    public static final int REST_API_CONNECTION_REFUSED = 2;
    public static final int UNDEFINED_EXCEPTION = 3;
}
