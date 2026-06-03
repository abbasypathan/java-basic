package com.javabasic.java10features.var;

import java.util.HashMap;
import java.util.List;

public class VarDemo {

	public static void main(String[] args) {
		var num = 123;
		System.out.println(num);

		var map = new HashMap<String, List<String>>();
		map.put("Abbas", List.of("Abbas", "Pathan"));

		for (var m : map.entrySet()) {
			var value = m.getValue();
			System.out.println(value);
		}
	}
}
