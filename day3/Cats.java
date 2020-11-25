package com.java.training.day3;

public class Cats extends Mammals {
	public static void character() {
		System.out.println("It Meows");
	}
	public static void main(String args[]) {	

	Living.character();
	Mammals.character();
	character();
	}
}
