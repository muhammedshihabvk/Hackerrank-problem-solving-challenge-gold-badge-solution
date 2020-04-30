package com.hackerrank.problemSolving;

public class ChocolateFeast {
	public static void main(String[] args) {
		int n,c,m;
		n=6;c=2    ;m=2;//  429
		n=13112;c= 944;m= 6735;
		//=======================
		int totalCandy=0;
		int candy=n/c;
		if(candy%m==0) {
			candy+=1;
			System.out.println(candy+" check post 1");
		}else if(candy<m) {
			System.out.println(candy+" check post 2");
		}else {
			totalCandy=candy;
			int temp3=0;
			int temp2=0;
			while(candy>=m) {
				if(candy%m==0) {
					System.out.println(candy);
					totalCandy+=candy/m;
					break;
				}else {
					temp2=candy%m;
					totalCandy+=(candy-(temp2))/m;
					temp3=(candy-(temp2))/m;
					candy=temp3+temp2;
					System.out.println(candy);
				}
			}
			System.out.println(totalCandy+" check post 3");			
		}
		
	}

}
