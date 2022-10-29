package com.demo.common.module.exception.handlers;

import com.demo.common.module.exception.type.ConnectionRefusedException;
import com.demo.common.module.exception.type.HttpErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(value = {ConnectionRefusedException.class})
    public ResponseEntity<HttpErrorResponse> connectionRefused(ConnectionRefusedException exception) {
        HttpErrorResponse errorResponse = new HttpErrorResponse(exception.getServiceExceptionType(), exception.getMessage());
        return new ResponseEntity<HttpErrorResponse>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
