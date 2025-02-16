package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
}