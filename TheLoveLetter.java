package com.hackerrank.problemSolving;

public class TheLoveLetter {
	public static String reverse(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		return reverse;
	}

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

	public static int costCalculate(String s) {
		int countF = 0, countE = 0;
		String temp;
		boolean flag = false;
		if (isPalindrome(s)) {
			// System.out.println(0);
			return 0;
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
						// System.out.println(temp);
						flag = true;
						break;
					}
				}
			}
			// System.out.println(countE);
			return countE;
		}
	}

	public static void main(String[] args) {
		String s = "bafhaef";
		// System.out.println(costCalculate(s));
		// System.out.println(costCalculate(reverse(s)));
		if (costCalculate(s) < costCalculate(reverse(s))) {
			System.out.println(costCalculate(s));
		} else {
			System.out.println(costCalculate(reverse(s)));
		}
	}

}
