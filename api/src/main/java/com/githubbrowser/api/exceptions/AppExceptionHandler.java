package com.githubbrowser.api.exceptions;

import com.githubbrowser.domain.exceptions.ObjectNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@RestControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ObjectNotFoundException.class)
    public BaseExceptionResponseDto handleException(ObjectNotFoundException exception) {
        log.error("Caught exception: " + exception.getMessage());
        return new BaseExceptionResponseDto(exception.getExceptionCause(), exception.getMessage());
    }

}
