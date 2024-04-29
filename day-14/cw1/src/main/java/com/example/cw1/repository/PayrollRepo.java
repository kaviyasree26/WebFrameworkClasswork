package com.example.cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cw1.model.Payroll;

public interface PayrollRepo extends JpaRepository<Payroll,Long> 
{
    Payroll findBypayrollid(long employeeId);
}
