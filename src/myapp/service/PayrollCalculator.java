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
    
    //calculates salary by subtracting all the necesssary deduction
    public void computeDeductions(Employee emp) {
        int late = (emp.getLate() * 100);
        double salary = emp.getSalary() - late;
        
        double philhealth = (salary* 0.05) / 2;
        double pagibig = 10000 *0.02;
        double sss = (salary >= 35000 ? 35000 *0.05 : salary * 0.05);
        double tax = (salary - philhealth - pagibig - sss) / 12;
        
        emp.setPhilhealth(philhealth);
        emp.setPagibig(pagibig);
        emp.setSss(sss);
        emp.setLate(late);
        emp.setTax(tax);
    }
     
     //total Deductions
    public double calculateTotalDeductions( Employee emp) {
        return  emp.getPhilhealth() + emp.getPagibig() + emp.getSss () + emp.getTax() + emp.getLate();
     }
    //total take home pay
    public double calculateTakeHomePay(Employee emp) {
        return emp.getSalary() - calculateTotalDeductions(emp);
    }
    
}
