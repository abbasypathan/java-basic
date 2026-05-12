package com.javabasic.object;

public class Employee {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee information is :  " + this.firstName + this.lastName;
	}

	@Override
	public int hashCode() {
		return this.firstName.length() + this.lastName.length();
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		return this.firstName.equals(employee.firstName) && this.lastName.equals(employee.lastName);
	}
}
