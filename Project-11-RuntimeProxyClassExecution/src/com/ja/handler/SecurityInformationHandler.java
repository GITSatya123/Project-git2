package com.ja.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.xml.sax.helpers.DefaultHandler;

import com.ja.service.AccountService;

public class SecurityInformationHandler implements InvocationHandler {
	private AccountService accountservice;
	
	

   Class clazz;
	
	public SecurityInformationHandler(Class clazz) {
		this.clazz = clazz;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	
		if(method.getName().equals("getBalance")) {
			System.out.println("Your account is secured");
		}else {
			System.out.println("your account is not secure");
		}
		proxy=clazz.newInstance();
		return method.invoke(proxy, args);
	}
	

}
