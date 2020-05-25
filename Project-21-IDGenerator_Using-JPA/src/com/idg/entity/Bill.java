package com.idg.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="bill")
public class Bill implements Serializable {
	@Id
	@Column(name="bill_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@GeneratedValue(generator ="seq_gen")
	//@SequenceGenerator(name="seq_gen",sequenceName="bill_sequence",allocationSize=1)
	//@GeneratedValue(generator="table_gen")
	//@TableGenerator(name="seq_gen",pkColumnName="table_name",pkColumnValue="bill",valueColumnName="pk_value",table="hibernate_uniue_key" ,allocationSize=1)
	protected int billNo;
	
	@Column(name="bill_Issued_date")
	protected Date billIssuedDate;
	
	@Column(name="isuued_name")
	protected String isuuedName;
	
	@Column(name="customer_name")
	protected String customerName;
	
	@Column(name="bill_amt")
	protected int billAmt;
	
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public Date getBillIssuedDate() {
		return billIssuedDate;
	}
	public void setBillIssuedDate(Date billIssuedDate) {
		this.billIssuedDate = billIssuedDate;
	}
	public String getIsuuedName() {
		return isuuedName;
	}
	public void setIsuuedName(String isuuedName) {
		this.isuuedName = isuuedName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(int billAmt) {
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", billIssuedDate=" + billIssuedDate + ", isuuedName=" + isuuedName
				+ ", customerName=" + customerName + ", billAmt=" + billAmt + "]";
	}
	
	
	

}
