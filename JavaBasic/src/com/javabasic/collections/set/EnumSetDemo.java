package com.javabasic.collections.set;

import java.util.EnumSet;

enum Day {
	MON, TUE, WED, THU, FRI, SAT, SUN
}

public class EnumSetDemo {

	public static void main(String[] args) {
		EnumSet<Day> enumSet = EnumSet.of(Day.MON, Day.TUE, Day.WED, Day.THU, Day.FRI, Day.SAT, Day.SUN, Day.SUN);
		EnumSet<Day> allOf = EnumSet.allOf(Day.class);
		System.out.println(enumSet);
		System.out.println(allOf);
	}
}
