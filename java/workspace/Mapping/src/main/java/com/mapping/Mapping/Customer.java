package com.mapping.Mapping;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "CUSTOMER")
public class Customer {
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NAME")
	private String name;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerdetails")
	private Customer_Details customerdetails;
	
	
	public Customer_Details getCustomerdetails() {
		return customerdetails;
	}
	public void setCustomerdetails(Customer_Details customerdetails) {
		this.customerdetails = customerdetails;
	}

	public Customer(int id, String name) {
		this.id=id;
		this.name = name;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
