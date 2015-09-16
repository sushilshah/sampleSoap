package com.test.export;

import javax.xml.ws.Endpoint;

import com.test.ws.CalculatorImpl;

public class Exporter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8080/any/thing/calculator", new CalculatorImpl());
	}

}
