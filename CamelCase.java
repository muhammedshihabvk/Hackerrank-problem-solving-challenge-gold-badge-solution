package com.hackerrank.problemSolving;

public class CamelCase {
	public static void main(String[] args) {
		String s="saveChangesInTheEditor";
		char[] cArray=s.toCharArray();
		int count=1;
		for (int i = 0; i < cArray.length; i++) {
			if(Character.isUpperCase(cArray[i])) {
				count++;
			}
		}
		System.out.println(count);
	}

}
