package com.dml.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.dml.entities.Book;
import com.dml.helper.SessionFactoryRegistry;

public class Save_Persist_Test {

	public static void main(String[] args) {

		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Book book = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			book = new Book();
//			book.setAuthorName("tommy");
//			book.setPublisher("penguine book");
//			book.setPublishedDate(new Date());
//			book.setPrice(400);
			
			//session.saveOrUpdate(book);
			
			System.out.println("id is:"+book.getBookNo());
			Object id=session.save(book);
			session.persist(book);
			//Object id= book.getBookNo();
			
			System.out.println("save method");
			System.out.println("persists method");
			System.out.println(book);
			System.out.println("id is:" + book.getBookNo());
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
		}
		SessionFactoryRegistry.closeSessionFactory();
	}

}
