
package com.idg.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {

	private static SessionFactory mysqlSessionfactory;
	private static SessionFactory oracleSessionfactory;
	
	static {
		try {
			
			//mysqlSessionfactory=new MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate-mysql.cfg.xml").build()).buildMetadata().buildSessionFactory();
			oracleSessionfactory=new MetadataSources(new StandardServiceRegistryBuilder().configure("oracle_hibernate.cfg.xml").build()).buildMetadata().buildSessionFactory();
		}catch(Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}

	
	 //public static SessionFactory getMysqlSessionfactory() { 
	 //return mysqlSessionfactory; 
	 //}
	

	
	  public static SessionFactory getOracleSessionfactory() {
		  return
	  oracleSessionfactory; 
		  }
	 
	
//	public static void closemysqlSessionfactory() {
//		if(mysqlSessionfactory !=null) {
//			mysqlSessionfactory.close();
//		}
//	}
	
	
	 public static void closemyoracleSessionfactory() { 
		  if(oracleSessionfactory!=null) { 
			  oracleSessionfactory.close();
			  }
		  }
	 
}
