package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.StudentAssignment;
import com.example.trainingcenter.entity.StudentAssignmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAssignmentRepository extends JpaRepository<StudentAssignment, StudentAssignmentId> {
}