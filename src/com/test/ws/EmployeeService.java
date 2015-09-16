package com.test.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sample.xmlfiles.Employee;

@WebService
public interface EmployeeService {
	
	@WebMethod (operationName = "getEmployee")
	public Employee getEmployee(String empName);
	
	@WebMethod(operationName = "deleteEmployee")
	public void deleteEmployee(String empName);
	
}
