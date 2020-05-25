package com.bsf.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;


import com.bs5.entities.Address;

public class H5Test {

	public static void main(String[] args) {
		
		StandardServiceRegistryBuilder ssrb= new StandardServiceRegistryBuilder().configure();
		//ssrb.build();
		//create object of standardserviceregistry
		StandardServiceRegistry ssr= ssrb.build();
		
		//create metadatasources
		MetadataSources sources= new MetadataSources(ssr);
		//create metadata
		Metadata metadata= sources.buildMetadata();
		//create sessionfactory
		SessionFactory sessionfactory=metadata.buildSessionFactory();
		Session session= sessionfactory.openSession();
		
		Address address= (Address) session.get(Address.class,1);
		System.out.println(address);
		
	}

}
