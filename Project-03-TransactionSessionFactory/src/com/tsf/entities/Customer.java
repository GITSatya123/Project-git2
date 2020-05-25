package com.tsf.entities;

import java.io.Serializable;

public class Customer implements Serializable  {
	protected int customerno;
	protected String customername;
	protected String addressline1;
	protected String city;
	protected int zip;
	protected String country;
	public int getCustomerno() {
		return customerno;
	}
	public void setCustomerno(int customerno) {
		this.customerno = customerno;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
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
		return "Customer [customerno=" + customerno + ", customername=" + customername + ", addressline1="
				+ addressline1 + ", city=" + city + ", zip=" + zip + ", country=" + country + "]";
	}
	
	

}
