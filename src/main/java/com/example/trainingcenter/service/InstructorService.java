package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Instructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InstructorService {
    Instructor getInstructorById(int id);
    List<Instructor> getAllInstructors();
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    void deleteInstructor(int id);
    List<Instructor> getCourseInstructors(int course_id);
}

