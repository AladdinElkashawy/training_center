package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.CourseInstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseInstructorRepository extends JpaRepository<CourseInstructor, Integer> {
}