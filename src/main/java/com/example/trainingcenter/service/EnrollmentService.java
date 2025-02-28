package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Enrollment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EnrollmentService {
    List<Enrollment> getAllEnrollments();
    Enrollment getEnrollmentById(int id);
    Enrollment addEnrollment(Enrollment enrollment);
    Enrollment updateEnrollment(Enrollment enrollment);
    void deleteEnrollmentById(int id);
}
