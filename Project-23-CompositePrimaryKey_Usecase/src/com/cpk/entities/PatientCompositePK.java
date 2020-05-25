package com.cpk.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class PatientCompositePK implements Serializable{
	@Column(name="unique_Identification_No")
	protected String uniqueIdentificationNo;
	@Column(name="mobile_No")
	protected String mobileNo;
	
	public String getUniqueIdentificationNo() {
		return uniqueIdentificationNo;
	}
	public void setUniqueIdentificationNo(String uniqueIdentificationNo) {
		this.uniqueIdentificationNo = uniqueIdentificationNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "PatientCompositePK [uniqueIdentificationNo=" + uniqueIdentificationNo + ", mobileNo=" + mobileNo + "]";
	}
	
	
}
