package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.StudentAssignment;
import com.example.trainingcenter.repository.StudentAssignmentRepository;
import com.example.trainingcenter.service.StudentAssignmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Student-Assignment API", description = "Student-Assignment Endpoints to handle their opertions")
@RestController
@RequestMapping("/student_assignment")
public class StudentAssignmentController {

    @Autowired
    StudentAssignmentService studentAssignmentService;

    @Operation(summary = "Get all Student-Assignment", description = "Return all students ids with their own assignments ids")
    @GetMapping("/all")
    public List<StudentAssignment> getAllStudentAssignment(){
        return studentAssignmentService.getAllStudentAssignment();
    }

    @Operation(summary = "Get Student-Assignment", description = "Return student id with his assignment id")
    @GetMapping("/{id}")
    public StudentAssignment getStudentAssignmentById(@PathVariable int id){
        return studentAssignmentService.getStudentAssignmentById(id);
    }

    @Operation(summary = "Add Student-Assignment", description = "Add Student-Assignment for Student that has submitted Assignment")
    @PostMapping("/add")
    public StudentAssignment addStudentAssignment(@RequestBody StudentAssignment studentAssignment){
        return studentAssignmentService.addStudentAssignment(studentAssignment);
    }

    @Operation(summary = "Update Student-Assignment", description = "Update Student-Assignment")
    @PutMapping("/update")
    public StudentAssignment updateStudentAssignment(@RequestBody StudentAssignment studentAssignment){
        return studentAssignmentService.updateStudentAssignment(studentAssignment);
    }

    @Operation(summary = "Delete Student-Assignment", description = "Delete specific Student-Assignment by id")
    @DeleteMapping("/delete/{id}")
    public void deleteStudentAssignment(@PathVariable int id){
        studentAssignmentService.deleteStudentAssignment(id);
    }

}
