package com.javabasic.java17features.deserializationfilter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputFilter.Status;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(
				"/Users/abbas/Abbas/Java/java-basic/JavaBasic/src/com/javabasic/java17features/deserializationfilter/Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// Here we are controlling which class can be deserialise
		ObjectInputFilter filter = ObjectInputFilter.Config
				.createFilter("com.javabasic.java17features.deserializationfilter.*;java.base.*;!*");
		ois.setObjectInputFilter(filter);

		// If class matches then only it will deserialize otherwise it will take action
		// based on status which we specified in 2nd parameter
		ObjectInputFilter allowFilter = ObjectInputFilter.allowFilter(cl -> cl.equals(Employee.class), Status.REJECTED);
		ois.setObjectInputFilter(allowFilter);
		
		// We can merge 2 filter and create one object to set as filter 
		ObjectInputFilter merge = ObjectInputFilter.merge(allowFilter, filter);
		ois.setObjectInputFilter(merge);

		Object obj = ois.readObject();
		Employee emp = (Employee) obj;

		System.out.println("Employee Id: " + emp.id);
		System.out.println("Employee Name: " + emp.name);
		System.out.println("Employee Salary: " + emp.salary);
		System.out.println("Employee SSN: " + emp.ssn);

		ois.close();

	}

}
