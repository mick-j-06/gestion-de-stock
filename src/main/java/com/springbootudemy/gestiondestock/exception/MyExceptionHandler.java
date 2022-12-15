package com.springbootudemy.gestiondestock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(value = {EntityNotFoundException.class})
    public ResponseEntity<EntityNotFoundException> entityNotFoundHandler(EntityNotFoundException entityNotFoundException) {
        return ResponseEntity
                .status(404)
                .body(entityNotFoundException);
    }
}
