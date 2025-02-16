package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}