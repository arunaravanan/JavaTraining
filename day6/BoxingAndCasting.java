package com.java.training.day6;

public class BoxingAndCasting {
	public static void main(String[] args) {
	
		int a=1;
		Integer b=2;//auto-boxing---primitives(int) to object wrapper class(Integer)
		Integer c=a;
		int z=b;//unboxing---object wrapper class(Integer) to primitives(int)
		System.out.println(c);//1
		System.out.println(z);//2
		int p=47;

		
		double l=p;    //     implicit typecasting----int is typecasted as double 
	       
		char m=(char)p;//      Explicit typecasting----int is typecasted as char
		
		System.out.println(l);//double value of 47 is 47.0
		System.out.println(m);// char value of 47 is "/"
	}

}
