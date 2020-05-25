package com.annotation.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.annotation.entities.Employee;
import com.annotation.entities.SessionFactoryRegistry;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory=null;
		Session session=null;
		Transaction transaction= null;
		Employee emp=null;
		boolean flag=false;
		 try {
			 sessionfactory=SessionFactoryRegistry.getSessionfactory();
			 session=sessionfactory.openSession();
			 transaction=session.beginTransaction();
			 emp= new Employee();
			 emp.setEmpNo(999);
			 emp.setEmpName("satyajit Behera");
			 emp.setGender("male");
			 emp.setAge(25);
			 emp.setSalary(79999);
			 session.save(emp);
			 flag=true;
		 }finally {
			 if(transaction!=null) {
				 if(flag) {
					 transaction.commit();
				 }else {
					 transaction.rollback();
				 }
			 }
		 }
		 SessionFactoryRegistry.closeSessionFactory();
	}

}
