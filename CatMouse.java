package com.hackerrank.problemSolving;

public class CatMouse {
	public static void main(String[] args) {		
		int x=93,y=49,z=20;
		int temp1=0,temp2=0;
		temp1=x-z;
		temp2=y-z;
		if(temp1<0) {
			temp1*=-1;
		}
		if(temp2<0) {
			temp2*=-1;
		}
		System.out.println(temp1+"  "+temp2);
		if(temp1==temp2) {
			System.out.println("Mouse C");
		}else if(temp1<temp2) {
			System.out.println("Cat A");
		}else {
			System.out.println("Cat B");
		}
		
	}

}
