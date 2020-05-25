package com.idg.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
	private static SessionFactory mysqlSessionfactory;
	private static SessionFactory oracleSessionfactory;
	
	

	
	 //public static SessionFactory getOracleSessionfactory() {
	//	return oracleSessionfactory;
	//}



	public static synchronized SessionFactory getmysqlSessionfactory() { 
		try {
			if (mysqlSessionfactory==null) {
				Configuration configuration= new Configuration().configure("hibernate.cfg.xml");
				StandardServiceRegistryBuilder ssrb=new StandardServiceRegistryBuilder();
				ssrb.applySettings(configuration.getProperties());
				StandardServiceRegistry ssRegistry=ssrb.build();
				mysqlSessionfactory=configuration.buildSessionFactory(ssRegistry);
			}
		}catch(Throwable t) {
			t.printStackTrace();
			throw t;
		}
	 return mysqlSessionfactory; 
	 }
	

	
	/*
	 * public static SessionFactory getOracleSessionfactory() { return
	 * oracleSessionfactory; }
	 */
	 
	
	public static void closemysqlSessionfactory() {
		if(mysqlSessionfactory !=null) {
			mysqlSessionfactory.close();
		}
	}
	
	
	/*
	 * public static void closeoracleSessionfactory() {
	 * if(oracleSessionfactory!=null) { oracleSessionfactory.close(); } }
	 */
}
