package com.hackerrank.problemSolving;

import java.util.ArrayList;
import java.util.List;


public class BonAppétit {
	public static void main(String[] args) {
		int k=1;
		List<Integer> bill= new ArrayList<Integer>();
		bill.add(3);
		bill.add(10);
		bill.add(2);
		bill.add(9);
		int b =12;
		int sum2=0;
		for (int i = 0; i < bill.size(); i++) {
			if(i==k) {
				continue;
			}else {
					sum2=sum2+bill.get(i);
			}
		}
		System.out.println(sum2);
		if((sum2/2)==b) {
			System.out.println("Bon Appetit");
			//return "Bon Appetit";
		}else {
			System.out.println(b-(sum2/2));
			//return b-(sum2/2);
		}
	}
}
