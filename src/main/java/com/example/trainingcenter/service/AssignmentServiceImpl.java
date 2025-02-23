package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Assignment;
import com.example.trainingcenter.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentServiceImpl implements AssignmentService {

   @Autowired
    AssignmentRepository assignmentRepository;

    @Override
    public Assignment getAssignmentById(int id) {
        return assignmentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Assignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }

    @Override
    public Assignment createAssingment(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }

    @Override
    public Assignment updateAssignment(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }

    @Override
    public void deleteAssignment(int id) {
        assignmentRepository.deleteById(id);
    }
}
