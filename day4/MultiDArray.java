package com.java.training.day4;

import java.util.Arrays;

public class MultiDArray {
	public static void main(String[] args) {
		int r=2,c=3;
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				arr[i][j]=i+j;
		for(int i=0;i<r;i++)
		System.out.println(Arrays.toString(arr[i]));
		
		
	}

}
