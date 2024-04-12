package com.example.pah1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AppController {
    @GetMapping("/hello")
    public String getMethodName() {
        return "Hello World!";
    }
    
    
}
