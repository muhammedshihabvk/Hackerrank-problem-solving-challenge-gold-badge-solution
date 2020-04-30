package com.hackerrank.problemSolving;

public class ChocoFeast2 {
	public static void main(String[] args) {
		int n,c,m;
		n=2814;
		c=27;
		m=1983; //Answer:104

		int totalCandy=0;
		int temp2=0;
		int candy=n/c;
		if(candy%m==0) {
			candy+=1;
			System.out.println(candy+" check post 1");
		}else if(candy<m) {
			System.out.println(candy+" check post 2");
		}else {
			totalCandy=candy;
			while(candy>=m) {
				temp2=candy/m;
				candy=(candy/m)+(candy%m);
			}
			System.out.println(totalCandy+" check post 3");			
		}
	}

}
