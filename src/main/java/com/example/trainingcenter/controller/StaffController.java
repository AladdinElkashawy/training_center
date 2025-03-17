package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Staff;
import com.example.trainingcenter.service.StaffService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Staff API", description = "Staff End Points to handle Staff Operations")
@RestController
@RequestMapping("/staffs")
public class StaffController {
    @Autowired
    StaffService staffService;

    @Operation(summary = "Get Staff", description = "Get Staff by id")
    @GetMapping("/{id}")
    Staff getStaffById(@PathVariable int id) {
        return staffService.getStaffById(id);
    }

    @Operation(summary = "Get all Staff", description = "Fetch all Staff from database")
    @GetMapping("/all")
    List<Staff> getAllStaffs() {
        return staffService.getAllStaffs();
    }

    @Operation(summary = "Add Staff", description = "insert a new Staff into database")
    @PostMapping("/add")
    Staff addStaff(@RequestBody Staff staff) {
        return staffService.addStaff(staff);
    }

    @Operation(summary = "Update Staff", description = "Update existing Staff")
    @PutMapping("/update")
    Staff updateStaff(@RequestBody Staff staff) {
        return staffService.updateStaff(staff);
    }

    @Operation(summary = "Delete Staff", description = "Delete a specific Staff by id")
    @DeleteMapping("/delete/{id}")
    void deleteStaff(@PathVariable int id) {
        staffService.deleteStaff(id);
    }


}
