package com.productservice.project1.advice;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.productservice.project1.DTO.Errordto;

@org.springframework.web.bind.annotation.ControllerAdvice
public class Controlleradvice {
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Errordto> handleNullPointerException() {
        Errordto errorDto = new Errordto();
        errorDto.setMessage("Something went wrong. Please try again");

        return new ResponseEntity<>(errorDto,
                HttpStatusCode.valueOf(404));
    }
}