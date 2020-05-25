package com.jpa.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryRegistry {
	
	private static EntityManagerFactory entitymanagerfactory;
	static {
		entitymanagerfactory=Persistence.createEntityManagerFactory("db1");
	}
	
	public static EntityManagerFactory getEntitymanagerfactory() {
		return entitymanagerfactory;
	}
	
	public static void closeEntityManagerFactory() {
		if(entitymanagerfactory!=null) {
			entitymanagerfactory.close();
		}
	}

}
