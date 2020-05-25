package com.annotation.entities;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {

	private static SessionFactory sessionfactory;
	
	static {
		try {
			Map<String, String> settings=new HashMap<>();
			settings.put("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
			settings.put("hibernate.connection.url","jdbc:mysql://localhost:3306/location");
			settings.put("hibernate.connection.user","root");
			settings.put("hibernate.connection.password","root");
			settings.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
			settings.put("hibernate.show_sql","true");
			settings.put("hibernate.hbm2ddl.auto","update");
			
			MetadataSources msources=new MetadataSources(new StandardServiceRegistryBuilder().applySettings(settings).build());
			msources.addAnnotatedClass(Employee.class);
			
			sessionfactory=msources.buildMetadata().buildSessionFactory();
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
