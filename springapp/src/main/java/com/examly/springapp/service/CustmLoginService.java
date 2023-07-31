package com.examly.springapp.service;

import com.examly.springapp.Dto.CustmDTO;
import com.examly.springapp.Dto.LoginDTO;
import com.examly.springapp.response.LoginResponse2;

public interface CustmLoginService {
    String addEmployee(CustmDTO custmDTO);

    LoginResponse2 loginEmployee(LoginDTO loginDTO);
}
