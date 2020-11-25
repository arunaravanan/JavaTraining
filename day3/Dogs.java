package com.java.training.day3;

public class Dogs extends Mammals {
	public static void character() {
		System.out.println("It Barks");
	}
	public  static void main(String args[]) {	
		Living.character();
		Mammals.character();		
		character();
		}

}
