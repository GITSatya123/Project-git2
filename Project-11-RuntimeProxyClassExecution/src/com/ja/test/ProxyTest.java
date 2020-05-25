package com.ja.test;

import java.lang.reflect.Proxy;

import com.ja.handler.SecurityInformationHandler;
import com.ja.service.AccountService;
import com.ja.service.AccountServiceImpl;

public class ProxyTest {

	public static void main(String[] args) {
		
		SecurityInformationHandler handler= new SecurityInformationHandler(AccountServiceImpl.class);
		AccountService  proxy=(AccountService) Proxy.newProxyInstance(AccountService.class.getClassLoader(), new Class[] { AccountService.class}, handler);
		double balance=proxy.getBalance("214431", "saving");
		System.out.println("Balance:"+balance);
		
		

	}

}
