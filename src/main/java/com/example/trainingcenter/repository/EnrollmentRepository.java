package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.Enrollment;
import com.example.trainingcenter.entity.EnrollmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentId> {
}