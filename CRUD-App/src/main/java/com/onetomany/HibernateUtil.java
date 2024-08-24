package com.onetomany;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			Configuration configuration = new Configuration();
			Properties properties = new Properties();
			
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/newHB");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Rehan786@");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			properties.put(Environment.HBM2DDL_AUTO, "update");
			properties.put(Environment.SHOW_SQL, true);
			
			
			configuration.setProperties(properties);
			configuration.addAnnotatedClass(EEmpDtls.class);
			configuration.addAnnotatedClass(AAddress.class);

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			
		}
		
		
		
		return sessionFactory;
		
	}

}
