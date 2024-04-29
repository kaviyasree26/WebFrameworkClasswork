package com.example.cw1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw1.model.Payroll;
import com.example.cw1.service.PayrollService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
public class PayrollController 
{
    @Autowired
    private PayrollService payrollService;
    // @PostMapping("/payroll")//without status code
    // public Payroll postMethodPay(@RequestBody Payroll payroll)
    // {
    //     return payrollService.savePayroll(payroll);
    // }
     
    @PostMapping("/payroll")
    public ResponseEntity<Object> postMethodPay(@RequestBody Payroll payroll) {
        try {
            Payroll savedPayroll = payrollService.savePayroll(payroll);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedPayroll);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }


    // @PostMapping("/employee/{employeeId}/payroll")
    // public Payroll postMethodPayroll(@RequestBody Payroll payroll,@PathVariable ("employeeId") int id) 
    // {
        //    Payroll p=payrollService.createPayroll(id, payroll);
        //    return p;
        // }
        @GetMapping("/employee/{employeeId}/payroll")
    public ResponseEntity<Object> getMethodPayObject(@PathVariable("employeeId") int id) {
        try {
            Payroll payroll = payrollService.getPayrollByEmployeeId(id);
            if (payroll == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Payroll not found for employee ID: " + id);
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(payroll);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }


    // @GetMapping("/employee/{employeeId}/payroll")
    // public Payroll getMethodPayObject(@PathVariable("employeeId") int id) 
    // {
    //  Payroll p=payrollService.getPayrollByEmployeeId(id);
    //  return p;   
    // }

    
    
    
}
