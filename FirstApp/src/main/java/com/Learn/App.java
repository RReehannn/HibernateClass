package com.Learn;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ){
    	
    	System.out.println( "Hello World!" );
    	
    	/*
    	Configuration cfg= new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	System.out.println(factory);
    	
    	*/
    	
    	
    	/*
    	  In one Line
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	System.out.println(factory);
    	
    	 
    	 */
    	
    	
    	//Configuration With the help of java class
    	SessionFactory factory= HibernateUtil.getSessionFactory();
    	System.out.println(factory);
    	
//    	Student st = new Student();
//    	st.setId(1);
//    	st.setName("Imran");
//    	st.setEmail("Im1123@gmail.com");
//    	st.setAddress("India");
//    	
//    	
//    	Session session = factory.openSession();
//    	Transaction tx = session.beginTransaction();
//    	
//    	session.save(st);
//    	
//    	tx.commit();
//    	session.close();
    	
    	Employee emp = new Employee();
    	emp.setEmpName("Virat");
    	emp.setEmail("Virat@Gmail.com");
    	emp.setSalary(10000.00);
    	emp.setJoiningDate(new Date());
    	emp.setStatus(true);
    	emp.setToken("123fl");
    	
    	
    	
    	Session session = factory.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(emp);
    	
    	tx.commit();
    	session.close();
    	
    	
    	
    	}

}
