package com.example.trainingcenter.exception.model;

import lombok.Value;

import java.sql.Timestamp;

@Value
public class ErrorResponse {
    int errorcode;
    String erorMessage;
    String details;
    Timestamp timestamp;
}
