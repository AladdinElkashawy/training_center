package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Course;
import com.example.trainingcenter.entity.Instructor;
import com.example.trainingcenter.service.CourseService;
import com.example.trainingcenter.service.InstructorService;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Instructor API", description = "Instructor End points to handle Instructor Operations")
@RestController
@RequestMapping("/instructors")
public class InstructorController {

    @Autowired
    InstructorService instructorService;

    @Autowired
    CourseService courseService;

    @Operation(summary = "Get Instructor", description = "Fetch Instructor by id")
    @GetMapping("/{id}")
    Instructor getInstructorById(@PathVariable int id){
        return instructorService.getInstructorById(id);
    }

    @Operation(summary = "Get all Instructors", description = "Fetch all Instructors from database")
    @GetMapping("/all")
    List<Instructor> getAllInstructors(){
        return instructorService.getAllInstructors();
    }

    @Operation(summary = "Get Courses of an Instructor", description = "Fetch all courses that an instructor teaches")
    @GetMapping("/instructor/courses")
    List<Course> getAllInstructorCourses(@RequestParam int instructorId){
       return courseService.getInstructorCourses(instructorId);
    }

    @Operation(summary = "Add Instructor", description = "Add Instructor into database")
    @PostMapping("/add")
    Instructor addInstructor(@RequestBody Instructor instructor){
       return instructorService.addInstructor(instructor);
    }

    @Operation(summary = "Update Instructor", description = "Update an Instructor by sending Instructor body")
    @PutMapping("/update")
    Instructor updateInstructor(@RequestBody Instructor instructor){
        return instructorService.updateInstructor(instructor);
    }

    @Operation(summary = "Delete Instructor by id", description = "Delete a specific instructor by passing instructor id")
    @DeleteMapping("/delete/{id}")
    void deleteInstructor(@PathVariable int id){
        instructorService.deleteInstructor(id);
    }

}
