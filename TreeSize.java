package com.hackerrank.problemSolving;

public class TreeSize {
	public static void main(String[] args) {
		int n=10;
		int h=0;
        for(int i=0;i<=n;i++) {
            if(i%2==0) {
                h=h+1;
                System.out.println(i+"-->  ("+i+"%2)="+(i%2)+"---->"+"  "+h);
            }else {
                h=h*2;
                System.out.println(i+"-->  ("+i+"%2)="+(i%2)+"---->"+"  "+h);
            }
        }
        //return h;
	}

}
