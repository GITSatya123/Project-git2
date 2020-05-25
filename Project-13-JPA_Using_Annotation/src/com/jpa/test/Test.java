package com.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.jpa.entities.Person;
import com.jpa.helper.EntityManagerFactoryRegistry;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory entitymanagerfactory=null;
		EntityManager entitymanager= null;
		
		entitymanagerfactory=EntityManagerFactoryRegistry.getEntitymanagerfactory();
		entitymanager=entitymanagerfactory.createEntityManager();
		
		Person emp= entitymanager.find(Person.class, 121);
		System.out.println(emp);

	}

}
