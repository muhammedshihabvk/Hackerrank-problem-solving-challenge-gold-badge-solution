package com.hackerrank.problemSolving;

import java.util.ArrayList;
import java.util.List;


public class BirdCount {
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		arr.add(4);
		
		int[] countArr = {0,0,0,0,0,0};
		for(int i=0;i<arr.size();i++) {
			countArr[arr.get(i)]=countArr[arr.get(i)]+1;
		}
		for (int i = 1; i < countArr.length; i++) {
			System.out.println(i+":"+countArr[i]);
		}
		int largest=0;
		int index=0,occ=0;
		for (int i = 1; i < countArr.length; i++) {
			if(countArr[i]>=largest) {
				largest=countArr[i];
				index=i;
			}
		}
		System.out.println("\nlargest count bird: "+index+":"+largest);
		for (int i = 0; i < countArr.length; i++) {
			if(countArr[i]==largest) {
				occ+=1;
			}
		}
		System.out.println("occ:"+occ);
		if(occ>=2) {
			for (int i = 0; i < index; i++) {
				if(countArr[i]==largest) {
					System.out.println("result"+i);
					//return i;
				}
			}
		}else {
			System.out.println("result"+index);
			//return index;
		}
		
	}

}
