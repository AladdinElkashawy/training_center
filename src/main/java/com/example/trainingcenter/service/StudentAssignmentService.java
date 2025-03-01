package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.StudentAssignment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentAssignmentService {
    List<StudentAssignment> getAllStudentAssignment();
    StudentAssignment getStudentAssignmentById(int id);
    StudentAssignment addStudentAssignment(StudentAssignment studentAssignment);
    StudentAssignment updateStudentAssignment(StudentAssignment studentAssignment);
    void deleteStudentAssignment(int id);
}
