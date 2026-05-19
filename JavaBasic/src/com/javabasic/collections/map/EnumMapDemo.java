package com.javabasic.collections.map;

import java.util.EnumMap;

enum Day {
	MON, TUE, WED, THU, FRI, SAT, SUN
}

public class EnumMapDemo {

	public static void main(String[] args) {

		EnumMap<Day, String> map = new EnumMap<>(Day.class);

		map.put(Day.MON, "Java");
		map.put(Day.TUE, "Spring");
		map.put(Day.WED, "Hibernate");

		System.out.println(map);
	}
}
