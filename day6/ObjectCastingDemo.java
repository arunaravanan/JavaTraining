package com.java.training.day6;

public class ObjectCastingDemo {

	

	public static void main(String[] args) {
	
		one a = new two();
		one b = new one();
		two c = new two();
		//two d = (two) new one();///creates run time error since one is not a two
		a.method();
		b.method();
		c.method();
		

	}

}
