package com.dml.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.dml.entities.Book;
import com.dml.helper.SessionFactoryRegistry;

public class Mearge_Update_Test {

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
			book.setBookNo(1);
			book.setPrice(900);
			book.setPublisher("omm");
			
			Book book1= session.get(Book.class, book.getBookNo());
			book.setAuthorName(book1.getAuthorName());
			book.setPublishedDate(book1.getPublishedDate());
			
			session.merge(book);
			flag=true;
			
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
