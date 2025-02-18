package com.example.trainingcenter.exception;

import lombok.Getter;
import lombok.Value;

@Getter
public class StudentNotFoundException extends RuntimeException{
    final int errorId=1000;
    final String errorMessage="StudentNotFound";
    final String description;
    public StudentNotFoundException(String description) {
        this.description = description;
    }
}
