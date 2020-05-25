package com.da.test;

import java.util.Iterator;
import java.util.List;

import com.da.bean.Staff;
import com.da.bean.Store;
import com.da.dao.StaffAccessor;
import com.da.dao.StoreAccesor;

public class Test {

	public static void main(String[] args) {
		
		StoreAccesor store= new StoreAccesor();
		List<Store>lstore=store.getStores();
		
		Iterator<Store> itr=lstore.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		StaffAccessor staff = new StaffAccessor();
		List listStaff = staff.getStaff();

		Iterator<Staff> itr1 = listStaff.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}
}


