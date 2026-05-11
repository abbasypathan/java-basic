package com.javabasic.iostreams.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream(
					"/Users/abbas/Abbas/Java/java-basic/JavaBasic/src/com/javabasic/iostreams/serialization/Emp.ser");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			Employeee employeee = new Employeee(1, "Abbas", 4500, 23456);
			objectOutputStream.writeObject(employeee);
			System.out.println("Employee Object Serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
				objectOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
