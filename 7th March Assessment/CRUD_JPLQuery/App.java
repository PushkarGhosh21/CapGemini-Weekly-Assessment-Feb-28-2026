package com.mapping.Hibernates;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        CustomerDAOImpl customerDAO = new CustomerDAOImpl(em);
        OrderDAOImpl orderDAO = new OrderDAOImpl(em);

        em.getTransaction().begin();

        // Perform CRUD operations...
        // Example: Fetch by email using your JPQL query
        try {
            Customer c = customerDAO.getCustomerByEmail("pushkar@example.com");
            System.out.println("Found customer: " + c.getCustomerName());
        } catch (Exception e) {
            System.out.println("Customer not found.");
        }

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}