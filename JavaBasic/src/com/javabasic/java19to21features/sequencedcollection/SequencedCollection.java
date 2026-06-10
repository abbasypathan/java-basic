package com.javabasic.java19to21features.sequencedcollection;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SequencedMap;
import java.util.SequencedSet;

public class SequencedCollection {

	public static void main(String[] args) {
		List<Integer> list = List.of(10, 20, 30, 40, 50, 50);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.reversed());

		SequencedSet<Integer> set = new LinkedHashSet<>(list);
		System.out.println(set.getFirst());
		System.out.println(set.getLast());
		System.out.println(set.reversed());

		SequencedMap<String, Integer> map = new LinkedHashMap<>();
		map.put("Abbas", 12);
		map.put("Pathan", 23);
		System.out.println(map);
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());
		System.out.println(map.reversed());
	}
}
