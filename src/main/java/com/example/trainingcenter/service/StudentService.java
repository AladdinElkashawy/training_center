package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
Student getStudentById(int id);
List<Student> getAllStudents();
Student addStudent(Student student);
Student updateStudent(Student student);
void deleteStudent(int id);
}
