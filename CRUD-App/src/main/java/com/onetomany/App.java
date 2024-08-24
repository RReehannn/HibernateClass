package com.onetomany;

import org.hibernate.SessionFactory;

public class App {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		factory.close();

	}
}
