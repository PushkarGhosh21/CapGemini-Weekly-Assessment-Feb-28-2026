package com.hiber.Hibernate_2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
				System.out.println("--- 1. INSERTING ---");
		Employee e1 = new Employee(9, "Sanju Samson", "sAnJu@gmail.com", "2026");
		Employee e2 = new Employee(18, "Virat Kohli", "virat@gmail.com", "1818");
		Employee e3 = new Employee(45, "Rohit Sharma", "rohit@gmail.com", "4545");
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		System.out.println("Inserted 3 employees.");

		// 2. RETRIEVING
		System.out.println("--- 2. RETRIEVING ---");
		// Using em.find() to get the employee with Primary Key 10
		Employee retrievedEmp = em.find(Employee.class, 18);
		System.out.println("Retrieved Employee: " + retrievedEmp);

		// 3. UPDATING
		System.out.println("--- 3. UPDATING ---");
		// To update, you simply use the setter methods on an entity that is currently managed by the EntityManager.
		// Hibernate automatically detects the change and will write an UPDATE query for us!
		e2.setMobile("2022202320242025"); 
		System.out.println("Updated Kohli's mobile number.");

		// 4. DELETING
		System.out.println("--- 4. DELETING ---");
		// You pass the managed entity object you want to delete to em.remove()
		em.remove(e3);
		System.out.println("Deleted Rohit Sharma from the database.");
   
		
		et.commit(); 
		
		System.out.println("Transaction committed successfully!");
		
		// Always close your resources!
		em.close();
		emf.close();
	}
}