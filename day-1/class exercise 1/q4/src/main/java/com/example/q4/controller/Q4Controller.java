package com.example.q4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q4.model.Address;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Q4Controller {
    @GetMapping("/address")
      public Object add()
      {
        Address address=new Address();
        address.setDno(123);
        address.setStname("Main Street");
        return address;
        
      }
    }
    
    

