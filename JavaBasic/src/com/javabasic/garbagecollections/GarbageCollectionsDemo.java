package com.javabasic.garbagecollections;

public class GarbageCollectionsDemo {

	int objId;

	GarbageCollectionsDemo(int objId) {
		this.objId = objId;
		System.out.println(this + " Created " + this.objId);
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 5000000; i++) {
			new GarbageCollectionsDemo(i);
		}
	}

	//Once JVM memory is full it will start collecting unused object
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + " Finalized " + this.objId);
	}
}
