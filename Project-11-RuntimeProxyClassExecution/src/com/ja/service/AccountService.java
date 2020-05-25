package com.ja.service;

public interface AccountService {
	
	 public double getBalance(String accountNo,String accountType);
	 public boolean closeAccount(String accountNo,String reason);
	  
}
