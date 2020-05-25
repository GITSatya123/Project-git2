package com.tph.entities;

import java.util.Date;

public class ChequePayment extends Payment{
	
	protected int paymentNo;
	protected Date paymentDate;
	protected String description;
	protected int amount;
	protected String ChequeNo;
	protected String bankName;
	protected String branchName;
	protected String ifscCode;
	public int getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(int paymentNo) {
		this.paymentNo = paymentNo;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getChequeNo() {
		return ChequeNo;
	}
	public void setChequeNo(String chequeNo) {
		ChequeNo = chequeNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "ChequePayment [paymentNo=" + paymentNo + ", paymentDate=" + paymentDate + ", description=" + description
				+ ", amount=" + amount + ", ChequeNo=" + ChequeNo + ", bankName=" + bankName + ", branchName="
				+ branchName + ", ifscCode=" + ifscCode + "]";
	}
	
	
	
	

}
