package com.hackerrank.problemSolving;

public class ElectronicShop {
	public static void main(String[] args) {
		int b=10;
		int[] keyboards = {3};
		int[] drives = {5, 2, 8};
		int exp,temp=0;
		 for(int i=0;i<keyboards.length;i++){
             for(int j=0;j<drives.length;j++){
                 if((keyboards[i]+drives[j])<=b) {
                	 exp=keyboards[i]+drives[j];
                	 System.out.println("expence"+exp);
                	 if(temp<=exp) {
                		 temp=exp;
                	 }
                 }
             }
         }
		 if(temp==0) {
			 System.out.println(-1);
		 }else {
			 System.out.println(temp);
		 }
		
	}

}
