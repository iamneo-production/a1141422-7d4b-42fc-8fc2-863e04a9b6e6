package com.examly.springapp.controller;

import com.examly.springapp.service.RepairService;
import com.examly.springapp.model.*;
import com.examly.springapp.repository.CustomerRepository;
import com.examly.springapp.repository.DeviceRepository;
import com.examly.springapp.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("https://8081-bfdeafdeafbfdbaeeabfcdcbbdbeaabbeaeaadbdbabf.project.examly.io")
@RestController
@RequestMapping("/repairs")
public class RepairController {
    @Autowired
    private RepairRepository repairRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    private RepairService repairService;


    @GetMapping
    public List<Repair> getAllRepairs() {
        return repairService.getAllRepairs();
    }
   
    @PostMapping
    public ResponseEntity<Repair> createRepair(@RequestBody RepairRequest repairRequest) {
        Repair repair = repairService.createRepair(repairRequest);
        return ResponseEntity.ok(repair);
    }

    @PutMapping("{id}")
    public ResponseEntity<Repair> updateRepair(@PathVariable int id,@RequestBody RepairRequest repairRequest) {
        Repair repair = repairService.updateRepair(id,repairRequest);
        return ResponseEntity.ok(repair);
    }


    @GetMapping("{id}")
    public ResponseEntity<Repair> getRepairById(@PathVariable int id) {
        Repair repair = repairService.getRepairById(id);
        return ResponseEntity.ok(repair);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteRepair(@PathVariable int id) {
        repairService.deleteRepair(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}