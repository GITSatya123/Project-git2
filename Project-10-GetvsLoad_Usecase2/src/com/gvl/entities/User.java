package com.gvl.entities;

import java.io.Serializable;


public class User implements Serializable {
	
	protected int userId;
	protected String userName;	
	protected String gender;
	protected int age;
	protected String mobileno;
	protected String emailaddress;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", gender=" + gender + ", age=" + age
				+ ", mobileno=" + mobileno + ", emailaddress=" + emailaddress + "]";
	}
	
		

}
