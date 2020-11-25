package com.java.training.assignment_tws.Nov21st;

import java.util.Scanner;

public class DivisorSum {
	public static int DivSum(int n) {
		int divsum=0;
		for(int i=1;i<=n;i++)
			if(n%i==0)divsum+=i;
		return divsum;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		if(n<=1000)
			System.out.println(DivSum(n));
		else 
			System.out.println("Input greater than 1000");
	}


}
