package com.example.cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cw1.model.Employee;
import com.example.cw1.repository.EmployeeRepo;

@Service
public class EmployeeService 
{
     @Autowired
     private EmployeeRepo employeeRepo;
     public Employee savEmployee(Employee employee)
     {
        return employeeRepo.save(employee);
     }    
     public Employee getEmpId(long id)
     {
        return employeeRepo.findById(id).orElse(null);
     }
     public List<Employee> getAllEmployee()
     {
        return employeeRepo.findAll();
     }
     public Employee findEmployee(long id)
     {
        return employeeRepo.findById(id).orElse(null);
     }
}
