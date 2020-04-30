package com.hackerrank.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SherlockAndTheValidString {
	public static int[] convertIntSetToStringSet(Set<Integer> setOfInteger) {
		return setOfInteger.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		String s = "aaaabbcc";
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		boolean flag = false;
		Set<Integer> intSet = new HashSet<Integer>();
		char[] cArray = s.toCharArray();
		for (char c : cArray) {
			if (map.containsKey(c)) {
				int temp = map.get(c);
				map.put(c, temp + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (char i : map.keySet()) {
			intSet.add(map.get(i));
		}
		int[] myArray = convertIntSetToStringSet(intSet);
		System.out.println(map);
		System.out.println(intSet);
		if (intSet.size() == 1) {
			System.out.println("YES");
		} else if (intSet.size() > 2) {
			System.out.println("NO");
		} else {
			if (intSet.size() == 2) {
				for (char c : map.keySet()) {
					if (map2.containsKey(map.get(c))) {
						int temp = map2.get(map.get(c));
						map2.put(map.get(c), temp + 1);
					} else {
						map2.put(map.get(c), 1);
					}
				}
				System.out.println(map2);
				for (int i : intSet) {
					if (map2.get(i) == 1) {
						flag = true;
					} else {
						continue;
					}
				}
				try {
					if (map2.get(1) > 1) {
						System.out.println("NO");
					}
				} catch (NullPointerException e) {
					// TODO: handle exception
				}
				if (flag == true) {
					System.out.println("yes");
				} else {
					System.out.println("NO");
				}

			} else {
				System.out.println("NO");
			}
		}
	}

}
