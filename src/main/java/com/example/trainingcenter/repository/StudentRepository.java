package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.Student;
import com.example.trainingcenter.exception.EmailExistException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<Student> findByEmail(String email);

}