package com.hackerrank.problemSolving;

public class TimeConversion {
	public static void main(String[] args) {
		String time = "12:05:45pm";
		int num =Integer.parseInt(String.valueOf(time.subSequence(0, 2)));
		System.out.println(num);
		int hr;
		if (time.contains("PM") ||time.contains("pm")) {
			if(num==12) {
				String  st =String.valueOf(time.subSequence(0, 8));
				System.out.println(st);
			}else {
				hr=num+12;
				String  st =String.valueOf(time.subSequence(2, 8));
				System.out.println(String.valueOf(hr)+st);
			}
		}else {
			String  st =String.valueOf(time.subSequence(0, 8));
			System.out.println(st);
		}
	}
}