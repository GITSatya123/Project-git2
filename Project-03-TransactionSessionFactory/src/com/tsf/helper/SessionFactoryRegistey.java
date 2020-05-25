package com.tsf.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistey {

	private static SessionFactory  sessionfactory;
	
	static {
		try {
			Configuration configuration=new Configuration().configure();
			sessionfactory= configuration.buildSessionFactory();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		public static SessionFactory getSessionFactroy() {
			return sessionfactory;
		}
		
		public static void closeSessionFactroy() {
			if(sessionfactory!=null) {
				sessionfactory.close();
			}
	}
}
