package com.gvl.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gvl.entities.Person;
import com.gvl.helper.SessionFactoryRegistry;

public class GVLTest {

	public static void main(String[] args) {
		Person person=new Person();
		Session session=null;
		SessionFactory sessionFactory=null;
		sessionFactory=SessionFactoryRegistry.getSessionfactory();
		System.out.println("session factory object is created");
		session= sessionFactory.openSession();	
		storePerson(session);
		//person=session.get(Person.class,125 );
		person=session.load(Person.class,121);
		
		System.out.println(person.getEmailaddress());
		System.out.println(person);
	
	}	
	
	public static void storePerson(Session session) {
		
		Transaction transaction=null;
		boolean flag=false;
		try {
		transaction=session.beginTransaction();
		Person person=new Person();
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
	}
}
}
