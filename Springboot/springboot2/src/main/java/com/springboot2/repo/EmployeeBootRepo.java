package com.springboot2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot2.model.Employee_boot;


@Repository
public interface EmployeeBootRepo extends JpaRepository<Employee_boot, Integer> 
{

}
