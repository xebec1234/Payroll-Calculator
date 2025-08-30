/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myapp.service;

/**
 *
 * @author admin
 */

import myapp.model.Employee;

public class PayrollCalculator {
    //contributions deductions
     public double philhealthDeduction(Employee emp) {
        return (emp.getSalary() * 0.05) / 2;
     }
     
     public double pagibigDeduction(Employee emp) {
        return  10000 * 0.02;
     }
     
     public double sssDeduction(Employee emp) {
        double salary = emp.getSalary();
            if (salary > 35000) {
               return salary = 35000 * 0.05;
            } else {
               return salary = salary * 0.05;
            }
     }
     
     //late deductions
     public double lateDeduction(Employee emp) {
        return emp.getLate() * 100;
    }
     
     //taxable
     public double taxDeductions(Employee emp) {
         double taxableIncome = (emp.getSalary() - philhealthDeduction(emp) - pagibigDeduction(emp) - sssDeduction(emp)) / 12;
         return emp.getSalary() - taxableIncome;
     }
     
     //total Deductions
    public double calculateTotalDeductions( Employee emp) {
        return  taxDeductions(emp) +  philhealthDeduction(emp) + pagibigDeduction(emp) + sssDeduction(emp);
     }
     
    //total take home pay
    public double calculateTakeHomePay(Employee emp) {
        return emp.getSalary() - calculateTotalDeductions(emp);
    }
    
}
