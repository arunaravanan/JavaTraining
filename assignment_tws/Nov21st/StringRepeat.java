package com.java.training.assignment_tws.Nov21st;

import java.util.Scanner;

public class StringRepeat {
	public static String RepeatString(String s,int n) {
			
		return s.repeat(n);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();		
		int n=scan.nextInt();
		scan.close();
		System.out.println(RepeatString(s,n));
			

	}

}
