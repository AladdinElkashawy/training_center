package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Instructor;
import com.example.trainingcenter.entity.Staff;
import com.example.trainingcenter.repository.InstructorRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private InstructorRepository instructorRepository;

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
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor){
        Staff managedStaff = entityManager.find(Staff.class, instructor.getStaff().getId());
        instructor.setStaff(managedStaff);  // Ensure Staff is managed

        return instructorRepository.save(instructor);
    }

    @Override
    public void deleteInstructor(int id){
        instructorRepository.deleteById(id);
    }

}
