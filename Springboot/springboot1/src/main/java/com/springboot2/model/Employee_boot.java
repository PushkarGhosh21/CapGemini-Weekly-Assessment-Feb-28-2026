package com.springboot2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeBoot")
public class Employee_boot 
{
	@Id
	
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String mobile;

	
	
	public Employee_boot(int id, String name, String email, String mobile) 
	{
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

   
	public Employee_boot() 
	{
		
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	
	

}
