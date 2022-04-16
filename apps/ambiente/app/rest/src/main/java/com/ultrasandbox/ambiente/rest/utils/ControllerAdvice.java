package com.ultrasandbox.ambiente.rest.utils;

import com.ultrasandbox.ambiente.core.exceptions.NotFoundException;
import com.ultrasandbox.ambiente.rest.models.dtos.MensagemDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {NotFoundException.class})
    protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
        var mensagem = new MensagemDto(ex.getMessage().split(":")[1]);
        return handleExceptionInternal(ex, mensagem, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

}
