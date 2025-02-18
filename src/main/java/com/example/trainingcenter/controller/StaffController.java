package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Staff;
import com.example.trainingcenter.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staffs")
public class StaffController {
    @Autowired
    StaffService staffService;

    @GetMapping("/{id}")
    Staff getStaffById(@PathVariable int id) {
        return staffService.getStaffById(id);
    }
    @GetMapping("/all")
    List<Staff> getAllStaffs() {
        return staffService.getAllStaffs();
    }
    @PostMapping("/add")
    Staff addStaff(@RequestBody Staff staff) {
        return staffService.addStaff(staff);
    }
    @PutMapping("/update")
    Staff updateStaff(@RequestBody Staff staff) {
        return staffService.updateStaff(staff);
    }
    @DeleteMapping("/delete/{id}")
    void deleteStaff(@PathVariable int id) {
        staffService.deleteStaff(id);
    }


}
