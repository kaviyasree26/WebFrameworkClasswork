package com.example.q3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q3.model.Student;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {
    @GetMapping("/student")
    public Object getObject() {
       Student student=new Student();
       student.setId(1L);
       student.setName("John Doe");
       student.setDesc("This is a student description");
       return student;
       

    }
    
    
}
