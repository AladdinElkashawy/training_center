package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Enrollment;
import com.example.trainingcenter.service.EnrollmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Enrollment API", description = "Enrollment EndPoints to handle Enrollment Operations")
@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {

    @Autowired
    EnrollmentService enrollmentService;

    @Operation(summary = "Get all Enrollments", description = "Fetch all Enrollments from database")
    @GetMapping("/all")
    List<Enrollment> getAllEnrollments(){
        return enrollmentService.getAllEnrollments();
    }

    @Operation(summary = "Get Enrollment", description = "Fetch an Enrollment by id")
    @GetMapping("/{id}")
    Enrollment getEnrollmentById(@PathVariable int id){
        return  enrollmentService.getEnrollmentById(id);
    }

    @Operation(summary = "Add Enrollment", description = "Insert new Enrollment")
    @PostMapping("/add")
    Enrollment addEnrollment(@RequestBody Enrollment enrollment){
        return enrollmentService.addEnrollment(enrollment);
    }

    @Operation(summary = "Update Enrollment", description = "Update existing Enrollment")
    @PutMapping("/update")
    Enrollment updateEnrollment(@RequestBody Enrollment enrollment){
        return  enrollmentService.updateEnrollment(enrollment);
    }

    @Operation(summary = "Delete Enrollment", description = "Delete specific Enrollment by id")
    @DeleteMapping("/delete/{id}")
    void deleteEnrollment(@PathVariable int id){
        enrollmentService.deleteEnrollmentById(id);
    }
}
