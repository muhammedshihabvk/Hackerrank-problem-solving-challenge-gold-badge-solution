package com.hackerrank.problemSolving;


public class Encryption {
	public static void main(String[] args) {
		String s = "feedthedog";
		String result = "";
		char[] sArray = s.toCharArray();
		int x = sArray.length;
		double d = Math.sqrt(x);
		System.out.println(d);
		int counter = 0;
		int row = (int) Math.floor(d);
		int col = (int) Math.ceil(d);
		if ((row * col) < x) {
			row = (int) Math.ceil(d);
		}
		System.out.println("row:" + row);
		System.out.println("col:" + col);
		char[][] matrix = new char[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (counter == x) {
					break;
				}
				matrix[i][j] = sArray[counter];
				counter++;
			}
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(matrix[i][j]);
//			}
//			System.out.println();
//		}
		result ="";
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int c = 0; c < col; c++) {
			for (int h = 0; h < row; h++) {
				System.out.print(matrix[h][c]);
				result=result + String.valueOf(matrix[h][c]);
				result=result.trim();
			}
			result=result + " ";
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(result);
	}

}
