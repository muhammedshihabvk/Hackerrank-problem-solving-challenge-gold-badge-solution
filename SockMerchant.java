package com.hackerrank.problemSolving;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SockMerchant {
	public static void main(String[] args) {
		
		int[] ar= {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int bal=0;
		int val,temp,temp2;
		Map< Integer,Integer> hm =  new HashMap< Integer,Integer>(); 
        //hm.put("a", new Integer(100));
        for(int i=0;i<ar.length;i++){
            if(hm.containsKey(ar[i])) {
            	val=hm.get(ar[i]);
            	val=val+1;
            	hm.put(ar[i], val);
            	
            }else {
            	hm.put(ar[i], 1);
            }
        }
        //System.out.println(hm.keySet());
        Set<Integer> index = hm.keySet();
        int y = index.size(); 
        int[] arr =  new int[y];
        int k = 0; 
        for (Integer x : index) 
            arr[k++] = x; 
        System.out.println(hm);
        for(int i=0;i<arr.length;i++) {
        	if(hm.get(arr[i])%2==0) {
        		bal+=(hm.get(arr[i])/2);
        		//System.out.println(hm.get(arr[i])+"    :even:"+bal);
        	}else {
        		//System.out.println("res"+hm.get(arr[i]));
        		temp=hm.get(arr[i])%2;
        		//System.out.println("temp:"+temp);
        		temp2=hm.get(arr[i])-temp;
        		//System.out.println("temp2:"+temp2);
        		bal+=temp2/2;
        		//System.out.println(hm.get(arr[i])+"    :odd:"+bal);
        	}	
        }
        System.out.println("result : "+bal);
        //return bal;
	}

}
