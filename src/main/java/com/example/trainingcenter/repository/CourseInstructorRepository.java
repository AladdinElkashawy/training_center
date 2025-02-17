package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.CourseInstructor;
import com.example.trainingcenter.entity.CourseInstructorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseInstructorRepository extends JpaRepository<CourseInstructor, CourseInstructorId> {
}