package com.gvl.entities;

import java.io.Serializable;

public class Person implements Serializable {
	
	protected int pid;
	protected String pname;
	protected String gender;
	protected int age;
	protected String mobileno;
	protected String emailaddress;
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
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
		return "Person [pid=" + pid + ", pname=" + pname + ", gender=" + gender + ", age=" + age + ", mobileno="
				+ mobileno + ", emailaddress=" + emailaddress + "]";
	}

	

}
