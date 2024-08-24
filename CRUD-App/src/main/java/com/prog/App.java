package com.prog;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		// Student Save
		/*
		 * Student st = new Student(); st.setName("Rehann"); st.setAddress("Samstipur");
		 * st.setEmail("Rehan@Gmail.com"); st.setCollagename("DCE college");
		 * 
		 * Student st1 = new Student(); st1.setName("RRehan");
		 * st1.setAddress("SSamstipur"); st1.setEmail("RRehan@Gmail.com");
		 * st1.setCollagename("DDCE college");
		 * 
		 * // Session session = factory.openSession(); Transaction tx =
		 * session.beginTransaction();
		 * 
		 * session.save(st); session.save(st1);
		 * 
		 * tx.commit();
		 * 
		 * System.out.println("Student added succeffuly");
		 */

		/*
		 * //Read data List<Student> list = session.createQuery("from Student",
		 * Student.class).list();
		 * 
		 * list.forEach(e-> System.out.println(e));
		 */

		/*
		 * //Get by Id
		 * 
		 * Student st = session.get(Student.class, 1); System.out.println(st);
		 */

		/*
		 * //Update Data
		 * 
		 * Student st = session.get(Student.class, 1); st.setName("Rehan Update");
		 * st.setAddress("Update"); st.setEmail("up@gmail.com");
		 * st.setCollagename("UPdatecl");
		 * 
		 * Transaction tx = session.beginTransaction(); session.saveOrUpdate(st);
		 * tx.commit();
		 * 
		 * System.out.println("Data Update sucesuffully");
		 */

		
		/*
		 * // delete Data
		 * 
		 * Student st = session.get(Student.class, 1); Transaction tx =
		 * session.beginTransaction(); session.delete(st);
		 * 
		 * tx.commit();
		 * 
		 * System.out.println("Deleted sucesuffully");
		 */

		session.close();
		factory.close();

	}
}
