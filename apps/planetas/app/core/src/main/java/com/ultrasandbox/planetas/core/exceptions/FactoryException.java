package com.ultrasandbox.planetas.core.exceptions;

public class FactoryException extends RuntimeException {

    public FactoryException(String message) {
        super(message);
    }

    public FactoryException(String message, Throwable cause) {
        super(message, cause);
    }

}
