package com.hackerrank.problemSolving;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {
	public static Set<Character> conArraySet(char[] arr) {
		Set<Character> set = new HashSet<>();
		for (Character character : arr) {
			set.add(character);
		}
		return set;
	}
	public static void main(String[] args) {
		//String s="qwertyuiopasdfghjklzxcvbnm";
		//String s="We promptly judged antique ivory buckles for the next prizE";
		String s="qazwsxedcrfvtgbyhnujmikkasolp";
		s=s.toLowerCase();
		s=s.replace(" ", "").trim();
		char[] cArray=s.toCharArray();
		Set<Character> charSet = conArraySet(cArray);
		System.out.println(charSet.size());
		if(charSet.size()==26) {
			System.out.println("pangram");
		}else {
			System.out.println("not pangram");
		}
		
	}

}
