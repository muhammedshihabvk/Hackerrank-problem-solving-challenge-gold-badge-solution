package com.hackerrank.problemSolving;

public class JumbingOnCloud {
	public static void main(String[] args) {
		int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
//		for (int i = 0; i < c.length; i++) {
//			System.out.println(i+"-->"+c[i]);
//		}
		int k=3;
		int i=0;
		int e=100;
		for ( i = 0; i < c.length; i+=k) {
			System.out.println(c[i]+"-->"+i);
			if(c[i]==1) {
				e-=3;
			}else {
				e-=1;
			}
		}
		if(c[0]==1) {
			e-=3;
			System.out.println("last 1");
		}else {
			e-=1;
			System.out.println("last 0");
		}
		System.out.println(i);
		System.out.println(e);
	}

}
