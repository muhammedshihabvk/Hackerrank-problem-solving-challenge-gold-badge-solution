package com.hackerrank.problemSolving;

public class ValleyNew {
	public static void main(String[] args) {
		//String s="UDDDUDUUD";
		String s="UDDDUUD";
		//int testiLoop=0,testjLoop=1;
		char arr[]=s.toCharArray();
		int uC=0,dC=0,i=0,count=0;
		//Boolean flagUC=false,flagDC=false;
		for(i=0;i<arr.length;i++) {
			System.out.println(i+":"+arr[i]);
			if(arr[i]=='U') {
				uC+=1;
			}
			if(arr[i]=='D') {
//				flagUC=true;
				dC+=1;
			}
			if(uC==dC && arr[i]=='U') {
				count+=1;
			}
		}
		System.out.println("count:  "+count);
	}

}


