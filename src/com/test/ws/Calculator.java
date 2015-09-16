package com.test.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calculator {
	
	@WebMethod
	public int add(int a, int b);
	
	@WebMethod
	public int subtract(int a, int b);
}
