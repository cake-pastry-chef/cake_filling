package com.side.cakeproject.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CakeException.class)
    protected ResponseEntity<ErrorResponse> handleCakeException(CakeException e) {
        final ErrorResponse errorResponse = new ErrorResponse(e);
        return ResponseEntity.status(e.getStatus()).body(errorResponse);
    }
}
