package com.example.q2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    @JsonProperty("student_name")
    private String name;
    @JsonProperty("student_age")
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
