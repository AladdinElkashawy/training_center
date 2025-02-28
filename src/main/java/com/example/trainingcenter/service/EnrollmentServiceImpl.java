package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Course;
import com.example.trainingcenter.entity.Enrollment;
import com.example.trainingcenter.entity.Student;
import com.example.trainingcenter.repository.CourseRepository;
import com.example.trainingcenter.repository.EnrollmentRepository;
import com.example.trainingcenter.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    EnrollmentRepository enrollmentRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    @Override
    public Enrollment getEnrollmentById(int id) {
        return enrollmentRepository.findById(id).orElseThrow();
    }

    @Override
    public Enrollment addEnrollment(Enrollment enrollment) {
        if(enrollment.getCourse()==null){
            //Save Course First
            Course savedCourse = courseRepository.save(enrollment.getCourse());
            enrollment.setCourse(savedCourse);
        }
        if(enrollment.getStudent()==null){
            //Save Student First
            Student savedStudent = studentRepository.save(enrollment.getStudent());
            enrollment.setStudent(savedStudent);
        }
        return enrollmentRepository.save(enrollment);
    }

    @Override
    public Enrollment updateEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    @Override
    public void deleteEnrollmentById(int id) {
        enrollmentRepository.deleteById(id);
    }
}
