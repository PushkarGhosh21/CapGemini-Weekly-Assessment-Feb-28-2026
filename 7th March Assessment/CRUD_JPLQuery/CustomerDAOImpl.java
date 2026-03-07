package com.mapping.Hibernates;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class CustomerDAOImpl {
    private EntityManager em;

    public CustomerDAOImpl(EntityManager em) {
        this.em = em;
    }

    // 1. Insert customer (cascade saves the order automatically)
    public void saveCustomer(Customer customer) {
        em.persist(customer);
    }

    // 2. Update customer details
    public void updateCustomer(Customer customer) {
        em.merge(customer);
    }

    // 3. Delete customer
    public void deleteCustomer(int id) {
        Customer c = em.find(Customer.class, id);
        if (c != null) {
            em.remove(c);
        }
    }

    // 4. Fetch customer by id
    public Customer getCustomerById(int id) {
        return em.find(Customer.class, id);
    }

    // 5. Fetch all customers
    public List<Customer> getAllCustomers() {
        return em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
    }

    // JPQL Query: Fetch Customer by email
    public Customer getCustomerByEmail(String email) {
        String jpql = "SELECT c FROM Customer c WHERE c.email = :email";
        TypedQuery<Customer> query = em.createQuery(jpql, Customer.class);
        query.setParameter("email", email);
        return query.getSingleResult();
    }
}