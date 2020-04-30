package com.hackerrank.problemSolving;

public class DrawingBook {
	public static void main(String[] args) {
		int n=6,p=2;
		//int front=0,back=0;
		int oddCount=0,evenCount=0;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.print("{left:"+i+"}");
			}else {
				System.out.print	("{right:"+i+"}");
			}
		}
		System.out.println("");
		for(int i=0;i<n;i++) {
			System.out.print(i+":");
			//front+=1;
			if(i>=p) {
				break;
			}
			if(i%2==1) {
				oddCount+=1;
			}

		}
		System.out.println("");
		for(int i=n;i>=0;i--) {
			System.out.print(i+":");
			//back+=1;
			if(i==p) {
				break;
			}
			if(i%2==0) {
				evenCount+=1;
			}
		}
		System.out.println("");
		System.out.println("front:  "+oddCount);
		System.out.println("back:  "+evenCount);
		if(oddCount<evenCount) {
			System.out.println(oddCount);
			//return oddCount;
		}else {
			System.out.println(evenCount);
			//return evenCount;
		}
		System.out.println("============simple trick==================");
		int x=0;
		int x1=p;
		x=p/2;
		x1=(n/2)-x;
		System.out.println("f:  "+x);
		System.out.println("b:"+x1);
		if(x<x1) {
            System.out.println(x);
            //return x;
        }else {
            System.out.println(x1);
            //return x1;
        }
			
	}
}
