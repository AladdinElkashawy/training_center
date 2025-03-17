package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Course;
import com.example.trainingcenter.entity.Student;
import com.example.trainingcenter.exception.EmailExistException;
import com.example.trainingcenter.service.CourseService;
import com.example.trainingcenter.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Student API", description = "Student End points to handle Student Operations")
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @Autowired
    CourseService courseService;

    @Operation(summary = "Get Student by id", description = "Get specific student by his id")
    @GetMapping("/{id}")
    Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @Operation(summary = "Get all Students", description = "Fetch all Students in the database")
    @GetMapping("/all")
    List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @Operation(summary = "Get Courses of Student", description = "Fetch all Courses that a specific Student rolled in")
    @GetMapping("/student/courses")
    List<Course> getStudentCourses(@RequestParam int student_id){
        return courseService.getStudentCourses(student_id);
    }

    @Operation(summary = "Add Student", description = "Add Student to database")
    @PostMapping("/add")
    Student addStudent(@RequestBody Student student) throws EmailExistException {
        return studentService.addStudent(student);
    }

    @Operation(summary = "Update Student", description = "Update an existing Student")
    @PutMapping("/update")
    Student updateStudent(@RequestBody Student student) throws EmailExistException{
        return studentService.updateStudent(student);
    }

    @Operation(summary = "Delete Student", description = "Delete specific Student by his id")
    @DeleteMapping("/delete/{id}")
    void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }


}
