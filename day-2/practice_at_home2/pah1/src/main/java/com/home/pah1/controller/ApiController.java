package com.home.pah1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.home.pah1.config.ApiConfig;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController 
{
    @Autowired
    public ApiConfig apiConfig;
    @GetMapping("/info")
    public String getDetails() 
    {
        return "Name:"+apiConfig.getStuName()+ ",Department:"+apiConfig.getStuDept();
        // return apiConfig;
    }
    
}
