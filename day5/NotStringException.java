package com.java.training.day5;

public class NotStringException extends Exception{
	String str,str1;

	public NotStringException(String s) {
		str1=s;
		str=" Contains Numericals or Special Characters";
		
	}
	public String toString(){ 
		return ("NotStringException Occurred: "+str1+str) ;
	   }

}
