package com.examly.springapp.repository;
import com.examly.springapp.model.EmployeeRepairMapping;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepairMappingRepository extends JpaRepository<EmployeeRepairMapping, Long> {
    EmployeeRepairMapping findByEmployeeId(Long employeeId);
}