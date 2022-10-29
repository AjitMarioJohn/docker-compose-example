package com.demo.common.module.exception.type;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class HttpErrorResponse {
    private final int exceptionTypeCode;
    private final String message;
}
