package com.javabasic.iostreams.serialization;

import java.io.Serializable;

public class Employeee implements Serializable {

	private static final long serialVersionUID = 1L;

	int id;
	String name;
	double salary;
	transient int ssn;

	Employeee(int id, String name, double salary, int ssn) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}
}
