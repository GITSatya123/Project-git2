package com.gvl.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class SessionFactoryRegistry {
	
	private static SessionFactory sessionfactory;
	
	static {
		try {
			sessionfactory=new MetadataSources().buildMetadata(new StandardServiceRegistryBuilder().configure().build()).buildSessionFactory();
			 // sessionfactory=(SessionFactory) new MetadataSources().buildMetadata(new StandardServiceRegistryBuilder().configure().build());
				
		}catch(Exception e) {
			throw e;
		}
	}
		
	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public static void closeSessionFactory() {
		if(sessionfactory!=null) {
			sessionfactory.close();
			sessionfactory=null;
		}
	}

}
