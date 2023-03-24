package com.cardest.backend.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class RuleException extends RuntimeException {

    private final HttpStatus httpStatus;

    public RuleException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public RuleException(String message, Throwable cause, HttpStatus httpStatus) {
        super(message, cause);
        this.httpStatus = httpStatus;
    }

    public RuleException(Throwable cause, HttpStatus httpStatus) {
        super(cause);
        this.httpStatus = httpStatus;
    }

    public RuleException(String message, Throwable cause, boolean enableSuppression,
                         boolean writableStackTrace, HttpStatus httpStatus) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.httpStatus = httpStatus;
    }

}
