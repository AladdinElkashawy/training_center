package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Assignment;
import com.example.trainingcenter.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignments")
public class AssignmentController {

    @Autowired
    AssignmentService assignmentService;

    @GetMapping("/all")
     List<Assignment> getAllCourses(){
        return assignmentService.getAllAssignments();
    }

    @GetMapping("/{id}")
     Assignment getAssignmentById(@PathVariable int id){
        return assignmentService.getAssignmentById(id);
    }

    @PostMapping("/add")
     Assignment addAssignment(@RequestBody Assignment assignment){
        return  assignmentService.createAssingment(assignment);
    }

    @PutMapping("/update")
     Assignment updateAssignment(@RequestBody Assignment assignment){
        return  assignmentService.updateAssignment(assignment);
    }

    @DeleteMapping("/delete/{id}")
     void deleteAssignment(@PathVariable int id){
        assignmentService.deleteAssignment(id);
    }

}
