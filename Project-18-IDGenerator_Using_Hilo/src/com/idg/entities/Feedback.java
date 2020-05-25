package com.idg.entities;

import java.io.Serializable;
import java.util.Date;

public class Feedback implements Serializable {
	
	protected int feedbackNo;
	protected String description;
	protected Date feedbackDate;
	protected String userName;
	protected int rating;
	protected String productName;
	public int getFeedbackNo() {
		return feedbackNo;
	}
	public void setFeedbackNo(int feedbackNo) {
		this.feedbackNo = feedbackNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getFeedbackDate() {
		return feedbackDate;
	}
	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Feedback [feedbackNo=" + feedbackNo + ", description=" + description + ", feedbackDate=" + feedbackDate
				+ ", userName=" + userName + ", rating=" + rating + ", productName=" + productName + "]";
	}
	
	

}
