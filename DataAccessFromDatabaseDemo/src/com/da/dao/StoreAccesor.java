package com.da.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.da.bean.Store;
import com.da.common.ConnectionFactory;
import com.da.common.DBConstant;
import com.da.map.EntityMetaData;
import com.da.map.EntityMetaDataReader;
import com.da.map.GenericMapper;
import com.da.util.PropertiesReadFile;

//to store the object in the form of object 
public class StoreAccesor {
	
	public List<Store> getStores() {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs= null;
		List<Store> lstore=null;
		Store store=null;
		
		try {
			
			con=ConnectionFactory.newConnection();
			
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from stores");
			lstore= new ArrayList<Store>();
			
			PropertiesReadFile.readProperties("com/da/util/store.propreties");
			
						
			/*props.put("staffno", "staffNo");
			props.put("staff_First_Name", "staffFirstName");
			props.put("staff_Last_Name", "staffLastName");
			props.put("mobno", "mobNo");
			props.put("designation", "designation");
			props.put("mail_id", "mail_id");
			props.put("address_line1", "addressLine1");
			props.put("address_line2", "addressLine2");
			props.put("city", "city");
			props.put("state", "state");
			props.put("zip","zip");
			props.put("country", "country");*/
			
			EntityMetaData emd= EntityMetaDataReader.metadataReader("com/da/util/store.propreties");
			
			while(rs.next()) {
				store= new Store();
				//store=(Store) GenericMapper.mapRowToObject(rs, "com.da.map.StoreAccess", props);
			    //store=(Store) GenericMapper.mapRowToObject(rs, "com.da.map.StoreAccess", DBConstant.storeproperties);
				store= (Store) GenericMapper.mapRowToObject(rs, "com.da.bean.Store", emd.getColsToAttributesProps());
				lstore.add(store);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lstore;
		
	}
	public void updateStore(Store store) throws IOException {
		Connection con= null;
		PreparedStatement pstmt= null;
		
		try {
			con=ConnectionFactory.newConnection(); 
			pstmt=con.prepareStatement("update store set(StoreName=?,contactNo=?,addressline1=?,addressline2=?,city=?,state=?,zip=?,country=? where storeno=?)");
			pstmt.setString(1, store.getStoreName());
			pstmt.setString(2, store.getContactNo());
			pstmt.setString(3, store.getAddressLine1());
			pstmt.setString(4, store.getAddressLine2());
			pstmt.setString(5, store.getCity());
			pstmt.setString(6, store.getState());
			pstmt.setString(7, store.getZip());
			pstmt.setString(8, store.getCountry());
			pstmt.setString(9, store.getStoreNo());
			
			pstmt.executeUpdate();
			
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStore (Store store) throws IOException {
		Connection con= null;
		PreparedStatement pstmt= null;
		
		try {
			con= ConnectionFactory.newConnection();
			pstmt= con.prepareStatement("delete from store where storeno=? ");
			pstmt.setString(1, store.getStoreNo());
			pstmt.executeUpdate();
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
		
		
