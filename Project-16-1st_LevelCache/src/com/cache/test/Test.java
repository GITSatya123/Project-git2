package com.cache.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cache.entities.Merchant;
import com.cache.helper.SessionFactoryRegistry;

public class Test {

	public static void main(String[] args) {

		SessionFactory sessionfactory= null;
		Session session= null;
		Transaction transaction= null;
		boolean flag =false;
		Merchant merchant= null;
		
		try {
			sessionfactory=SessionFactoryRegistry.getSessionfactory();
			session=sessionfactory.openSession();
			transaction=session.beginTransaction();
			
//			merchant= new Merchant();
//			merchant.setMerchantNo("10");
//			merchant.setMerchantName("Satya");
//			merchant.setBussinessType("Furniture");
//			merchant.setCity("Bhadrak");
			merchant=session.get(Merchant.class, "10");
			System.out.println(merchant);
			session.evict(merchant);
			
			Merchant merchant1= session.get(Merchant.class, "10");
			System.out.println(merchant==merchant1);
			session.save(merchant);
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