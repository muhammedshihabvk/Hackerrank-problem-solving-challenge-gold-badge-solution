package com.hackerrank.problemSolving;

import java.util.Arrays;

public class ServiceLane {
	public static int smallLane(int[] range,int[] lane) {
		int start=range[0],end=range[1];
		int smallVal=lane[start];
		for (int i = start; i <= end; i++) {
			if(lane[i]<smallVal) {
				smallVal=lane[i];
			}
		}
		return smallVal;
	}
	public static void main(String[] args) {
		
		//int[] width= {2 ,3 ,1 ,2 ,3 ,2 ,3, 3};
		//int[][] cases= {{0, 3}, {4 ,6}, {6 ,7}, {3 ,5}, {0 ,7}};
		int[] width= {1 ,2 ,2 ,2 ,1};
		int[][] cases= {{2,3}, {1,4}, {2,4}, {2,4}, {2,3}};
		int[] result=new int[cases.length];
		for (int i = 0; i < cases.length; i++) {
			result[i] = smallLane(cases[i],width);
		}
		System.out.println(Arrays.toString(result));
		
	}
}
