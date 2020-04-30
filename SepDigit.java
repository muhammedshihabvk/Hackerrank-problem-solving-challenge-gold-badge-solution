package com.hackerrank.problemSolving;

public class SepDigit {
	public static void main(String[] args) {
		int a=0;
		int n=12;
		int tempN=n;
		int count=0;
		while(n > 0)
        {
            a=n%10;
            n=n/10;
            if(a>0 && a!=0) {
            	//System.out.println(a);
            	if(tempN%a==0) {
            		count+=1;
            	}
            }   
        }
		System.out.println(count);
	}

}
