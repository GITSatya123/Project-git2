package com.gvl.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gvl.entities.User;
import com.gvl.helper.SessionFactoryRegistry;

public class GVLTest {

	public static void main(String[] args) {
		User user=new User();
		Session session=null;
		SessionFactory sessionFactory=null;
		sessionFactory=SessionFactoryRegistry.getSessionfactory();
		System.out.println("session factory object is created");
		session= sessionFactory.openSession();	
		storeUser(session);
		//user=session.get(User.class,125 );
		//user=session.load(User.class,121);
		
		//System.out.println(user.getEmailaddress());
		//System.out.println(user);
	
	}	
	
	public static void storeUser(Session session) {
		Transaction tx=null;
		boolean flag=false;
		try {
			tx=session.beginTransaction();
			User user=new User();
			user.setUserId(101);
			user.setUserName("satya");
			user.setGender("male");
			user.setAge(25);
			user.setMobileno("7328073236");
			user.setEmailaddress("satya@gmail.com");
			session.save(user);
			flag=true;
		}finally {
			if (tx!=null) {
				if(flag) {
					tx.commit();
				}else {
					tx.rollback();
				}
			}
		}
		SessionFactoryRegistry.closeSessionFactory();
		
	}

	/*public static void storePerson(Session session) {
		
		Transaction transaction=null;
		boolean flag=false;
		try {
		transaction=session.beginTransaction();
		User person=new User();
		person.setPid(121);
		person.setPname("satya");
		person.setGender("male");
		person.setAge(25);
		person.setMobileno("3445667");
		person.setEmailaddress("satya,gmail.com");
		session.save(person);
		flag=true;
	}finally{
		if(transaction!=null) {
			if(flag) {
				transaction.commit();
			}else {
				transaction.rollback();
			}
		}
	}*/
}

