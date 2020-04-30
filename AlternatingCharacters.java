package com.hackerrank.problemSolving;

public class AlternatingCharacters {
	public static void main(String[] args) {
		String s="ABAB";
		int count=0;
		char[] cArray = s.toCharArray();
		char temp=' ';
		
		for (int i = 0; i < cArray.length; i++) {
			if(temp==cArray[i]) {
				count++;
			}else {
				temp=cArray[i];
			}
		}
		System.out.println(count);

	}

}
