package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.StudentAssignment;
import com.example.trainingcenter.entity.StudentAssignmentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentAssignmentRepository extends JpaRepository<StudentAssignment, StudentAssignmentId> {
}