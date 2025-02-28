package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    Course updateCourse(Course course);
    void deleteCourse(int id);
    List<Course> getInstructorCourses(int instructor_id);
    List<Course> getStudentCourses(int student_id);
}
