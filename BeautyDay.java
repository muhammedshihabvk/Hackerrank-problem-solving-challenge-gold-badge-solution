package com.hackerrank.problemSolving;

public class BeautyDay {
	int n;
	public static int reverseOp(int n) {
		int rev=0;
		while (n != 0) {
		    rev = rev * 10 + n % 10;
		    n /= 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		int i=20,j=24,k=6;
		int count=0;
		double result;
		int rev=0;
		for (int l = i; l <=j; l++) {
			rev=reverseOp(l);
			result=(l-rev);	
			if(result%k==0) {
				count+=1;
			}
		}
		System.out.println(count);
		//return count;
		
	}

}
