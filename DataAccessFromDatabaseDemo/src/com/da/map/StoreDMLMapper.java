package com.da.map;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.da.bean.Store;

public class StoreDMLMapper {
	
	public static PreparedStatement mapObjectToSavePreparedStatement(Connection con,String sql,
																					Store store) {
		PreparedStatement pstmt= null;
		try {
			pstmt= con.prepareStatement(sql);
			 pstmt.setString(1, store.getStoreNo());
			 pstmt.setString(2, store.getStoreName());
			 pstmt.setString(3, store.getContactNo());
			 pstmt.setString(4, store.getAddressLine1());
			 pstmt.setString(5, store.getAddressLine2());
			 pstmt.setString(6, store.getCity());
			 pstmt.setString(7, store.getState());
			 pstmt.setString(8, store.getZip());
			 pstmt.setString(9, store.getCountry());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	public static PreparedStatement mapObjectToUpdatePreparedStatement(Connection con,String sql,Store store) {
		PreparedStatement pstmt= null;
		try {
			pstmt=con.prepareStatement(sql);
			
			
			 pstmt.setString(1, store.getStoreName());
			 pstmt.setString(2, store.getContactNo());
			 pstmt.setString(3, store.getAddressLine1());
			 pstmt.setString(4, store.getAddressLine2());
			 pstmt.setString(5, store.getCity());
			 pstmt.setString(6, store.getState());
			 pstmt.setString(7, store.getZip());
			 pstmt.setString(8, store.getCountry());
			 pstmt.setString(9, store.getStoreNo());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	public static PreparedStatement mapObjectToDeletePreparedSatatement(Connection con,String sql,String PkColumn) {
		PreparedStatement pstmt= null;
		
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, PkColumn);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
}
