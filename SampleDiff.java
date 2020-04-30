package com.hackerrank.problemSolving;

import java.util.ArrayList;
import java.util.List;

public class SampleDiff {
	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
	    row1.add(11);
	    row1.add(2);
	    row1.add(4);
	    arr.add(row1);
	    
	    List<Integer> row2 = new ArrayList<>();
	    row2.add(3);
	    row2.add(5);
	    row2.add(6);
	    arr.add(row2);
	    
	    List<Integer> row3 = new ArrayList<>();
	    row3.add(10);
	    row3.add(8);
	    row3.add(-12);
	    arr.add(row3);
	    
	    List<Integer> temp= new ArrayList<Integer>();
        int sum1=0;
        int sum2=0;
        int sizeBack=0;
        sizeBack = arr.get(0).size();
        for(int i=0;i<arr.size();i++){
            temp = arr.get(i);
            sum1=sum1+temp.get(i);
        }
        System.out.println(sum1);
        
        for(int i=0;i < arr.size();i++){
            temp=arr.get(i);
            sum2=sum2+temp.get(sizeBack-1);
            sizeBack=sizeBack-1;
            if(sizeBack<0){
                break;
            }
        }
        System.out.println(sum2);
        
        if(sum1 <=0 || sum2<=0) {
        	if(sum1<0) {
        		sum1=sum1*(-1);
        	}
        	if(sum2<0) {
        		sum2=sum2*(-1);
        	}
        }
        int diff=0;
        if(sum1<sum2) {
        	diff = sum2-sum1;
        	System.out.println(diff);
        	//return diff;
        }else {
        	diff= sum1-sum2;
        	System.out.println(diff);
        	//return diff;
        }
	}
}
