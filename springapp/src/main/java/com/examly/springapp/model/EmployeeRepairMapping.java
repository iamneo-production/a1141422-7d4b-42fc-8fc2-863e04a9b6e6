package com.examly.springapp.model;
import javax.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "employee_repair_mapping")
public class EmployeeRepairMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "employee_id")
    private Long employeeId;
    @Column(name = "repair_id")
    private Long repairId;
}