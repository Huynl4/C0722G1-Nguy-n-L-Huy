package com.example.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandleController {
    @ExceptionHandler(Exception.class)
    public String handleException(){
        return "errorPage";
    }

    @ExceptionHandler(NullPointerException.class)
    public String handleNullPointerException(){
        return "errorPage";
    }
}
