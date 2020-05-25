package com.idg.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.idg.entities.Feedback;
import com.idg.helper.SessionFactoryRegistry;

public class FeedbackDAO {

	SessionFactory sessionfactory=null;
	Session session=null;
	Transaction transaction=null;
	boolean flag=false;
	
	public void saveFeedback(List<Feedback> feedbacks) {
		try {
			sessionfactory= SessionFactoryRegistry.getmysqlSessionfactory();
			session= sessionfactory.openSession();
			transaction= session.beginTransaction();
			
			for(Feedback feedback:feedbacks) {
				Object id= session.save(feedback);
			}
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
	}
}
