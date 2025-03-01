package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.StudentAssignment;
import com.example.trainingcenter.repository.StudentAssignmentRepository;
import com.example.trainingcenter.service.StudentAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student_assignment")
public class StudentAssignmentController {

    @Autowired
    StudentAssignmentService studentAssignmentService;

    @GetMapping("/all")
    public List<StudentAssignment> getAllStudentAssignment(){
        return studentAssignmentService.getAllStudentAssignment();
    }

    @GetMapping("/{id}")
    public StudentAssignment getStudentAssignmentById(@PathVariable int id){
        return studentAssignmentService.getStudentAssignmentById(id);
    }

    @PostMapping("/add")
    public StudentAssignment addStudentAssignment(@RequestBody StudentAssignment studentAssignment){
        return studentAssignmentService.addStudentAssignment(studentAssignment);
    }

    @PutMapping("/update")
    public StudentAssignment updateStudentAssignment(@RequestBody StudentAssignment studentAssignment){
        return studentAssignmentService.updateStudentAssignment(studentAssignment);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentAssignment(@PathVariable int id){
        studentAssignmentService.deleteStudentAssignment(id);
    }

}
