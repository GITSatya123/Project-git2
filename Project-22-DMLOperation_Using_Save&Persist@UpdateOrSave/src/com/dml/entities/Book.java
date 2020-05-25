package com.dml.entities;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable{
	
	protected int bookNo;
	protected String authorName;
	protected String publisher;
	protected Date publishedDate;
	protected int price;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", authorName=" + authorName + ", publisher=" + publisher + ", publishedDate="
				+ publishedDate + ", price=" + price + "]";
	}
	
	
	
	
	
	

}
