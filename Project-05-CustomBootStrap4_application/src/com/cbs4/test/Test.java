package com.cbs4.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.cbs4.entities.Address;
import com.cbs4.impl.JdbcDriverManagerConectionProviderImpl;

public class Test {

	public static void main(String[] args) {
		
		Configuration configuration= new Configuration().configure();
		StandardServiceRegistryBuilder ssrb= new StandardServiceRegistryBuilder();
		ssrb.addService(JdbcDriverManagerConectionProviderImpl.class, new JdbcDriverManagerConectionProviderImpl());
		ssrb.applySettings(configuration.getProperties());
		StandardServiceRegistry ssr= ssrb.build();
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session= sessionFactory.openSession();
		
		Address address= (Address) session.get(Address.class, 1);
		System.out.println(address);
		
		session.close();
		sessionFactory.close();
	}

}
