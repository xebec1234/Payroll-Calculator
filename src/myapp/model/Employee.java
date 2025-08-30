/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myapp.model;

/**
 *
 * @author admin
 */
public class Employee {
    private String name;
    private String department;
    
    private double salary;
    private double philhealth;
    private double pagibig;
    private double sss;
    private int late;
    private double tax;
    
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    
    public void setPhilhealth(double philhealth) { this.philhealth = philhealth; }
    public void setPagibig(double pagibig) { this.pagibig = pagibig; }
    public void setSss(double sss) { this.sss = sss; }
    public void setLate(int late) { this.late = late; }
    public void setTax(double tax) {this.tax = tax; }
    
    public double getPhilhealth() { 
        return philhealth;
    }
    public double getPagibig() {
        return pagibig;
    }
    public double getSss() {
        return sss;
    }
    public int getLate() {
        return late;
    }
    public double getTax() {
        return tax;
    }
        
    
}
