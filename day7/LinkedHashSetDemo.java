package com.java.training.day7;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();// in given order

		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("E");
		linkedset.add("D");
		linkedset.add("E");// not added

		System.out.println("LinkedHashSet:" + linkedset);
		linkedset.remove("D");
		System.out.println("Updated LinkedHashSet: " + linkedset);
	}
}
