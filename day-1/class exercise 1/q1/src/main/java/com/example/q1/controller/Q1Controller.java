package com.example.q1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Q1Controller {
    @GetMapping("/welcome")
    public String getMethodName() {
        return "Welcome Spring Boot!";
    }    
}