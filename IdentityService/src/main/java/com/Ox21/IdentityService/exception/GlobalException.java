package com.Ox21.IdentityService.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = Exception.class)
    ResponseEntity<String> handlingRuntimeException(RuntimeException exception){

        String messageError = exception.getMessage();

        return ResponseEntity.badRequest().body(messageError);
    }
    
}
