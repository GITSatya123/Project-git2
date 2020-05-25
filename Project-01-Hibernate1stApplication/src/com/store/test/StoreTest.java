package com.store.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.store.entities.Store;

public class StoreTest {
	
	public static void main(String[] args) {
		
		Configuration configuration= new Configuration().configure();
		SessionFactory sf= configuration.buildSessionFactory();
		Session session=sf.openSession();
		Store store=(Store)session.get(Store.class, 101);
		System.out.println(store);
	}

}
