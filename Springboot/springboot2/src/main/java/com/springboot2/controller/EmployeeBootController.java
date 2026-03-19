package com.springboot2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot2.model.Employee_boot;
import com.springboot2.service.EmployeeBootService;

@RestController
public class EmployeeBootController {

	@Autowired
	private EmployeeBootService employeebootservice;
	
	@PostMapping("/add")
	public Employee_boot save(@RequestBody Employee_boot emp)
	{
		return employeebootservice.save(emp);
	}
	
	@GetMapping("/display")
	public List<Employee_boot>show()
	{
		return employeebootservice.showAll();
	}
	
	@GetMapping("/get/{id}")
	public Employee_boot getById(@PathVariable int id) {
	    return employeebootservice.getById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
	    return employeebootservice.deleteEmployee(id);
	}
	
	@PutMapping("/update/{id}")
	public Employee_boot update(@PathVariable int id, @RequestParam String name) {
	    return employeebootservice.updateName(id, name);
	}
}
