package com.examly.springapp.controller;


import com.examly.springapp.service.CustomerService;
import com.examly.springapp.exception.ResourceNotFoundException;
import com.examly.springapp.model.Customer;
import com.examly.springapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("https://8081-cfbaefceaafabbabfcdcbbdbeaabbeaeaadbdbabf.project.examly.io")
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

 @PostMapping
    public ResponseEntity<Boolean> createCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
         return  ResponseEntity.ok(true);
    }

 @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable long id) {
        Customer customer = customerService.getCustomerById(id);
        return ResponseEntity.ok(customer);
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<Customer> getCustomerByEmail(@PathVariable String email) {
        Customer customer = customerService.getCustomerByEmail(email);
        return ResponseEntity.ok(customer);
    }

 @PutMapping("{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable long id, @RequestBody Customer customerDetails) {
        Customer updatedCustomer = customerService.updateCustomer(id, customerDetails);
        return ResponseEntity.ok(updatedCustomer);
    }

 @DeleteMapping("{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable long id) {
        Customer customer=customerService.getCustomerById(id);
        customerService.deleteCustomer(id);
        return  ResponseEntity.ok(customer);
    }

}