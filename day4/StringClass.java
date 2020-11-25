package com.java.training.day4;

public class StringClass {

	public static void main(String[] args) {
		String name="Arun Balaji";
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.concat(" Aravanan"));
		
		System.out.println(name.indexOf("n"));

		System.out.println(name.contains("Ba"));
		
		System.out.println(name.contentEquals("Arun Balaji"));
		
		System.out.println(name.endsWith("ji"));
		
		System.out.println(name.startsWith("Ar"));
		
		System.out.println(name.indent(03));
		
		System.out.println(name.indexOf("Balaji"));
		
		System.out.println(name.isBlank());
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.length());
		
		System.out.println(name.repeat(2));

	}

}
