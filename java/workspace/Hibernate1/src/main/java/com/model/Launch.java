package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch 
{
	public static void main(String[] args) 
	{
		//Creating an object(cfg) of 
		//Configuration class
		Configuration cfg=new Configuration();
		cfg.configure();//The configuration class has a configure method 
		                //which contains the hibernate.cfg.xml file
		
		cfg.addAnnotatedClass(Employee.class);//This method specifies which class to work on
		                                      //In this case it is Employee.class(In cases where there are multiple
		                                      //POJO classes)
		
		SessionFactory sf=cfg.buildSessionFactory();//We cannot store data directly into the database
		                                            //so we have to create session and store in them
		Session s=sf.openSession();//Opening the session

		//Inserting
       	//Employee e=new Employee(1, "Sunil G", "sunnyG@gmail.com", "1983");
            // s.persist(e); //Saving it in the session
		
		//Retrieving 
		//Employee e=new Employee();
        //e=s.get(Employee.class, 1);
        //System.out.println(e);
       
		//Updating the entries
             Employee dum=s.find(Employee.class, 1);
             dum.setName("Sunil Gavaskar");
        //removing 
//        s.remove(e);
        //Saving from the session to the database
        Transaction t=s.beginTransaction();
        t.commit();
       
	}

}
