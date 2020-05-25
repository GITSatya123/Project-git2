package com.tph.entities;

import java.util.Date;

public class DigitalPayment extends Payment {
	
	protected int paymentNo;
	protected Date paymentDate;
	protected String description;
	protected int amount;
	protected String partnerName;
	protected String txNo;
	protected Date credidateDate;
	protected String remarks;
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
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getTxNo() {
		return txNo;
	}
	public void setTxNo(String txNo) {
		this.txNo = txNo;
	}
	public Date getCredidateDate() {
		return credidateDate;
	}
	public void setCredidateDate(Date credidateDate) {
		this.credidateDate = credidateDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "DigitalPayment [paymentNo=" + paymentNo + ", paymentDate=" + paymentDate + ", description="
				+ description + ", amount=" + amount + ", partnerName=" + partnerName + ", txNo=" + txNo
				+ ", credidateDate=" + credidateDate + ", remarks=" + remarks + "]";
	}
	
	
	


}
