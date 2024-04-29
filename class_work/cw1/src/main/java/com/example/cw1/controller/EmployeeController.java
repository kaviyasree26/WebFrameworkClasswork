package com.example.cw1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cw1.model.Employee;
import com.example.cw1.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class EmployeeController
{
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    
    // @PostMapping("/employee")
    // public Employee postMethodEmployee(@RequestBody Employee employee) 
    // {
    //    return employeeService.savEmployee(employee);
    // }

      @PostMapping("/employee")
    public ResponseEntity<Object> postMethodEmployee(@RequestBody Employee employee) 
    {
        try 
        {
            Employee savedEmployee = employeeService.savEmployee(employee);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
        } catch (Exception e) 
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }

    // @GetMapping("/employee")
    // public List<Employee> getMethodEmployee() 
    // {
    //     return employeeService.getAllEmployee();
    // }
    

    @GetMapping("/employee")
    public ResponseEntity<Object> getMethodEmployee() {
        try {
            List<Employee> employees = employeeService.getAllEmployee();
            if (employees.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No employees found.");
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(employees);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }



    // @GetMapping("/employee/{employeeId}")
    // public Employee getMethodEmployeeId(@PathVariable("employeeId") int id) 
    // {
    //     return employeeService.findEmployee(id);
    // }
           
    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<Object> getMethodEmployeeId(@PathVariable("employeeId") int id) {
        try {
            Employee employee = employeeService.findEmployee(id);
            if (employee == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found for ID: " + id);
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(employee);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }

}
