package com.javabasic.iostreams.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {

		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;

		try {
			fileInputStream = new FileInputStream(
					"/Users/abbas/Abbas/Java/java-basic/JavaBasic/src/com/javabasic/iostreams/serialization/Emp.ser");
			objectInputStream = new ObjectInputStream(fileInputStream);

			Object obj = objectInputStream.readObject();
			Employeee employeee = (Employeee) obj;
			System.out.println(employeee.id);
			System.out.println(employeee.name);
			System.out.println(employeee.salary);
			System.out.println(employeee.ssn);

			System.out.println("Employee Object Deserialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fileInputStream.close();
				objectInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
