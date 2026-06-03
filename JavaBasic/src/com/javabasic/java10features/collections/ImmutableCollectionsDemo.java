package com.javabasic.java10features.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollectionsDemo {

	// List.of OR List.copyOf both creates immutable list one copy from another list and one create from element
	// We can't change immutable list
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Abbas", "Rahul", "Pathan");
		System.out.println(list);

		var list2 = List.copyOf(list);
		System.out.println(list2);

		Set<String> set = Set.of("abc", "xyz");
		System.out.println(set);

		var set2 = Set.copyOf(set);
		System.out.println(set2);

		Map<String, String> map = Map.of("1", "abc", "2", "xyz");
		System.out.println(map);

		var map2 = Map.copyOf(map);
		System.out.println(map2);
	}
}
