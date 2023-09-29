package com.side.cakeproject.exception;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse {
    private HttpStatus status;
    private String message;

    @Builder
    public ErrorResponse(final CakeException exception) {
        this.status = exception.getStatus();
        this.message = exception.getMessage();
    }

}
