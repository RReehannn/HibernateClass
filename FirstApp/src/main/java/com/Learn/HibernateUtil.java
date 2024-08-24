package com.Learn;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

/*
 * This is hibernate  Configuration With the help of java class
 */

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			Configuration configuration = new Configuration();
			Properties properties= new Properties();
			
			properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/neon");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Rehan786@");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			properties.put(Environment.HBM2DDL_AUTO, "create");
			properties.put(Environment.SHOW_SQL, true);
			
			configuration.setProperties(properties);
			configuration.addAnnotatedClass(Student.class);
			configuration.addAnnotatedClass(Employee.class);
			
			StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			
			sessionFactory =configuration.buildSessionFactory(serviceRegistry);
		}
		
		
		
		return sessionFactory;
	}
	

}
