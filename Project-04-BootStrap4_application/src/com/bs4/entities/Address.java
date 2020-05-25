package com.bs4.entities;

import java.io.Serializable;

public class Address implements Serializable {
	
	protected int address_no;
	protected String addressline_1;
	protected String addressline_2;
	protected String city;
	protected String state;
	protected int zip;
	protected String country;
	
	public int getAddress_no() {
		return address_no;
	}
	public void setAddress_no(int address_no) {
		this.address_no = address_no;
	}
	public String getAddressline_1() {
		return addressline_1;
	}
	public void setAddressline_1(String addressline_1) {
		this.addressline_1 = addressline_1;
	}
	public String getAddressline_2() {
		return addressline_2;
	}
	public void setAddressline_2(String addressline_2) {
		this.addressline_2 = addressline_2;
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
		return "Address [address_no=" + address_no + ", addressline_1=" + addressline_1 + ", addressline_2="
				+ addressline_2 + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}
	
	

}
