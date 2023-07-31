package com.examly.springapp.CustmController;

import com.examly.springapp.Dto.CustmDTO;
import com.examly.springapp.Dto.LoginDTO;
import com.examly.springapp.service.CustmLoginService;
import com.examly.springapp.response.LoginResponse2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("https://8081-abdabbeccfbbabfcdcbbdbeaabbeaeaadbdbabf.project.examly.io")
@RequestMapping("api/v1/custmlogin")
public class CustmController {


    @Autowired
    private CustmLoginService custmLoginService;


    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody CustmDTO custmDTO)
    {
        String id = custmLoginService.addEmployee(custmDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse2 loginResponse = custmLoginService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}