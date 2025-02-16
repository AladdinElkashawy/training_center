package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
}