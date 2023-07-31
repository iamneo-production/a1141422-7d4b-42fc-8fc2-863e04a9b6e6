package com.examly.springapp.service;
import com.examly.springapp.model.EmployeeRepairMapping;
import com.examly.springapp.repository.EmployeeRepairMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EmployeeRepairMappingService {
    @Autowired
    private EmployeeRepairMappingRepository employeeRepairMappingRepository;
    public List<EmployeeRepairMapping> getAllEmployeeMappings() {
        return employeeRepairMappingRepository.findAll();
    }
    public EmployeeRepairMapping assignRepairIdToEmployee(Long employeeId, EmployeeRepairMapping em) {
        EmployeeRepairMapping mapping = new EmployeeRepairMapping();
        mapping.setEmployeeId(employeeId);
        mapping.setRepairId(em.getRepairId());
        return employeeRepairMappingRepository.save(mapping);
    }
}