package com.mapping.Mapping;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
public class App
{
   public static void main( String[] args )
   {
	   //Insert
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction et = em.getTransaction();
//        et.begin();
//        Customer c = new Customer(11,"Anirban");
//        Customer_Details cd = new Customer_Details(11,"Anirban","rhino@gmail.com",981234650L,55000);
//        c.setCustomerdetails(cd);
//        em.persist(c);
//        Customer c1 = new Customer(22,"Pushkar");
//        Customer_Details cd1 = new Customer_Details(22,"Pushkar","push@gmail.com",98134650L,55000);
//        c1.setCustomerdetails(cd1);
//        em.persist(c1);
//        Customer c2 = new Customer(33,"Jyotiraditya");
//        Customer_Details cd2 = new Customer_Details(33,"Jyotiraditya","jp@gmail.com",98123650L,55000);
//        c2.setCustomerdetails(cd2);
//        em.persist(c2);
//        Customer c3 = new Customer(44,"Subarna");
//        Customer_Details cd3 = new Customer_Details(44,"Subarna","golmukhfootball@gmail.com",9812650L,55000);
//        c3.setCustomerdetails(cd3);
//        em.persist(c3);
//        Customer c4 = new Customer(55,"Shubhangi");
//        Customer_Details cd4 = new Customer_Details(55,"Shubhnagi","subarna's_gf@gmail.com",9234650L,55000);
//        c4.setCustomerdetails(cd4);
//        em.persist(c4);
//        Customer c5 = new Customer(66,"Sumit");
//        Customer_Details cd5 = new Customer_Details(66,"Sumit","cocHugeMassive@gmail.com",98123465L,55000);
//        c5.setCustomerdetails(cd5);
//        em.persist(c5);
//        et.commit();
   	   EntityManager em = emf.createEntityManager();
	       EntityTransaction tx = em.getTransaction();
	       tx.begin();	     
	       //SELECT * FROM Employee
	       Query query = em.createQuery("SELECT e FROM Customer_Details e");
	       List<Customer_Details> list = query.getResultList();
	       for (Customer_Details e : list) {
	       	System.out.println(e);
	       }
//	       Query query2 = em.createQuery("UPDATE Customer_Details e SET e.email='golmukhfootballrugby@gmail.com' WHERE e.name='Subarna'");
//	       query2.executeUpdate();
//	       List<Customer_Details> list2 = query.getResultList();
//	       for (Customer_Details e : list2) {
//		     System.out.println(e);
//		   }
	       Query query1=em.createQuery("DELETE FROM Customer_Details e where e.name='Sumit'");
	       query1.executeUpdate();
	       List<Customer_Details> list1 = query.getResultList();
	       for (Customer_Details e : list1) {
	       	System.out.println(e);
	       }
	       Query query3 = em.createQuery("SELECT e FROM Customer_Details e");
	       List<Customer_Details> list3 = query3.getResultList();
	       for (Customer_Details e : list3) {
	       	System.out.println(e);
	       }
	       tx.commit();	     
	       emf.close();
   }
}
