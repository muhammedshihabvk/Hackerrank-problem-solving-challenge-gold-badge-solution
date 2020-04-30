package com.hackerrank.problemSolving;

public class HalloweenSale {
	public static void main(String[] args) {
		int p=100,d=19,m=1,s=180;
		int sum=0,count=0;
		if(p>s) {
			System.out.println(0+"========");
			//return 0;
		}
		do {
			
			System.out.println(p);
			count+=1;
			sum+=p;
			p=p-d;
			if(sum>=s) {
				sum-=m;
				count-=1;
				break;
			}
			
		} while (p>=m && (sum+(p-d))<s);
		while(sum<=s && (sum+(p-d))<s ) {
			count+=1;
			sum+=m;
			if(sum>=s) {
				sum-=m;
				count-=1;
				break;
			}
		}
		System.out.println("========================");
		System.out.println(sum);
		System.out.println(count);
			
	}

}
