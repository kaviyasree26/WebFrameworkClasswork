package com.example.q3.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Q3Controller {
    @GetMapping("/favouriteColor")
    public String getMethodName(@RequestParam String param) {
        return "My Favourite Color is "+param+" !";
    }
    
}
