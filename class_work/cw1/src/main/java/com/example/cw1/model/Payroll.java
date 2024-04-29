package com.example.cw1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payroll
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long payrollid;
    private double amount;
    private int noOfDaysWorked;
}
