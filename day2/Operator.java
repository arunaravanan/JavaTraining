package com.java.training.day2;

public class Operator {
private int a,b;

	public int geta() {
	return a;
}

public void seta(int a) {
	this.a = a;
}

public int getb() {
	return b;
}

public void setb(int b) {
	this.b = b;
}

public void Arithematic() {
	System.out.println("sub:"+(b-a));
	System.out.println("mul:"+(a*b));
	System.out.println("div:"+(b/a));
	System.out.println("mod:"+(b%a));
	System.out.println("preincr:"+(++a));//10=>11
	System.out.println("predecr:"+(--b));//20=>19
	System.out.println("incrpost:"+(a++));//11=>12//but not printed rightaway
	System.out.println("decrpost:"+(b--));//19=>18//but not printed
	System.out.println("next iteration print:"+(a));//
	System.out.println("next iteration print:"+(b));//



}


}
