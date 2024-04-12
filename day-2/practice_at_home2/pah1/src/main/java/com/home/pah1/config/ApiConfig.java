package com.home.pah1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {
    @Value("${stu.name}")
    public String stuName;
    @Value("${stu.dept}")
    public String stuDept;
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public String getStuDept() {
        return stuDept;
    }
    public void setStuDept(String stuDept) {
        this.stuDept = stuDept;
    }
    

    
}
