package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Staff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StaffService {
Staff getStaffById(int id);
List<Staff> getAllStaffs();
Staff addStaff(Staff staff);
Staff updateStaff(Staff staff);
void deleteStaff(int id);
}
