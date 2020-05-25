package com.idg.entities;

import java.io.Serializable;
import java.util.Date;


public class UserFeedback  implements Serializable{
	
	protected String feedbackNo;
	protected String description;
	protected Date feedbackDate;
	protected String userName;
	
	
	public String getFeedbackNo() {
		return feedbackNo;
	}

	public void setFeedbackNo(String feedbackNo) {
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

	@Override
	public String toString() {
		return "UserFeedback [description=" + description + ", feedbackDate=" + feedbackDate + ", feedbackNo="
				+ feedbackNo + ", userName=" + userName + "]";
	}

}
