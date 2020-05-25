package com.tsf.test;

import com.tsf.entities.Customer;
import com.tsf.entities.CustomerDAO;

public class Test {

	public static void main(String[] args) {
		CustomerDAO cdao=null; 
		Customer  customer=null;
		customer= new Customer();
		
		customer.setCustomerno(102);
		customer.setCustomername("satya");
		customer.setAddressline1("bhadrak");
		customer.setCity("odisha");
		customer.setZip(287899);
		customer.setCountry("india");
		
		cdao= new CustomerDAO();
		cdao.saveCoustomer(customer);
	}

}
