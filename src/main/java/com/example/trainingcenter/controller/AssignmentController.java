package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Assignment;
import com.example.trainingcenter.service.AssignmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Assignment API", description = "Assigment Endpoints to handle Assignment Operations")
@RestController
@RequestMapping("/assignments")
public class AssignmentController {

    @Autowired
    AssignmentService assignmentService;

    @Operation(summary = "Get all Assignments", description = "Fetch all Assignments in database")
    @GetMapping("/all")
     List<Assignment> getAllCourses(){
        return assignmentService.getAllAssignments();
    }

    @Operation(summary = "Get Assignment", description = "Fetch specific Assignment by id")
    @GetMapping("/{id}")
     Assignment getAssignmentById(@PathVariable int id){
        return assignmentService.getAssignmentById(id);
    }

    @Operation(summary = "Add Assignment", description = "Create new Assignment")
    @PostMapping("/add")
     Assignment addAssignment(@RequestBody Assignment assignment){
        return  assignmentService.createAssingment(assignment);
    }

    @Operation(summary = "Update Assignment", description = "Update existing Assignment")
    @PutMapping("/update")
     Assignment updateAssignment(@RequestBody Assignment assignment){
        return  assignmentService.updateAssignment(assignment);
    }

    @Operation(summary = "Delete Assignment", description = "Delete Assignment by id")
    @DeleteMapping("/delete/{id}")
     void deleteAssignment(@PathVariable int id){
        assignmentService.deleteAssignment(id);
    }

}
