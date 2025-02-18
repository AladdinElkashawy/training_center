package com.example.trainingcenter.exception;

import lombok.Getter;

import java.sql.SQLException;

@Getter
public class EmailExistException extends SQLException {
    final int errorId=1003;
    final String errorMessage="EmailExistException";
    final String description;
    public EmailExistException(String description) {
        this.description = description;
    }
}
