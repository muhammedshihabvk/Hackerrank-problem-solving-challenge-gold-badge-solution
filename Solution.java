package com.hackerrank.problemSolving;

import java.util.HashMap;

public class Solution {
	public static void main(String[] args) {
		int[] arr= {22,22,22,22,22,22};
		HashMap<Integer, Integer> map  = new HashMap<>();  
		int val=0;
		int sum=0;
	    for(int i=0;i<arr.length;i++) {
	    	if(map.containsKey(arr[i])== true) {
	    		val = map.get(arr[i]);
	    		map.put(arr[i], (val+1));
	    	}else {
	    		map.put(arr[i], 1);
	    	}
	    }
	    System.out.println(map);
	    val=0;
	    for ( Integer key : map.keySet() ) {
	    	if(map.get(key)>val) {
	    		val=map.get(key);
	    	}
	    }
	    System.out.println( val );
	    for ( Integer key : map.keySet() ) {
	    	if(map.get(key)==val) {
	    		
	    		continue;
	    	}else {
	    		sum = sum+map.get(key);
	    	}
	    }
	    int sumEqu=0;
	    for ( Integer key : map.keySet() ) {
	    	if(map.get(key)==val) {
	    		sumEqu+=map.get(key);
	    	}
	    }
	    System.out.println(sumEqu);
	    if(map.keySet().size()==1) {
	    	System.out.println(0);
	    	//return 0;
	    }
	    else if(sum==0){
            //return arr.length-1;
            System.out.println(arr.length-1);
        }else if(sumEqu>val) {
        	sumEqu=sumEqu-val;
        	//return sum+sumEqu
        			System.out.println(sum+sumEqu);
        }else {
        	System.out.println(sum);
        	//retrun sum;
        }
        	
	    
	}    

}
