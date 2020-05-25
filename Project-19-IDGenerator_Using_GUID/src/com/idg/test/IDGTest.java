package com.idg.test;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.idg.entities.UserFeedback;
import com.idg.helper.SessionFactoryRegistry;

public class IDGTest {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory=null;
		Session session=null;
		Transaction transaction= null;
		Boolean flag=false;
		UserFeedback feedback=null;
		
		try {
			//sessionfactory=new SessionFactoryRegistry().getmysqlSessionfactory();
			sessionfactory=new SessionFactoryRegistry().getoracleSessionfactory();
			session=sessionfactory.openSession();
			transaction=session.beginTransaction();
			
			feedback= new UserFeedback();

			feedback.setDescription("nice product");
			feedback.setFeedbackDate(new Date());
			feedback.setUserName("satya");
			
			Object id=session.save(feedback);
			System.out.println("FedbackNo1:"+id);   
			flag=true;
			//session.close();
		
//			session=sessionfactory.openSession();
//			transaction=session.beginTransaction();
//			sessionfactory=new SessionFactoryRegistry().getOracleSessionfactory();
//			
//			UserFeedback userfeedback2= new UserFeedback();
//			userfeedback2= new UserFeedback();
//			userfeedback2.setDescription("good product");
//			userfeedback2.setFeedbackDate(new Date());
//			userfeedback2.setUserName("tanmay");
//			Object id1=session.save(userfeedback2);
//			System.out.println("FedbackNo2:"+id1);
//			flag=true;
				
		}finally{
			if(transaction!=null) {
				if(flag) {
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
		}
		//SessionFactoryRegistry.closemysqlSessionfactory();
		SessionFactoryRegistry.closeoracleSessionfactory();
		
	}

}
