package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.relationship.EmpDtls;

public class App {
	
	public static void main(String[] args) {
		
		SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
		
		Emp e1 = new Emp();
		e1.setId(101);
		e1.setName("Rohit");
		
		Emp e2 = new Emp();
		e2.setId(102);
		e2.setName("Virat");
		
		Address ad1 = new Address();
		ad1.setId(201);
		ad1.setAddressName("Mumbai");
		
		Address ad2 = new Address();
		ad2.setId(202);
		ad2.setAddressName("Banglore");
		
		List<Address> addList = new ArrayList<Address>();
		addList.add(ad1);
		addList.add(ad2);
		
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(e1);
		empList.add(e2);
		
		e1.setAddress(addList);
		ad1.setEmp(empList);
		
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		/*
		 * session.save(e1); session.save(e2); session.save(ad1); session.save(ad2);
		 * 
		 * System.out.println("Doneeee");
		 */
		
		Emp emp =(Emp) session.get(Emp.class, 101);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAddress().size());
		
		tx.commit();
		session.close();
		
		
		
		
		
		System.out.println(sessionfactory);
		
		sessionfactory.close();
	}

}
