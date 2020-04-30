package com.hackerrank.problemSolving;

public class Valleys {
	public static void main(String[] args) {
		//String s = "UUUDDD"; 
		String s = "UUDDU"; 
		char arr[]=s.toCharArray();
        int count=0;
        int level=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='U'){
                ++level;
                System.out.println(arr[i]+" "+level);
            }
            if(arr[i]=='D'){
                level-- ;
                System.out.println(arr[i]+" "+level);
            }
            if(level==0 && arr[i]=='U'){
                count++;
                System.out.println("inner count:  "+count);
            }
      
        }
        System.out.println(count);
        //return count;
        
	}

}
