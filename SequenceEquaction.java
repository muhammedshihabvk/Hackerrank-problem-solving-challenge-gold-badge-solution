package com.hackerrank.problemSolving;

public class SequenceEquaction {
	
	public static int indexFind(int n,int[] array) {
		// TODO Auto-generated method stub
		int result=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==n) {
				result=i+1;;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] p= {4, 3, 5, 1, 2};
		int[] res = new int[p.length+1];
		int[] resultReturn = new int[p.length-1];
		int index=0;
		int j=0;
		for (int i = 0; i < p.length+1; i++) {
			index=indexFind(i, p);
			res[j]=indexFind(index, p);
			j++;
		}
		System.out.println(res.length);
		for (int i = 0; i < res.length-1; i++) {
			System.out.println(i+"  "+res[i+1]);
			resultReturn[i]=res[i+1];
			
		}
		System.out.println(resultReturn.length);
		
	}

}
