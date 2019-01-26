package com.techlabs.emp;

public class Employee {
	private  int empNo=100;
	private String firstName;
	private String lastName;
	private static int nextEmployeeNumber;

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.empNo= nextEmployeeNumber;
		nextEmployeeNumber++;
		
	}
	static {
		nextEmployeeNumber=100;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public  int getEmpNo() {
		return empNo;
	}
	
	

}
