package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Enrollment;
import com.example.trainingcenter.service.EnrollmentService;
import com.example.trainingcenter.service.EnrollmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {

    @Autowired
    EnrollmentService enrollmentService;

    @GetMapping("/all")
    List<Enrollment> getAllEnrollments(){
        return enrollmentService.getAllEnrollments();
    }

    @GetMapping("/{id}")
    Enrollment getEnrollmentById(@PathVariable int id){
        return  enrollmentService.getEnrollmentById(id);
    }

    @PostMapping("/add")
    Enrollment addEnrollment(@RequestBody Enrollment enrollment){
        return enrollmentService.addEnrollment(enrollment);
    }

    @PutMapping("/update")
    Enrollment updateEnrollment(@RequestBody Enrollment enrollment){
        return  enrollmentService.updateEnrollment(enrollment);
    }

    @DeleteMapping("/delete/{id}")
    void deleteEnrollment(@PathVariable int id){
        enrollmentService.deleteEnrollmentById(id);
    }
}
