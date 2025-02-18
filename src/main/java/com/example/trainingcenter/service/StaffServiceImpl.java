package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Staff;
import com.example.trainingcenter.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Staff getStaffById(int id) {
        return staffRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Staff> getAllStaffs() {
        return staffRepository.findAll();
    }

    @Override
    public Staff addStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public Staff updateStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public void deleteStaff(int id) {
    staffRepository.deleteById(id);
    }
}
