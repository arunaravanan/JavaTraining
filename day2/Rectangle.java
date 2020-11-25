package com.java.training.day2;

public class Rectangle extends Shape {
public void area() {
	System.out.println("area of rectangle :"+getLength()*getBreath()); 
}
public void perimeter() {
	System.out.println("perimeter of rectangle :"+2*(getLength()+getWidth()));
}
}