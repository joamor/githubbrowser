package com.githubbrowser.domain.exceptions;

import lombok.Getter;

@Getter
public abstract class BaseException extends RuntimeException {

    private final ExceptionCause exceptionCause;

    protected BaseException(String message, ExceptionCause exceptionCause) {
        super(message);
        this.exceptionCause = exceptionCause;
    }

}
