package com.java.training.day4;

public class IfIfElseNestedIf {

	public static void main(String[] args) {
		int i = 9;

			if(i%3==0) {
				if(i%2==0)System.out.println("divisible by 6");
				else System.out.println("divisible by 3 but not by 2");
			}
			else System.out.println("not divisible by 3");
		

	}

}
