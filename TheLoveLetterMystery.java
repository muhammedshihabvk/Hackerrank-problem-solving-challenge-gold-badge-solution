package com.hackerrank.problemSolving;

public class TheLoveLetterMystery {
	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
//		abc
//		abcba
//		abcd
//		cba
//
//		2
//		0
//		4
//		2
		String s = "abcd";
		int countF = 0, countE = 0;
		String temp;
		boolean flag = false;
		if (isPalindrome(s)) {
			System.out.println(0);
		} else {
			temp = s;
			char[] sArray = temp.toCharArray();
			// System.out.println("enterd");
			// System.out.println(temp.length());
			for (int i = temp.length() - 1; i >= 0 && flag == false; i--) {
				// System.out.println(sArray[i]);
				while (sArray[i] != 'a') {
					countE++;
					char t = sArray[i];
					sArray[i] = --t;
					// System.out.println(sArray[i]);
					temp = String.valueOf(sArray);
					// System.out.println(s);
					if (isPalindrome(temp)) {
						System.out.println(temp);
						flag = true;
						break;
					}
				}
			}
			System.out.println(countE);
			System.out.println("==========================");
			// ============================================
			temp = s;
			sArray = temp.toCharArray();
			sArray = temp.toCharArray();
			flag = false;
			for (int i = 0; i < temp.length() - 1 && flag == false; i++) {
				// System.out.println(sArray[i]);
				while (sArray[i] != 'a') {
					countF++;
					char t = sArray[i];
					sArray[i] = --t;
					// System.out.println(sArray[i]);
					temp = String.valueOf(sArray);
					//System.out.println(temp);
					if (isPalindrome(temp)) {
						System.out.println(temp);
						//System.out.println(countF);
						flag = true;
						break;
					}
				}
			}
			System.out.println(countF);
		}
	}
}