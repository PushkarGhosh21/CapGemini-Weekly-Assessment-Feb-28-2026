package com.mapping.Hibernates;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String customerName;
    private String email;
    private String gender;
    private long phone;
    private LocalDate registrationDate;

    // mappedBy points to the 'customer' variable in the Order class
    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Order order;

    public Customer() {}

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    
    public long getPhone() { return phone; }
    public void setPhone(long phone) { this.phone = phone; }
    
    public LocalDate getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(LocalDate registrationDate) { this.registrationDate = registrationDate; }
    
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
}