package com.hackerrank.problemSolving;

import java.util.HashMap;

public class SequenceEqu {
	public static void main(String[] args) {
		int[] p = { 4, 3, 5, 1, 2 };
		int[] res = new int[p.length];
		int counter = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < p.length; i++) {
			map.put(p[i], i + 1);
		}
		System.out.println(map);
		System.out.println(map.keySet());
		for (Integer key : map.keySet()) {
			res[counter]= map.get(map.get(key));
			counter++;
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
