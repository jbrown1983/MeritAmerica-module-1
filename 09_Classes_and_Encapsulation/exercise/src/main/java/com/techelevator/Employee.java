package com.techelevator;

public class Employee {
    //instance variables
    private int employeeId;
    public String firstName;
    public String lastName;
    private String department;
    private double annualSalary;


    public Employee(int employeeId, String firstName, String lastName, double annualSalary) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.annualSalary = annualSalary;
    }

    //Derived
    public String getFullName() {
        return this.lastName+","+" "+this.firstName;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDepartment() {
        return department;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public void setDepartment(String department) {
        this.department = department;

    }
    public void raiseSalary(double percent) {
        annualSalary += annualSalary * (percent / 100 );
         System.out.printf("%.2f", annualSalary);


    }

    }

