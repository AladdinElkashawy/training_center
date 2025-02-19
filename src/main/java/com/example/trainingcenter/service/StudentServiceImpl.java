package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Student;
import com.example.trainingcenter.exception.EmailExistException;
import com.example.trainingcenter.exception.StudentNotFoundException;
import com.example.trainingcenter.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElseThrow(()->new StudentNotFoundException("Student not found"));
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) throws EmailExistException {
           Optional<Student> st1=studentRepository.findByEmail(student.getEmail());
            if(st1.isPresent()){
                throw new EmailExistException("Email already exist");
            }
            return studentRepository.save(student);

        }

    @Override
    public Student updateStudent(Student student) throws EmailExistException {
        Optional<Student> st=studentRepository.findById(student.getId());
        if(st.isPresent()){
            if(!st.get().getEmail().equals(student.getEmail())){
                if(studentRepository.findByEmail(student.getEmail()).isPresent()) {
                    throw new EmailExistException("Email already exist");
                }
            }
            return studentRepository.save(student);
        }
        throw new StudentNotFoundException("Student not found");
    }

    @Override
    public void deleteStudent(int id) {
    studentRepository.deleteById(id);
    }
}
