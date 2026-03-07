package com.mapping.Hibernates;

import jakarta.persistence.EntityManager;

public class OrderDAOImpl {
    private EntityManager em;

    public OrderDAOImpl(EntityManager em) {
        this.em = em;
    }

    // 6. Update order details
    public void updateOrder(Order order) {
        em.merge(order);
    }

    // Fetch order by id
    public Order getOrderById(int id) {
        return em.find(Order.class, id);
    }
}