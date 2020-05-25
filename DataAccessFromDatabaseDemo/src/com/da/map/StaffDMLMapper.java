package com.da.map;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.da.bean.Staff;
import com.da.bean.Store;

public class StaffDMLMapper {
	
	public static PreparedStatement mapObjectToSavePreparedStatement(Connection con,
																	String sql,Staff staff) {
		PreparedStatement pstmt= null;
		try {
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, staff.getStaffNo());
			pstmt.setString(2, staff.getStaff_First_Name());
			pstmt.setString(3, staff.getStaff_Last_Name());
			pstmt.setString(4, staff.getMobNo());
			pstmt.setString(5, staff.getAge());
			pstmt.setString(6, staff.getGender());
			pstmt.setString(7, staff.getDesignation());
			pstmt.setString(8, staff.getMail_address());
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	public static PreparedStatement mapObjectToUpdatePreparedStatement(Connection con, 
																String sql, Staff staff) {
		PreparedStatement pstmt= null;
		try {
			pstmt= con.prepareStatement(sql);
			
			pstmt.setString(1, staff.getStaff_First_Name());
			pstmt.setString(2, staff.getStaff_Last_Name());
			pstmt.setString(3, staff.getMobNo());
			pstmt.setString(4, staff.getAge());
			pstmt.setString(5, staff.getGender());
			pstmt.setString(6, staff.getDesignation());
			pstmt.setString(7, staff.getMail_address());
			pstmt.setString(8, staff.getStaffNo());
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	public static PreparedStatement mapObjectToDeletePreparedStatement(Connection con,String sql,String pkColumn) {
		
		PreparedStatement pstmt= null;
		try {
			pstmt= con.prepareStatement(sql);
			
			pstmt.setString(1,pkColumn);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
		
	}
	
}
