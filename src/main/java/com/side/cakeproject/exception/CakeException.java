package com.side.cakeproject.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public class CakeException extends RuntimeException {

    private final HttpStatus status;
    private final String message;

    public CakeException(ErrorCode errorCode) {
        super(errorCode.getMessage());

        this.status = errorCode.getStatus();
        this.message = errorCode.getMessage();
    }

    public CakeException(ErrorCode errorCode, String subject) {
        super(errorCode.getMessage());

        this.status = errorCode.getStatus();
        this.message = subject + " " + errorCode.getMessage();
    }
}
