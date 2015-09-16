package com.test.ws;

import javax.jws.WebService;


@WebService(endpointInterface="com.test.ws.Calculator")
public class CalculatorImpl implements Calculator{

	@Override
	public int add(int a, int b) {
		System.out.println("Add value is " + (a + b));
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		System.out.println("Subtract value is : " + (a -b ));
		return a - b ;
	}

}
