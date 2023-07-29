package com.examly.springapp.service.impl;


import com.examly.springapp.Dto.CustmDTO;
import com.examly.springapp.Dto.LoginDTO;
import com.examly.springapp.Entity.CustmLogin_Enty;
import com.examly.springapp.Repo.CustmLoginRepo;
import com.examly.springapp.Service.CustmLoginService;
import com.examly.springapp.response.LoginResponse2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service

public class CustmLoginIMPL implements CustmLoginService {

    
    @Autowired
    private CustmLoginRepo custmLoginRepo;


    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public String addEmployee(CustmDTO custmDTO) {

        CustmLogin_Enty custmLoginEnty = new CustmLogin_Enty(

                custmDTO.getCustmid(),
                custmDTO.getCustname(),
                custmDTO.getEmail(),

                this.passwordEncoder.encode(custmDTO.getPassword())
        );

        custmLoginRepo.save(custmLoginEnty);

        return custmLoginEnty.getCustmname();
    }
    CustmDTO custmDTO;

    @Override
    public LoginResponse2 loginEmployee(LoginDTO loginDTO) {

        String msg = "";
        CustmLogin_Enty custmLoginEnty1 = custmLoginRepo.findByEmail(loginDTO.getEmail());

        if (custmLoginEnty1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = custmLoginEnty1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {

                Optional<CustmLogin_Enty> employee = custmLoginRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginResponse2("Login Success", true, loginDTO.getEmail());
                }
                 else {
                    return new LoginResponse2("Login Failed", false,"d");
                }
            } 
            else {

                return new LoginResponse2("password Not Match", false,"d");
            }
        }
        else {

            return new LoginResponse2("Email not exits", false,"d");
        }


    }



}