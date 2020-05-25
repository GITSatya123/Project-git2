package com.tph.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tph.entities.ChequePayment;
import com.tph.entities.DigitalPayment;
import com.tph.entities.Payment;
import com.tph.helper.SessionFactoryRegistry;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory= null;
		Session session= null;
		Transaction transaction=null;
		boolean flag=true;
		Payment payment=null;
		ChequePayment cpayment=null;
		DigitalPayment dpayment= null;
		try {
			
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session= sessionFactory.openSession();
			transaction=session.beginTransaction();
			//store superclass attirbutes leaving subclass columns
//			payment= new Payment();
//			payment.setPaymentDate(new Date());
//			payment.setDescription("good product");
//			payment.setAmount(5000);
//			session.save(payment);
			
			//storing subclass objects ,it stores subclass attribute with superclass correspending 
			//discrimnator values
			
//			cpayment= new ChequePayment();
//			cpayment.setPaymentDate(new Date());
//			cpayment.setDescription("nice product");
//			cpayment.setAmount(3000);
//			cpayment.setChequeNo("ch23333");
//			cpayment.setBankName("SBI");
//			cpayment.setBranchName("Bhadrak");
//			cpayment.setIfscCode("sbin000036");
//			session.save(cpayment);
				
//			dpayment= new DigitalPayment();
//			dpayment.setPaymentDate(new Date());
//			dpayment.setDescription("super product");
//			dpayment.setAmount(6000);
//			dpayment.setPartnerName("satyajit");
//			dpayment.setTxNo("s2333d");
//			dpayment.setCredidateDate(new Date());
//			dpayment.setRemarks("Thank you for providin service");
//			session.save(dpayment);
//			flag=true;
			
			Object id= session.get(Payment.class, 3);
			System.out.println("id is:"+id);
			
//			Object id= session.get(ChequePayment.class, 3);
//			System.out.println("id is:"+id);
		}finally {
			if(transaction!=null) {
					if(flag) {
					transaction.commit();
				}
					else {
						transaction.rollback();
						}
					}
		}
		SessionFactoryRegistry.closeSessionFactory();
	}

}
