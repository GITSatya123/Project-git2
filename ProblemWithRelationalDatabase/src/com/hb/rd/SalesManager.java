package com.hb.rd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesManager {
	
	 double grossSale(Date date , int quantity) {
		 double grossAmount=0;
		 return grossAmount;
		 
		 int count=0;
		 Connection con=null;
		 PreparedStatement pd= null;
		 ResultSet rs= null;
	 
		
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			
			pd=con.prepareStatement("select * from sales where sale_date=? and quantity <= ?");
			grossAmount =grossAmount+rs.getDouble("paidAmount");
			count ++;
			double AvegareSaleAmount=grossAmount/count;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}
