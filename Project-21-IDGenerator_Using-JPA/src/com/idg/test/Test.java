package com.idg.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.idg.entity.Bill;
import com.idg.helper.EntityManagerFactoryRegistry;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction= null;
		boolean flag=false;
		Bill bill= null;
		
		try {
			//entityManagerFactory=EntityManagerFactoryRegistry.getMysqlEntityManagerFactory();
			entityManagerFactory=EntityManagerFactoryRegistry.getOracleEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			bill= new Bill();
			bill.setBillIssuedDate(new Date());
			bill.setIsuuedName("satyajit");
			bill.setCustomerName("tanmay");
			bill.setBillAmt(3000);
			entityManager.persist(bill);
			Object id= bill.getBillNo();
			System.out.println("ID no is:"+id);
			flag=true;
			
		}finally {
			
			if(entityTransaction!=null) {
				if(flag) {
					entityTransaction.commit();
				}else {
					entityTransaction.rollback();
				}
			}
		}
		
		//EntityManagerFactoryRegistry.EntityManagerFactories();
	}

}
