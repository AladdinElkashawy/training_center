package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Course;
import com.example.trainingcenter.entity.Instructor;
import com.example.trainingcenter.entity.Student;
import com.example.trainingcenter.service.CourseService;
import com.example.trainingcenter.service.InstructorService;
import com.example.trainingcenter.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Course API", description = "Course EndPoints to handle Course Operations")
@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @Autowired
    InstructorService instructorService;

    @Autowired
    StudentService studentService;

    @Operation(summary = "Get Course", description = "Fetch Course by id")
    @GetMapping("/{id}")
    Course getCourseById(@PathVariable int id){
        return courseService.getCourseById(id);
    }

    @Operation(summary = "Get all Courses", description = "Fetch all Courses")
    @GetMapping("/all")
    List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @Operation(summary = "Get Course Instructors", description = "Fetch all instructors for specific Course")
    @GetMapping("/course/instructors")
    List<Instructor> getAllCourseInstructors(@RequestParam int courseId){
        return instructorService.getCourseInstructors(courseId);
    }

    @Operation(summary = "Get Course Students", description = "Fetch all Students for specific Course")
    @GetMapping("/course/students")
    List<Student> getCourseStudents(@RequestParam int course_id){
        return studentService.getCourseStudents(course_id);
    }

    @Operation(summary = "Add Course", description = "Create new Course")
    @PostMapping("/add")
    Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @Operation(summary = "Update Course", description = "Update existing Course")
    @PutMapping("/update")
    Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @Operation(summary = "Delete Course", description = "Delete Course by id")
    @DeleteMapping("/delete/{id}")
    void deleteCourse(@PathVariable int id){
        courseService.deleteCourse(id);
    }

}
