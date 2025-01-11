package com.ahmetyagiz.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Todo not found hatası için özel exception handler
    @ExceptionHandler(TodoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public String handleTodoNotFoundException(TodoNotFoundException ex) {
        return ex.getMessage();
    }

    // Tüm diğer beklenmeyen hatalar için genel exception handler
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public String handleGeneralException(Exception ex) {
        return "An unexpected error occurred: " + ex.getMessage();
    }
}
