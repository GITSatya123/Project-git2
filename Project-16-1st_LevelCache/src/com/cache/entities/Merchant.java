package com.cache.entities;

import java.io.Serializable;
import java.sql.Date;

public class Merchant implements Serializable {
	
	protected String merchantNo;
	protected String merchantName;
	protected String bussinessType;
	protected String city;
	
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getBussinessType() {
		return bussinessType;
	}
	public void setBussinessType(String bussinessType) {
		this.bussinessType = bussinessType;
	}
		public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Merchant [merchantNo=" + merchantNo + ", merchantName=" + merchantName + ", bussinessType="
				+ bussinessType + ", city=" + city + "]";
	}
	
	

}
