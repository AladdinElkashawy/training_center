package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Course;
import com.example.trainingcenter.entity.CourseInstructor;
import com.example.trainingcenter.entity.Instructor;
import com.example.trainingcenter.entity.Staff;
import com.example.trainingcenter.repository.CourseInstructorRepository;
import com.example.trainingcenter.repository.CourseRepository;
import com.example.trainingcenter.repository.InstructorRepository;
import com.example.trainingcenter.repository.StaffRepository;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InstructorServiceImpl implements InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseInstructorRepository courseInstructorRepository;

    @Override
    public Instructor getInstructorById(int id){
       return instructorRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Instructor> getAllInstructors(){
        return instructorRepository.findAll();
    }

    @Override
    public Instructor addInstructor(Instructor instructor){
        if(instructor.getStaff()==null){
            // Save Staff first
            Staff savedStaff = staffRepository.save(instructor.getStaff());
            instructor.setStaff(savedStaff);
        }

        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor){
        return instructorRepository.save(instructor);
    }

    @Override
    public void deleteInstructor(int id){
        instructorRepository.deleteById(id);
    }

    @Override
    public List<Instructor> getCourseInstructors(int course_id) {
        List<CourseInstructor> courseInstructors = courseInstructorRepository.findByCourseId(course_id);
        List<Instructor> instructors = new ArrayList<>();
        for(CourseInstructor instructor : courseInstructors){
            Optional<Instructor> instructorData = instructorRepository.findById(instructor.getInstructor().getId());
            instructors.add(instructorData.orElseThrow());
        }
        return instructors;
    }

}
