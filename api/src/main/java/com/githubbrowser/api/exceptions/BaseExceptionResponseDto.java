package com.githubbrowser.api.exceptions;

import com.githubbrowser.domain.exceptions.ExceptionCause;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor(staticName = "of", access = AccessLevel.PACKAGE)
public class BaseExceptionResponseDto {

    @NonNull
    private final ExceptionCause exceptionCause;

    @NonNull
    private final String message;

}
