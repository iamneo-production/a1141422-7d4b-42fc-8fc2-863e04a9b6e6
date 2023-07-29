package com.examly.springapp.repository;


import net.java.SpringbootBackend.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DeviceRepository extends JpaRepository <Device,Long> {
    //all curd database methods

}
