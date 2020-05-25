package com.msf.test;

import com.msf.entities.Staff;
import com.msf.entities.StaffDAO;

public class MSFTest {

	public static void main(String[] args) {
		
		StaffDAO sdao= new StaffDAO();
		
		Staff staff=sdao.getStaff(202);
		System.out.println(staff);
		
	}	

}
