package com.example.trainingcenter.exception;

import com.example.trainingcenter.exception.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.Timestamp;

@RestControllerAdvice
public class GlobalExptionHandling {
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorResponse> hanleStudentNotFoundException(StudentNotFoundException exception){
        ErrorResponse errorResponse=new ErrorResponse(exception.getErrorId(),exception.errorMessage,exception.getDescription(),new Timestamp(System.currentTimeMillis()));
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(StafftNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleStaffNotFoundException(StafftNotFoundException exception){
        ErrorResponse errorResponse=new ErrorResponse(exception.getErrorId(),exception.errorMessage,exception.getDescription(),new Timestamp(System.currentTimeMillis()));
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(EmailExistException.class)
    public ResponseEntity<ErrorResponse> handleEmailExistException(EmailExistException exception){
        ErrorResponse errorResponse=new ErrorResponse(exception.getErrorId(),exception.errorMessage,exception.getDescription(),new Timestamp(System.currentTimeMillis()));
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
