package com.example.demo.exception;

import com.example.demo.model.response.Response;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> notValid(MethodArgumentNotValidException e, HttpServletRequest request){
        List<String> errorList = new ArrayList<>();

        e.getAllErrors().forEach(err ->errorList.add(err.getDefaultMessage()));

        return new ResponseEntity(new Response(errorList, e.getMessage()), HttpStatus.MULTI_STATUS);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> exceptionHandle(NotFoundException e){
        return new ResponseEntity(new Response(null, e.getMessage()), HttpStatus.I_AM_A_TEAPOT);
    }

    @ExceptionHandler(EmptyListException.class)
    public ResponseEntity<?> exceptionHandle(EmptyListException e){
        return new ResponseEntity(new Response(e, e.getMessage()), HttpStatus.I_AM_A_TEAPOT);
    }
}
