package com.hackerrank.problemSolving;

public class PdfDesigner {
	public static void main(String[] args) {
		int[] h= {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
		String word ="zaba";
		
		int size=0;
		int wordIndex;
        int largeSpace=0;
        size = word.length();
        char[] wordChar = word.toCharArray();
        String alphindex = "abcdefghijklmnopqrstuvwxyz";
        //char[] alphabet = alphindex.toCharArray();
        System.out.println(size);
        for(int i=0;i<(word.length()-1);i++){
        	wordIndex=alphindex.indexOf(wordChar[i]);
        	if(h[wordIndex]>largeSpace) {
        		largeSpace=h[wordIndex];
        	}
        }
        System.out.println(largeSpace);
        System.out.println(size);
        System.out.println(largeSpace*(size));
        
	
	}

}
