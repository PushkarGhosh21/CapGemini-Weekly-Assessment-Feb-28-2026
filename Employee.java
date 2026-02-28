package com.hibernateassessment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp") 
public class Employee {

    @Id
    @Column(name="EmpID")
    private int id;
    
    @Column
    private String name; 
    
    @Column
    private String email;
    
    @Column
    private String mobile;
    
    @Column
    private double salary; // Added salary field to meet requirements

    // No-argument constructor required by Hibernate
    public Employee() {}
    
    // Parameterized constructor
    public Employee(int id, String name, String email, String mobile, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + 
               ", mobile=" + mobile + ", salary=" + salary + "]";
    }
}