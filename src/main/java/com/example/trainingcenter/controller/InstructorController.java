package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Course;
import com.example.trainingcenter.entity.Instructor;
import com.example.trainingcenter.service.CourseService;
import com.example.trainingcenter.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructors")
public class InstructorController {

    @Autowired
    InstructorService instructorService;

    @Autowired
    CourseService courseService;

    @GetMapping("/{id}")
    Instructor getInstructorById(@PathVariable int id){
        return instructorService.getInstructorById(id);
    }

    @GetMapping("/all")
    List<Instructor> getAllInstructors(){
        return instructorService.getAllInstructors();
    }

    @GetMapping("/instructor/courses")
    List<Course> getAllInstructorCourses(@RequestParam int instructorId){
       return courseService.getInstructorCourses(instructorId);
    }

    @PostMapping("/add")
    Instructor addInstructor(@RequestBody Instructor instructor){
       return instructorService.addInstructor(instructor);
    }

    @PutMapping("/update")
    Instructor updateInstructor(@RequestBody Instructor instructor){
        return instructorService.updateInstructor(instructor);
    }

    @DeleteMapping("/delete/{id}")
    void deleteInstructor(@PathVariable int id){
        instructorService.deleteInstructor(id);
    }

}
