package com.java.training.day4;

import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		int[] rev =  new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			rev[rev.length-1-i]=a[i];
		}
		
	
		System.out.println(Arrays.toString(rev));
		
	}

}
