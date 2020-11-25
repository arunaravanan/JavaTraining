package com.java.training.day6;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionDemo {
	public static void main(String[] args) {
		System.out.println("Array");
		ArrayList<Comparable> a=new ArrayList<Comparable>();
		a.add(0);
		a.add("one");
		a.add(2);
		a.add("three");
		a.add(4);
		a.add("five");
		a.add(6);
		System.out.println(a);
		a.remove(2);///'2' here refers only to the index not value
		System.out.println(a);
		a.add(2, "two");
		System.out.println(a);
		a.remove("two");//"two" here refers to value
		// while removing arraylist checks for the indexes first if it matches it is executed rather than value
		System.out.println(a);
		
		System.out.println("LinkedList");
	
		LinkedList<Comparable> b=new LinkedList<Comparable>();
		
		b.add("one");
		b.add(2);
		b.add("three");
		b.add(4);
		b.add("five");
		b.add(7);
		System.out.println(b);
		b.remove(2);//removes index value
		System.out.println(b);
		b.add(2, 3);
		System.out.println(b);
		b.remove("five");//removes  value
		System.out.println(b);
//		b.remove(7);//error since first it searches for index value 7 which is not found
//		System.out.println(b);

	}

}
