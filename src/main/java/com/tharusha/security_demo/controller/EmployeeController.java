package com.tharusha.security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emps")
public class EmployeeController {

    @GetMapping("/")
    public String getEmployees(){
        return "All employees";
    }
}
