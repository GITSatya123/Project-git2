package com.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Transaction;

import com.jpa.entities.Employee;
import com.jpa.helper.EntityManagerFactoryRegistry;

public class JPATest {

	public static void main(String[] args) {
		
		EntityManagerFactory entitymanagerfactory=null;
		EntityManager entitymanager=null;
		Transaction transaction=null;
		boolean flag=false;
		
		try {
			
			entitymanagerfactory=EntityManagerFactoryRegistry.getEntitymanagerfactory();
			entitymanager=entitymanagerfactory.createEntityManager();
			transaction=(Transaction) entitymanager.getTransaction();
			transaction.begin();
			Employee emp= new Employee();
			emp.setEmpno(344);
			emp.setEmpName("satya");
			emp.setGender("male");
			emp.setAge(33);
			entitymanager.persist(emp);
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
		EntityManagerFactoryRegistry.closeEntityManagerFactory();
	}

}
