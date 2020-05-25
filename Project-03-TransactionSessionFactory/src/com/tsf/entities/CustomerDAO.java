package com.tsf.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsf.helper.SessionFactoryRegistey;

public class CustomerDAO {
	
	public void saveCoustomer(Customer customer) {
		SessionFactory  sessionfactory=null;
		Session session= null;
		Transaction tx= null;
		boolean flag=false;
		try{
		sessionfactory=SessionFactoryRegistey.getSessionFactroy();
		session=sessionfactory.openSession();
		tx=session.beginTransaction();
		session.save(customer);
		flag=true;
	}catch(Exception e) {
		e.printStackTrace();
	}
		finally {
			if(tx!=null) {
				if(flag!=false) {
				tx.commit();
			}
			else {
				tx.rollback();
				}
			}
		}
		
	}
}
