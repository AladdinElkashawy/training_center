package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Course;
import com.example.trainingcenter.entity.CourseInstructor;
import com.example.trainingcenter.entity.Enrollment;
import com.example.trainingcenter.repository.CourseInstructorRepository;
import com.example.trainingcenter.repository.CourseRepository;
import com.example.trainingcenter.repository.EnrollmentRepository;
import com.example.trainingcenter.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseInstructorRepository courseInstructorRepository;

    @Autowired
    InstructorRepository instructorRepository;

    @Autowired
    EnrollmentRepository enrollmentRepository;

    @Override
    public Course getCourseById(int id){
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(int id) {
        courseRepository.deleteById(id);
    }

    @Override
    public List<Course> getInstructorCourses(int instructor_id) {
        List<CourseInstructor> instructorCourses = courseInstructorRepository.findByInstructorId(instructor_id);
        List<Course> courses = new ArrayList<>();
        for(CourseInstructor course : instructorCourses){
            Optional<Course> courseData = courseRepository.findById(course.getCourse().getId());
            courses.add(courseData.orElseThrow());
        }
        return courses;
    }

    @Override
    public List<Course> getStudentCourses(int student_id) {
        List<Enrollment> studentCourses = enrollmentRepository.findByStudentId(student_id);
        List<Course> courses = new ArrayList<>();
        for(Enrollment course : studentCourses){
            Optional<Course> courseData = courseRepository.findById(course.getCourse().getId());
            courses.add(courseData.orElseThrow());
        }
        return courses;
    }

}
