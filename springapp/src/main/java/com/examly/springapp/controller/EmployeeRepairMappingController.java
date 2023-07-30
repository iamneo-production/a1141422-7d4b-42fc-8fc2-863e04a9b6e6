package com.examly.springapp.controller;
import com.examly.springapp.Service.EmployeeRepairMappingService;
import com.examly.springapp.model.EmployeeRepairMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/employeeRepairMapping")
public class EmployeeRepairMappingController {

    @Autowired
    private EmployeeRepairMappingService employeeRepairMappingService;


    @GetMapping
    public List<EmployeeRepairMapping> getAllEmployeeMappings() {
        return employeeRepairMappingService.getAllEmployeeMappings();
    }

    @PutMapping("/assignRepairIdToEmployee/{employeeId}")
    public EmployeeRepairMapping assignRepairIdToEmployee(@PathVariable Long employeeId, @RequestBody EmployeeRepairMapping emp) {
        return employeeRepairMappingService.assignRepairIdToEmployee(employeeId, emp);
    }
}


