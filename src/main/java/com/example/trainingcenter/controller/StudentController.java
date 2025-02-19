package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Student;
import com.example.trainingcenter.exception.EmailExistException;
import com.example.trainingcenter.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/{id}")
    Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
    @GetMapping("/all")
    List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @PostMapping("/add")
    Student addStudent(@RequestBody Student student) throws EmailExistException {
        return studentService.addStudent(student);
    }
    @PutMapping("/update")
    Student updateStudent(@RequestBody Student student) throws EmailExistException{
        return studentService.updateStudent(student);
    }
    @DeleteMapping("/delete/{id}")
    void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }


}
