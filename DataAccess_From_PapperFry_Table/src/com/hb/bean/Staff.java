package com.hb.bean;

public class Staff {

	private String staff_no;
	private String staff_first_nm;
	private String staff_last_nm;
	private String designation;
	private String mobile_no;
	private String email_address;
	private String age;
	private String gender;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	public String getStaff_no() {
		return staff_no;
	}
	public void setStaff_no(String staff_no) {
		this.staff_no = staff_no;
	}
	public String getStaff_first_nm() {
		return staff_first_nm;
	}
	public void setStaff_first_nm(String staff_first_nm) {
		this.staff_first_nm = staff_first_nm;
	}
	public String getStaff_last_nm() {
		return staff_last_nm;
	}
	public void setStaff_last_nm(String staff_last_nm) {
		this.staff_last_nm = staff_last_nm;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
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
	public String getAddress_line1() {
		return address_line1;
	}
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}
	public String getAddress_line2() {
		return address_line2;
	}
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Staff [address_line1=" + address_line1 + ", address_line2=" + address_line2 + ", age=" + age + ", city="
				+ city + ", country=" + country + ", designation=" + designation + ", email_address=" + email_address
				+ ", gender=" + gender + ", mobile_no=" + mobile_no + ", staff_first_nm=" + staff_first_nm
				+ ", staff_last_nm=" + staff_last_nm + ", staff_no=" + staff_no + ", state=" + state + ", zip=" + zip
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	}
