package com.githubbrowser.domain.exceptions;

import lombok.Getter;

@Getter
public class ObjectNotFoundException extends BaseException {

    private static final String OBJECT_NOT_MESSAGE = "Object searched by parameter: %s not found.";

    public ObjectNotFoundException(String value) {
        super(String.format(OBJECT_NOT_MESSAGE, value), ExceptionCause.OBJECT_NOT_FOUND);
    }

}
