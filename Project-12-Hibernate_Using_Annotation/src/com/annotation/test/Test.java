package com.annotation.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.annotation.entities.Vehicle;
import com.annotation.helper.SessionFactoryRegistry;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory=null;
		Session session=null;
		Vehicle vehicle=null;
		Transaction transaction=null;
		boolean flag=false;
		try {


		sessionfactory=SessionFactoryRegistry.getSessionfactory();
		System.out.println("session factory object created");
		session=sessionfactory.openSession();
		transaction=session.beginTransaction();
		vehicle= new Vehicle();
		vehicle.setVehicleNo("OD24662");
		vehicle.setVehicleType("Car");
		vehicle.setRegistrationNo("SD4572677");
		vehicle.setManufacture("BMW");
		vehicle.setPrice("267828");
		session.save(vehicle);
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