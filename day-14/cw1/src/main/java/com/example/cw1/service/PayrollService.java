package com.example.cw1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cw1.model.Employee;
import com.example.cw1.model.Payroll;
import com.example.cw1.repository.EmployeeRepo;
import com.example.cw1.repository.PayrollRepo;

@Service
public class PayrollService {
    @Autowired
    private PayrollRepo payrollRepo;
    @Autowired
    private EmployeeRepo employeeRepo;

    public Payroll savePayroll(Payroll payroll)
    {
        return payrollRepo.save(payroll);
    }
    public Payroll createPayroll(long employeeId,Payroll payroll)
    {
        Employee e=employeeRepo.findById(employeeId).orElse(null);
        e.setPayroll(payroll);
        return payrollRepo.save(payroll);
    }
    public Payroll getPayrollByEmployeeId(long employeeId)
    {
        return payrollRepo.findBypayrollid(employeeId);
    }
    
}
