package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.StudentAssignment;
import com.example.trainingcenter.repository.StudentAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentAssignmentServiceImpl implements StudentAssignmentService {

    @Autowired
    StudentAssignmentRepository studentAssignmentRepository;

    @Override
    public List<StudentAssignment> getAllStudentAssignment() {
        return studentAssignmentRepository.findAll();
    }

    @Override
    public StudentAssignment getStudentAssignmentById(int id) {
        return studentAssignmentRepository.findById(id).orElseThrow();
    }

    @Override
    public StudentAssignment addStudentAssignment(StudentAssignment studentAssignment) {
        return studentAssignmentRepository.save(studentAssignment);
    }

    @Override
    public StudentAssignment updateStudentAssignment(StudentAssignment studentAssignment) {
        return studentAssignmentRepository.save(studentAssignment);
    }

    @Override
    public void deleteStudentAssignment(int id) {
        studentAssignmentRepository.deleteById(id);
    }
}
