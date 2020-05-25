package com.ja.service;

public class AccountServiceImpl implements AccountService {

	@Override
	public double getBalance(String accountNo, String accountType) {
		return 3535;
	}

	@Override
	public boolean closeAccount(String accountNo, String reason) {
		return true;
	}

}
