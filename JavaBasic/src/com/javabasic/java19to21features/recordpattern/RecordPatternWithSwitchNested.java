package com.javabasic.java19to21features.recordpattern;

record Address(String city, String state) {

}

record Person(String name, Address address) {

}

public class RecordPatternWithSwitchNested {

	public static void main(String[] args) {
		print(new Person("Abbas", new Address("Pune", "MH")));
	}

	private static void print(Person person) {
		switch (person) {
		case Person(String name, Address(String city, String state)) ->
			System.out.println(name + " live in " + city + " " + state);
		}
	}
}
