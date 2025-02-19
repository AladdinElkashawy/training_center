package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Course;
import com.example.trainingcenter.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/{id}")
    Course getCourseById(@PathVariable int id){
        return courseService.getCourseById(id);
    }

    @GetMapping("/all")
    List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @PostMapping("/add")
    Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @PutMapping("/update")
    Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/delete/{id}")
    void deleteCourse(@PathVariable int id){
        courseService.deleteCourse(id);
    }

}
