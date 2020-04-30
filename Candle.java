package com.hackerrank.problemSolving;

public class Candle {
	public static void main(String[] args) {
		int[] ar=new int[]{18,90,90,13,90,75,90,8,90,43};
		int max=0;
        int count=0;
        for(int i=0;i<ar.length;i++){
        	//System.out.println(ar[i]);
            if(max<ar[i]){
                max=ar[i];
            }
        }
        count=0;
        for(int i=0;i<ar.length;i++){
            if(max==ar[i]){
                count=count+1;
            }
        }
        System.out.println(count);
        //return count;
	}

}
