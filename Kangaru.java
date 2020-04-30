package com.hackerrank.problemSolving;

public class Kangaru {
	public static void main(String[] args) {
		int x1=0,x2=4,v1=0,v2=2;
		int tempx1=x1,tempx2=x2;
		 boolean flag=false;
	        for(int i=0;i<10000;i++){
	        	tempx1=tempx1+v1;
	        	tempx2=tempx2+v2;
	        	if(tempx1==tempx2) {
	        		flag=true;
	        		//return "YES";
	        		
	        	}
	        }
	        if(flag==false) {
	        	System.out.println("no");
	        	//return "NO";
	        }else {
	        	System.out.println("no");
	        	//return "NO";
	        }
	}

}
