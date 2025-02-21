package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.CourseInstructor;
import com.example.trainingcenter.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseInstructorRepository extends JpaRepository<CourseInstructor, Integer> {
    List<CourseInstructor> findByInstructorId(int instructorId);

}