package com.javabasic.collections.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		System.out.println(linkedList);
		
		linkedList.addFirst(40);
		linkedList.addLast(40);

        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.set(2, 20);

        System.out.println(linkedList);
	}
}
