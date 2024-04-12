package com.example.q5.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q5.models.Student;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Q5Controller {
    @GetMapping("/student")
    public List<Student> getList()
    {
        List <Student> stu=new ArrayList<>();
        Student stu1=new Student();
        stu1.setStuname("Kaviya");
        stu1.setMessage("Welcome Kaviya");
        stu.add(stu1);
        return stu;
    }
    
    
    
    
}
