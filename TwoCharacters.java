package com.hackerrank.problemSolving;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TwoCharacters {
	public static void main(String[] args) {
		String s = "beabeefeab";
		int tmp=0;
		HashMap<Character, Integer> map = new HashMap<>();
		char[] sArray=s.toCharArray();
		for (char c : sArray) {
			if(map.containsKey(c)) {
				tmp=map.get(c);
				tmp+=1;
				map.put(c,tmp);
				tmp=0;
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		System.out.println(map.keySet());
		
				
	}
}
