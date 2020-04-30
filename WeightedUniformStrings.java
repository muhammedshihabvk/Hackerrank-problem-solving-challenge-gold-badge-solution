package com.hackerrank.problemSolving;

import java.util.HashSet;
import java.util.Set;

public class WeightedUniformStrings {
	static String alphaLetter = "abcdefghijklmnopqrstuvwxyz";
	static Set<Integer> set = new HashSet<>();

	public static int alphIndex(char x) {
		return alphaLetter.indexOf(x) + 1;
	}

	public static void main(String[] args) {
		String s = "abccddde";
		int[] queries = {6 , 1 , 3 , 12, 5, 9, 10};
		String[] result=new String[queries.length];
		int count = 0;
		char[] cArray = s.toCharArray();
		char temp;
		int i = 0;
		temp = cArray[0];
		System.out.println(cArray.length);
		for (i = 0; i < cArray.length; i++) {
			if (temp == cArray[i] && i<cArray.length+1) {
				count += 1;

			} else {
				for (int j = 1; j <= count; j++) {
					set.add(alphIndex(temp) * j);
				}
				temp = cArray[i];
				count = 0;
				i = i - 1;
			}
		}
		for (int j = 1; j <= count; j++) {
			set.add(alphIndex(temp) * j);
		}
		for (int k = 0; k < queries.length; k++) {
			if(set.contains(queries[k])) {
				result[k]="YES";
			}else {
				result[k]="NO";
			}
		}
		System.out.println(set);
		for (String c : result) {
			System.out.println(c);
		}
	}
}

