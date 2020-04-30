package com.hackerrank.problemSolving;

public class AppendDelete {
	public static void main(String[] args) {
		String s="hackerhappy";
		String t="hackerrank";
		int k=9;
		int commonLength = 0;
		for (int i = 0; i < java.lang.Math.min(s.length(), t.length()); i++) {
			if (s.charAt(i) == t.charAt(i))
				commonLength++;
			else
				break;
		}
		if ((s.length() + t.length() - 2 * commonLength) > k) {
			System.out.println("No");
			//return "No";
		} else if ((s.length() + t.length() - 2 * commonLength) % 2 == k % 2) {
			System.out.println("Yes");
			//return "Yes";
		} else if ((s.length() + t.length() - k) < 0) {
			System.out.println("Yes");
			//return "Yes";
		} else {
			System.out.println("No");
			//return "No";
		}
	}

}
