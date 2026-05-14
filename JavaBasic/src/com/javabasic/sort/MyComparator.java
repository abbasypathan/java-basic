package com.javabasic.sort;

import java.util.Comparator;

public class MyComparator implements Comparator<ComparatorDemo> {

	@Override
	public int compare(ComparatorDemo o1, ComparatorDemo o2) {
		String s1 = o1.name;
		String s2 = o2.name;
		return s1.compareTo(s2);
	}

}
