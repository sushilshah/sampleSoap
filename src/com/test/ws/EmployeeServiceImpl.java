package com.test.ws;

import javax.jws.WebService;

import com.sample.xmlfiles.Address;
import com.sample.xmlfiles.Employee;

@WebService(endpointInterface="com.test.ws.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee getEmployee(String empName) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setName(empName);
		emp.setSalary(1007);
		System.out.println("get employee name : " + empName);
		Address address = new Address();
		address.setStreetNo("Some street");
		address.setAddress(" Andromeda Galaxy, Star Trek colony");
		address.setPinCode(5600056);
		emp.setAddress(address);
		return emp;
	}

	@Override
	public void deleteEmployee(String empName) {
		// TODO Auto-generated method stub
		System.out.println("Deleteed Employee : " + empName);

		
	}

}
