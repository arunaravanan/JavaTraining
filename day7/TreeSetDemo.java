package com.java.training.day7;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>();//in asc order

		ts1.add("A");
		ts1.add("C");
		ts1.add("B");

		ts1.add("C");// not added as it is a duplicate

		System.out.println(ts1);
	}

}
