package com.java.training.day5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomExceptionInStringArrayRev {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		String s= scan.nextLine();
		
		
		
	try {
		    Pattern pattern = Pattern.compile("[^a-zA-Z]");
	        Matcher matcher = pattern.matcher(s);
			if(matcher.find())
			throw new NotStringException(s);
			char[] sarray=s.toCharArray();
		    char[]	srev= new char[sarray.length];
		    for(int i=0;i<sarray.length;i++)
			   srev[i]=sarray[sarray.length-1-i];
		    System.out.println(srev);
	}
	catch (NotStringException e){
		System.out.println(e);
		
	}
	finally {//always executed irrespective of exception
	    	scan.close();
	    	System.out.println("// finally Block");
	}
		

	}

}
