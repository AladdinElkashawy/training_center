package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Enrollment;
import com.example.trainingcenter.entity.Student;
import com.example.trainingcenter.exception.EmailExistException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
Student getStudentById(int id);
List<Student> getAllStudents();
List<Student> getCourseStudents(int course_id);
Student addStudent(Student student) throws EmailExistException;
Student updateStudent(Student student) throws EmailExistException;
void deleteStudent(int id);
}
