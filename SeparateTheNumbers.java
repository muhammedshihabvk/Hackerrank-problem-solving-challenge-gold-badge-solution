package com.hackerrank.problemSolving;

public class SeparateTheNumbers {
	public static void main(String[] args) {
		String s="9910010";
		char[] cArray=s.toCharArray();
		int index=0;
		int[] zeroIndex=new int[s.length()];
		int zeroCount=0;
		for (int i = 0; i < s.length(); i++) {
			if(cArray[i]=='0') {
				zeroCount++;
				zeroIndex[index]=i;
				index++;
			}
		}
		System.out.println(zeroCount);
		for (int i : zeroIndex) {
			System.out.print(i+" ");
		}
	}

}
