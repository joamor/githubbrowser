package com.githubbrowser.api.exceptions;

import com.githubbrowser.domain.exceptions.ExceptionCause;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BaseExceptionResponseDto {

    private final ExceptionCause exceptionCause;

    private final String message;

}
