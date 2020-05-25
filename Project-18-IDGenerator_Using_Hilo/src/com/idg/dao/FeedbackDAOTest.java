package com.idg.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.idg.entities.Feedback;
import com.idg.helper.SessionFactoryRegistry;

public class FeedbackDAOTest {
	public static void main(String[] args) {
		FeedbackDAO feedbackdao=null;
		List<Feedback> feedbacks=null;
		Feedback feedback= null;
		
		try {
			feedbackdao= new FeedbackDAO();
			feedbacks= new ArrayList<Feedback>();
			
			for(int i=0;i<=10;i++) {
				feedback= new Feedback();
				feedback.setDescription("nice product");
				feedback.setFeedbackDate(new Date());
				feedback.setUserName("raj");
				feedback.setRating(6);
				feedback.setProductName("laptop");
				feedbacks.add(feedback);
			}
			feedbackdao.saveFeedback(feedbacks);
		}finally {
			SessionFactoryRegistry.closemysqlSessionfactory();
		}
	}
	
	
	
	

}
