package com.springboot2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot2.model.Employee_boot;
import com.springboot2.repo.EmployeeBootRepo;

@Service
public class EmployeeBootService {

	@Autowired
	private EmployeeBootRepo employeebootrepo;
	
	public Employee_boot save(Employee_boot emp)
	{
		return employeebootrepo.save(emp);
	}
	
	public List<Employee_boot>showAll()
	{
		return employeebootrepo.findAll();
	}
	
	public Employee_boot getById(int id) {
	    return employeebootrepo.findById(id).orElse(null);
	}
	
	public String deleteEmployee(int id) {
	    if (employeebootrepo.existsById(id)) {
	        employeebootrepo.deleteById(id);
	        return "Employee with ID " + id + " deleted successfully!";
	    }
	    return "Employee ID " + id + " not found.";
	}
	
	public Employee_boot updateName(int id, String newName) {
	    // 1. Find the existing employee by ID
	    Employee_boot existingEmployee = employeebootrepo.findById(id).orElse(null);
	    
	    if (existingEmployee != null) {
	        // 2. Update only the name field
	        existingEmployee.setName(newName);
	        
	        // 3. Save the updated object (JPA handles the UPDATE SQL automatically)
	        return employeebootrepo.save(existingEmployee);
	    }
	    
	    return null; // Or throw an exception if the ID doesn't exist
	}
}
