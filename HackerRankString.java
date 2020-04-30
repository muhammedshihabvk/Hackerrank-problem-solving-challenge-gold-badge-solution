package com.hackerrank.problemSolving;

public class HackerRankString {
	public static void main(String[] args) {
		String s ="hereiamstackerrasnkaaa";
		char[] sChar=s.toCharArray();
		int sCounter=0;
		char[] hackerRank= {'h','a','c','k','e','r','r','a','n','k'};
		
		System.out.println(hackerRank.length);
		for (int i = 0; i < sChar.length; i++) {
			if(sChar[i]==hackerRank[sCounter]) {
				System.out.println(i+"-->"+sChar[i]);
				sCounter++;
				if(sCounter>=hackerRank.length) {
					System.out.println("break "+i);
					break;
				}
			}
		}
		if(sCounter>=hackerRank.length) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}
