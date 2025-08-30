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
    
    public double calculateTotalDeductions( Employee emp) {
        double salary = emp.getSalary();
        
        double philhealth = emp.getPhilhealth();
        philhealth = (salary * 0.05) / 2;
        
        double pagibig = emp.getPagibig();
        pagibig = 10000 * 0.02;
        
        double sss = emp.getSss();
        if (sss > 35000) {
            sss = 35000 * 0.05;
        } else {
            sss= salary * 0.05;
        }
        
        double totalContribution = pagibig + sss + philhealth;
        double totalTaxableIncome = salary - totalContribution;
        
        double totalTax = emp.getTax();
        return  totalTaxableIncome / totalTaxableIncome;
     }
    
    public double calculateTakeHomePay(Employee emp) {
        return emp.getSalary() - calculateTotalDeductions(emp);
    }
    
}
