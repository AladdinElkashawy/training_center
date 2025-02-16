package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}