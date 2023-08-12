package com.guthza.restservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

    @ResponseBody //rendered straight into the response body
    @ExceptionHandler(EmployeeNotFoundException.class) //only respond if the exception is thrown
    @ResponseStatus(HttpStatus.NOT_FOUND) //code 404
    public String employeeNotFoundHandler(EmployeeNotFoundException exception) {
        return exception.getMessage();
    }
}
