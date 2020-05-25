package com.annotation.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {
	private static SessionFactory sessionfactory;
	
	static {
		try {
		sessionfactory=new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).buildMetadata().buildSessionFactory();
		}catch(Throwable t) {
		t.printStackTrace();
		throw t;
	}
		
}
	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	public static void closeSessionFactory() {
		if(sessionfactory!=null) {
			sessionfactory.close();
		}
	}
}