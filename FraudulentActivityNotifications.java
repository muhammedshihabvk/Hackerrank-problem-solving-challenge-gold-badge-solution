package com.hackerrank.problemSolving;

import java.util.Arrays;

public class FraudulentActivityNotifications {
	public static void main(String[] args) {
		int[] expenditure = { 10, 20, 30, 40, 50};
		//Arrays.sort(exp);
		int d = 3;
		int j = 0;
		int c = 0;
		float checkVal = 0;
		;
		float median = 0;
		int counter = 0;
		int[] temp = new int[d];
		for (int i = d; i < expenditure.length; i++) {
			// System.out.println(expenditure[i] + "=d=" + d);
			j = i - 1;
			c = d - 1;
			while (j > 0 && c >= 0) {
				temp[c] = expenditure[j];
				c--;
				j--;
			}
			if (i == d) {
				temp[0] = expenditure[0];
			}
			System.out.println(Arrays.toString(temp) + "-->");
			Arrays.sort(temp);
			if (temp.length % 2 == 0) {
				int x = temp.length / 2;
				median = (float) (temp[x] + temp[x + 1]) / 2;
				checkVal = 2 * median;
			} else {
				int x = temp.length / 2;
				System.out.println();
				median = temp[x];
				checkVal = 2 * median;
			}
			System.out.println(checkVal);
			if (expenditure[i] >= checkVal) {
				counter++;
			} else {
				continue;
			}
			checkVal = 0;
			median = 0;
		}
		System.out.println(counter);
	}

}
