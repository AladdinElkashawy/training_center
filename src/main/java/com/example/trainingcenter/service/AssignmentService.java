package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Assignment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssignmentService {
    Assignment getAssignmentById(int id);
    List<Assignment> getAllAssignments();
    Assignment createAssingment(Assignment assignment);
    Assignment updateAssignment(Assignment assignment);
    void deleteAssignment(int id);
}
