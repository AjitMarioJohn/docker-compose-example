package com.demo.common.module.aspects;

import com.demo.common.module.annotations.RestClientErrorHandler;
import com.demo.common.module.exception.type.ConnectionRefusedException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class RestApiExceptionAspect {

    @Around(value = "@annotation(com.demo.common.module.annotations.RestClientErrorHandler)")
    public Object handleFeignClientExceptions(ProceedingJoinPoint proceedingJoinPoint) throws ConnectionRefusedException {
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = signature.getMethod();
        RestClientErrorHandler restClientErrorHandler = method.getAnnotation(RestClientErrorHandler.class);
        String serviceName = restClientErrorHandler.serviceName();
        Object response = null;
        try {
            response = proceedingJoinPoint.proceed();
        } catch (Throwable exception) {
            if (exception.getLocalizedMessage().contains("Connection refused")) {
                throw new ConnectionRefusedException(String.format("RestApiExceptionAspect :: handleFeignClientExceptions :: %s Rest Service is down", serviceName), exception);
            }
        }
        return response;
    }
}
