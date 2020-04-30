package com.hackerrank.problemSolving;

public class MariyaScore {
	public static void main(String[] args) {

		// int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
		//int[] scores = { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };
		int[]scores = {17, 45, 41, 60, 17, 41, 76, 43, 51, 40, 89, 92, 34, 6, 64, 7, 37, 81, 32, 50};
		int highest = 0, lowest = 0, temp;
		temp = scores[0];
		int[] result = { 0, 0 };
		for (int i = 0; i < scores.length - 1; i++) {
			if (temp < scores[i + 1]) {
				highest += 1;
				temp = scores[i + 1];
				//System.out.println(temp);
			}
		}
		System.out.println(highest);
		result[0] = highest;
		temp = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (temp > scores[i]) {
				temp=scores[i];
				//System.out.println(temp);
				lowest += 1;
			}
		}
		System.out.println(lowest);
		result[1] = lowest;
		//return result;
	}

}
