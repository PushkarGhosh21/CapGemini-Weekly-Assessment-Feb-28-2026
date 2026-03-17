package com.capgemini.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean-config.xml");
        Student beanS=(Student)ac.getBean("student");
        System.out.println(beanS);
        Employee beanE=(Employee)ac.getBean("employee");
        System.out.println(beanE);
        Employee beanE1=(Employee)ac.getBean("employee1");
        System.out.println(beanE1);
    }
}