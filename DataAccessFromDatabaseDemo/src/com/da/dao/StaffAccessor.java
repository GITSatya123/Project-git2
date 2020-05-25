package com.da.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.da.bean.Staff;
import com.da.common.ConnectionFactory;
import com.da.common.DBConstant;
import com.da.map.EntityMetaData;
import com.da.map.EntityMetaDataReader;
import com.da.map.GenericMapper;
import com.da.util.PropertiesReadFile;

public class StaffAccessor {
	
	public List<Staff> getStaff() {
		
		Connection con= null;
		Statement stmt= null;
		ResultSet rs=  null;
		Staff staff= null;
		List <Staff> lstaff=null;
		
		try {
			
			con=ConnectionFactory.newConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from staff");
			
			lstaff=new ArrayList<Staff>();
			
			PropertiesReadFile.readProperties("com/da/util/staff.properties");
			
			/*Properties props= null;
			props= new Properties();
			props.load(this.getClass().getClassLoader().getResourceAsStream("staff.properties"));*/
			
			EntityMetaData emd= EntityMetaDataReader.metadataReader("com/da/util/staff.properties");
			
			/*props.put("staffno", "staffNo");
			props.put("staff_First_Name", "staffFirstName");
			props.put("staff_Last_Name", "staffLastName");
			props.put("mobno", "mobNo");
			props.put("gender", "gender");
			props.put("designation", "designation");
			props.put("mail_id", "mail_id");*/
						
			while(rs.next()) {
				//staff=GenericMapper.mapRowToObject(rs, "com.da.StaffAccessor",props);
				//staff=(Staff) GenericMapper.mapRowToObject(rs, "com.da.StaffAccessor",DBConstant.staffproperties);
				staff= (Staff) GenericMapper.mapRowToObject(rs, "com.da.bean.Staff", emd.getColsToAttributesProps());
				
				/*staff= new Staff();
				staff.setStaffNo(rs.getInt("staffNo"));
				staff.setStaff_First_Name(rs.getString("staff_First_Name"));
				staff.setStaff_Last_Name(rs.getString("staff_Lat_Name"));
				staff.setMobNo(rs.getLong("mobNo"));
				staff.setDesignation(rs.getString("designation"));
				staff.setMail_id(rs.getString("mail_id"));
				staff.setAddressLine1(rs.getString("addrssLine1"));
				staff.setAddressLine1(rs.getString("addressLine2"));
				staff.setCity(rs.getString("city"));
				staff.setState(rs.getString("state"));
				staff.setZip(rs.getInt("zip"));
				staff.setCountry(rs.getString("country"));*/
				
				lstaff.add(staff);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lstaff;
	}
	
	public void saveStaff (Staff staff) {
		
		Connection con= null;
		PreparedStatement pstmt= null;
		
		try {
			con= ConnectionFactory.newConnection();
			pstmt=con.prepareStatement("insert into staff (staff_no,staff_first_name,staff_last_name,mobno,age,gender,designation,mail_address) values(?,?,?,?,?,?,?,?)");
	
			pstmt.setString(1, staff.getStaffNo());
			pstmt.setString(2, staff.getStaff_First_Name());
			pstmt.setString(3, staff.getStaff_Last_Name());
			pstmt.setString(4, staff.getMobNo());
			pstmt.setString(5, staff.getAge());
			pstmt.setString(6, staff.getGender());
			pstmt.setString(7, staff.getDesignation());
			pstmt.setString(8, staff.getMail_address());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateStaff(Staff staff) {
		Connection con= null;
		PreparedStatement pstmt= null;
		
		try {
			con= ConnectionFactory.newConnection();
			pstmt=con.prepareStatement("update staff set(staff_no=?,staff_first_name=?,staff_last_name=?,mobno=?,ag?,gender=?,designation=?,mail_address=?)"); 
	}catch(Exception e) {
		e.printStackTrace();
	}

}
	public void deleteStaff(Staff staff) {
		Connection con= null;
		PreparedStatement pstmt= null;
		
		try {
			con= ConnectionFactory.newConnection();
			pstmt=con.prepareStatement("delete from staff where staff_no=?");
			
			pstmt.setString(1, staff.getStaffNo());
			
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}	
}
