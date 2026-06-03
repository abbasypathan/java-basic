package com.javabasic.java9features.immutablecollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollectionsDemo {

	public static void main(String[] args) {
		List<String> list = List.of("Abbas", "Rahul", "Pathan");
		System.out.println(list);

		Set<String> set = Set.of("abc", "xyz");
		System.out.println(set);

		Map<String, String> map = Map.of("1", "abc", "2", "xyz");
		System.out.println(map);
	}
}
