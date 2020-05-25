package com.cpk.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cpk.entities.Patient;
import com.cpk.entities.PatientCompositePK;
import com.cpk.helper.SessionFactoryRegistry;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory= null;
		Session session=null;
		Transaction transaction= null;
		boolean flag= false;
		Patient patient= null;
		
		try {
			
			sessionFactory= SessionFactoryRegistry.getSessionFactory();
			session= sessionFactory.openSession();
			transaction= session.beginTransaction();
			patient= new Patient();
//			patient.setUniqueIdentificationNo("UAN12345");
//			patient.setMobileNo("4848829");
//			patient.setPatientName("virat");
//			patient.setAge(25);
//			patient.setGender("male");
//			patient.setEmailAddress("virat@gmail");
//			session.save(patient); 
			
			PatientCompositePK pk1= new PatientCompositePK();
			pk1.setUniqueIdentificationNo("UAN12345");
			pk1.setMobileNo("4848829");
			patient= session.get(Patient.class, pk1);
			System.out.println("patient is:"+patient);
			
			flag=true;
		}finally {
			if(transaction!=null) {
				if(flag) {
					transaction.commit();
				}else
					transaction.rollback();
			}
		}
	}

}
