package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.Enrollment;
import com.example.trainingcenter.entity.EnrollmentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentId> {
}