package com.java.training.day1;

public class BasicJavaCode {
	static byte b;static short s ;static int i;static long l;static float f;static double d;static boolean bo;static char c;
	static int a1,a2;
	public void add(int a,int b) {
		System.out.println(a+b);
		
	}
	public  void sub(int a,int b) {
		System.out.println(a+-b);
		
	}
	public  void mul(int a,int b) {
		System.out.println(a*b);
		
	}
	public  void div(int a,int b) {
		System.out.println(b/a);
		
	}
	public  void mod(int a,int b) {
		System.out.println(b%a);
		
	}
	public static void main(String args[]){  
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(bo);
		System.out.println(d);
		a1=5;
		a2=7;
		System.out.println(a1+a2);
		System.out.println(a1-a2);
		System.out.println(a1*a2);
		System.out.println(a2/a1);
		System.out.println(a2%a1);
		BasicJavaCode o=new BasicJavaCode();
		o.add(a1,a2);
		o.sub(a1,a2);
		o.mul(a1,a2);
		o.div(a1,a2);
		o.mod(a1,a2);
		
}
}
