package com.javabasic.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblemWithoutGeneric {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		String[] str = new String[10];
		str[0] = "Abbas";
		str[1] = "Pathan";
		// str[2] = 123; Compile time error as 123 is integer

		List list = new ArrayList();
		list.add("Abbas");
		list.add("Pathan");
		list.add(123);

		String name = (String) list.get(0);
		String sname = (String) list.get(1);
		System.out.println(name + " " + sname);
		String num = (String) list.get(2);// Cast exception as index 2 value is integer
		System.out.println(num);
		// Due to this issue java introduce generic type
	}
}
