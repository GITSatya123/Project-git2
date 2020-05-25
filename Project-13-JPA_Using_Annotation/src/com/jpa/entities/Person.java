package com.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
@Id
	@Column(name="person_Id")
	protected int personId;
	@Column(name="peerson_name")
	protected String peersonName;
	protected String gender;
	protected int age;
	protected String mobileNo;
	@Column(name="email_address")
	protected String emailaddress;
	
	public int getPerson_Id() {
		return personId;
	}
	public void setPerson_Id(int person_Id) {
		this.personId = person_Id;
	}
	public String getPeersonName() {
		return peersonName;
	}
	public void setPeersonName(String peersonName) {
		this.peersonName = peersonName;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	@Override
	public String toString() {
		return "Person [person_Id=" + personId + ", personName=" + peersonName + ", gender=" + gender + ", age=" + age
				+ ", mobileNo=" + mobileNo + ", emailaddress=" + emailaddress + "]";
	}
	
	

}
