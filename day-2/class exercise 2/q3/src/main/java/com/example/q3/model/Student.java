package com.example.q3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {
    long id;
    String name;
    @JsonIgnore
    String desc;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
}
