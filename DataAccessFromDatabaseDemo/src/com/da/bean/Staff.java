package com.da.bean;

public class Staff {
	
	private String staffNo;
	private String staff_First_Name;
	private String staff_Last_Name;
	private String mobNo;
	private String age;
	private String gender;
	private String designation;
	private String mail_address;
	
	public String getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}
	public String getStaff_First_Name() {
		return staff_First_Name;
	}
	public void setStaff_First_Name(String staff_First_Name) {
		this.staff_First_Name = staff_First_Name;
	}
	public String getStaff_Last_Name() {
		return staff_Last_Name;
	}
	public void setStaff_Last_Name(String staff_Last_Name) {
		this.staff_Last_Name = staff_Last_Name;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getMail_address() {
		return mail_address;
	}
	public void setMail_address(String mail_address) {
		this.mail_address = mail_address;
	}
	@Override
	public String toString() {
		return "Staff [staffNo=" + staffNo + ", staff_First_Name=" + staff_First_Name + ", staff_Last_Name="
				+ staff_Last_Name + ", mobNo=" + mobNo + ", age=" + age + ", gender=" + gender + ", designation="
				+ designation + ", mail_address=" + mail_address + "]";
	}
	
	
	
}
