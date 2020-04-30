package com.hackerrank.problemSolving;

public class FunnyString {
	public static String reverse(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		return reverse;
	}

	public static int[] toAscii(String s) {
		int[] temp = new int[s.length()];
		char[] cArray = s.toCharArray();
		for (int i = 0; i < cArray.length; i++) {
			temp[i] = (int) cArray[i];
		}
		return temp;
	}

	public static int[] valueDiffrence(int[] i) {
		int[] x = new int[i.length - 1];
		int count = 0;
		int res = 0;
		for (int j = 0; j < i.length - 1; j++) {
			res = i[j + 1] - i[j];
			if (res < 0) {
				res *= -1;
			}
			x[count] = res;
			count++;
		}
		return x;
	}

	public static void main(String[] args) {
		String s = "bcxz";
		int[] sAscii = toAscii(s);
		int[] res1 = valueDiffrence(sAscii);
		// -----------------reverse-------------
		int[] rAscii = toAscii(reverse(s));
		int[] res2 = valueDiffrence(rAscii);
		// -------------------------------------
		boolean flag = false;
		for (int i = 0; i < res2.length; i++) {
			if (res1[i] == res2[i]) {
				continue;
			} else {
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Funny");
		} else {
			System.out.println("Not Funny");
		}
	}
}
