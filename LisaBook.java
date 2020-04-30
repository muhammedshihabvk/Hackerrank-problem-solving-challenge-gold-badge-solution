package com.hackerrank.problemSolving;

import java.util.Arrays;

public class LisaBook {
	public static void main(String[] args) {
		int k=3,j=0;
		int[] numberArray= new int[k];
		int[] arr= {4, 2 ,6 ,1 ,10};
		int pageNumber=0;
		for (int i : arr) {
			for (j = 1; j <=i; j++) {
				//System.out.print(j+"*");
				numberArray[i]=i;
				if(j%k==0) {
					System.out.println(Arrays.toString(numberArray));
					pageNumber+=1;
					//System.out.println("\n");
					System.out.println(pageNumber);
				}
			}
			//System.out.println("\n");
		}
	}

}
