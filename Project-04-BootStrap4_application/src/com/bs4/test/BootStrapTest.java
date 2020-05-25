package com.bs4.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.BootstrapServiceRegistry;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.bs4.entities.Address;

public class BootStrapTest {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Configuration configuration= new Configuration().configure();
		//BootstrapServiceRegistryBuilder bsrb=new BootstrapServiceRegistryBuilder();
		// BootstrapServiceRegistry bsr= bsrb.with(this.getClass().)
		//BootstrapServiceRegistry bssr=bsrb.build();
		
		StandardServiceRegistryBuilder ssrb= new StandardServiceRegistryBuilder();
		ssrb.applySettings(configuration.getProperties());
		StandardServiceRegistry ssr=ssrb.build();
		
		
		SessionFactory sessionfactory=configuration.buildSessionFactory(ssr);
		Session session= sessionfactory.openSession();
		Address address= (Address) session.get(Address.class, 1);
		System.out.println(address);
	}

}
