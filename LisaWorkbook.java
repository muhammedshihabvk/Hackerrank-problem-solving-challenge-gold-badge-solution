package com.hackerrank.problemSolving;

import java.util.Random;

public class LisaWorkbook {
	public static void main(String[] args) {
		int k=3;
		int[] arr= {4, 2 ,6 ,1 ,10};
		int pageCount=0;
		int prePage=0,postPage=0;
		int page=0,temp=0,temp1=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%k==0) {
				page+=arr[i]/k;
				pageCount+=page;
				prePage=postPage;
				postPage=pageCount;
				System.out.println(arr[i]+"-->page:"+page+" pageCount:"+ pageCount);
				System.out.println(prePage+"  "+postPage);
				if(arr[i]>prePage && arr[i]<=postPage ) {
					System.out.println("inside");
				}
				page=0;
			}else {
				temp=arr[i]/k;
				page+=temp+1;
				pageCount+=page;
				prePage=postPage;
				postPage=pageCount;
				System.out.println(arr[i]+"-->page:"+page+" pageCOunt:"+ pageCount);
				System.out.println(prePage+"  "+postPage);
				if(arr[i]>=prePage && arr[i]<=postPage ) {
					System.out.println("inside");
				}
				page=0;
			}
		}
		
		
	}

}
