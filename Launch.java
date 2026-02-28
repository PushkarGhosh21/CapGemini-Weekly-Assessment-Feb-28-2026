package com.hibernateassessment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch {
    public static void main(String[] args) {
        
        // 1. Configuration
        Configuration cfg = new Configuration();
        cfg.configure(); // Loads hibernate.cfg.xml
        cfg.addAnnotatedClass(Employee.class); 
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();

        try {
     
//            Employee newEmp = new Employee(18, "Virat K", "KINGk@gmail.com", "9876543210", 50000.0);
//            s.persist(newEmp);
//            System.out.println("Inserted: " + newEmp.getName());
//
//            
//            t.commit(); 
            
            // --- R: READ (Fetch employee by ID) ---
            t = s.beginTransaction(); // Start a new transaction for subsequent operations
            Employee fetchedEmp = s.get(Employee.class, 18);
            System.out.println("Fetched Employee: " + fetchedEmp);

//            // --- U: UPDATE (Update salary) ---
         if (fetchedEmp != null) {
             fetchedEmp.setSalary(75000.0); // Updating the salary as requested
               s.merge(fetchedEmp); // Merge pushes the update
              System.out.println("Updated Salary to: " + fetchedEmp.getSalary());
            }
//
//            // --- D: DELETE (Delete employee) ---
            if (fetchedEmp != null) {
                s.remove(fetchedEmp);
               System.out.println("Deleted Employee with ID: " + fetchedEmp.getId());
           }

            
            t.commit();
            
        } catch (Exception e) {
            if (t != null) {
				t.rollback();
			}
            e.printStackTrace();
        } finally {
            s.close();
            sf.close();
        }
    }
}