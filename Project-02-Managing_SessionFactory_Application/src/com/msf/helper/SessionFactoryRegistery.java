package com.msf.helper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//@SuppressWarnings("deprecation")
public class SessionFactoryRegistery {
	

	private static SessionFactory sessionfactory;
	static {
			try {
				Configuration configuration= null; 
			configuration=new Configuration().configure();
			sessionfactory=configuration.buildSessionFactory();
			
			}catch(Exception e) {
				e.printStackTrace();
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionfactory;
		
	}
	public static void  closeSessionFactory() {
		if(sessionfactory!=null) {
			sessionfactory.close();
		}
	}
	
}
	
