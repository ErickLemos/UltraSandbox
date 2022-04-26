package com.ultrasandbox.planetas.core.exceptions;

public class MapperException extends RuntimeException {

    public MapperException(String message) {
        super(message);
    }

    public MapperException(String message, Throwable cause) {
        super(message, cause);
    }

}
