package com.hackerrank.problemSolving;

public class DivSumPair {
	public static void main(String[] args) {
		//int n=6;
		//~~~~~~~~~~~~~~sample 1~~~~~~~~~~~~~~
		int k=3,count=0;
		int[] ar = {1,3,2,6,1,2};
		//~~~~~~~~~~~~sample2~~~~~~~~~~~~~
//		int n=2,k=2,count=0;
//		int[] ar = {8,10};
		System.out.println(ar.length);
		for(int i=0;i<=ar.length-2;i++) {
			for(int j=i+1;j<=ar.length-1;j++) {
				if((ar[i]+ar[j])%k==0) {
					System.out.println(ar[i]+" "+ar[j]);
					count+=1;
				}
			}
		}
		System.out.println(count);
	}

}
