package com.mapping.Hibernates;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        // 1. Initialize the EntityManagerFactory using the unit name in persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // 2. Create the Customer
        Customer customer = new Customer();
        customer.setCustomerName("Pushkar Ghosh");
        customer.setEmail("pushkar@example.com");
        customer.setGender("Male");
        customer.setPhone(9876543210L);
        customer.setRegistrationDate(LocalDate.now());

        // 3. Create the Order
        Order order = new Order();
        order.setOrderNumber("ORD-999");
        order.setProductName("Laptop");
        order.setQuantity(1);
        order.setPrice(75000.00);
        order.setOrderDate(LocalDate.now());

        // 4. Link the two (Bidirectional relationship)
        customer.setOrder(order);
        order.setCustomer(customer);

        // 5. Persist the customer (the order will be saved automatically due to cascade)
        em.persist(customer);

        em.getTransaction().commit();
        
        System.out.println("Mapping test successful! Check your database.");

        em.close();
        emf.close();
    }
}