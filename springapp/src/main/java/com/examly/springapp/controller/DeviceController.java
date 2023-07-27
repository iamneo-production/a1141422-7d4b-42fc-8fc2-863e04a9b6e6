package com.examly.springapp.controller;

import net.java.SpringbootBackend.exception.ResourceNotFoundException;
import net.java.SpringbootBackend.model.Device;
import net.java.SpringbootBackend.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")//
@RestController
@RequestMapping("/api/v1/devices")
public class DeviceController {
    @Autowired
    private DeviceRepository deviceRepository;
    @GetMapping
    public List<Device> getAllDevices(){
        return deviceRepository.findAll();
    }

// build create device REST API
    @PostMapping
    public Device createDevice(@RequestBody Device device)
    {
        return deviceRepository.save(device);

    }
    @GetMapping("{id}")
    // build get device by id REST API
    public ResponseEntity<Device> getDeviceById(@PathVariable long id){
        Device device=deviceRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Device not exist with id:"+id));
        return  ResponseEntity.ok(device);

    }
    //build update device REST API
    @PutMapping("{id}")
    public ResponseEntity<Device> updateDevice(@PathVariable long id,@RequestBody Device deviceDetails){
        Device updateDevice =deviceRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Device not exist with id:"+id));
        updateDevice.setBrand(deviceDetails.getBrand());
        updateDevice.setModel(deviceDetails.getModel());
        updateDevice.setType(deviceDetails.getType());

        deviceRepository.save(updateDevice);
        return ResponseEntity.ok(updateDevice);
    }
    @DeleteMapping("{id}")
    //build delete device REST API
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
        Device device =deviceRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Device not exist with id:"+id));
                deviceRepository.delete(device);

                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

