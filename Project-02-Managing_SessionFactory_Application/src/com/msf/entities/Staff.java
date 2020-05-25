
package com.msf.entities;

import java.io.Serializable;

public class Staff implements Serializable{
	
	protected int staff_no;
	protected String staff_first_name;
	protected String staff_last_name;
	protected String designation;
	protected String mob_no;
	protected String email_address;
	protected String role_no;
	
	public int getStaff_no() {
		return staff_no;
	}
	public void setStaff_no(int staff_no) {
		this.staff_no = staff_no;
	}
	public String getStaff_first_name() {
		return staff_first_name;
	}
	public void setStaff_first_name(String staff_first_name) {
		this.staff_first_name = staff_first_name;
	}
	public String getStaff_last_name() {
		return staff_last_name;
	}
	public void setStaff_last_name(String staff_last_name) {
		this.staff_last_name = staff_last_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getRole_no() {
		return role_no;
	}
	public void setRole_no(String role_no) {
		this.role_no = role_no;
	}
	
	@Override
	public String toString() {
		return "Staff [staff_no=" + staff_no + ", staff_first_name=" + staff_first_name + ", staff_last_name="
				+ staff_last_name + ", designation=" + designation + ", mob_no=" + mob_no + ", email_address="
				+ email_address + ", role_no=" + role_no + "]";
	}
	
	
}
