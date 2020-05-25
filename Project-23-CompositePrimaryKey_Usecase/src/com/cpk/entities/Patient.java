package com.cpk.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="patient")
public class Patient implements Serializable {
	@EmbeddedId
	protected PatientCompositePK pk;
	@Column(name="patient_name")
	protected String patientName;
	protected int age;
	protected String gender;
	@Column(name="email_Address")
	protected String emailAddress;
	
		
	public PatientCompositePK getPk() {
		return pk;
	}
	public void setPk(PatientCompositePK pk) {
		this.pk = pk;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Patient [pk=" + pk + ", patientName=" + patientName + ", age=" + age + ", gender=" + gender
				+ ", emailAddress=" + emailAddress + "]";
	}
	
	
	
	
}
