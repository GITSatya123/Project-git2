package com.msf.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.msf.helper.SessionFactoryRegistery;

public class StaffDAO {
	
	public Staff getStaff(int staffno) {
		
		SessionFactory sessionfactory= null;
		Session session= null;
		Staff staff= null;
		sessionfactory=SessionFactoryRegistery.getSessionFactory();
		System.out.println("session--1"+sessionfactory);
		session=sessionfactory.openSession();
		System.out.println("session--2");
		staff=(Staff)session.get(Staff.class, staffno);
		return staff;
		
		
	}

}
