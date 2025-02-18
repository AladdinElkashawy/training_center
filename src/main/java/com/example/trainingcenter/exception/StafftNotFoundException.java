package com.example.trainingcenter.exception;

import lombok.Getter;

@Getter
public class StafftNotFoundException extends RuntimeException{
    final int errorId=1001;
    final String errorMessage="StafftNotFound";
    final String description;
    public StafftNotFoundException(String description) {
        this.description = description;
    }
}
