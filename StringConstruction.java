package com.hackerrank.problemSolving;

import java.util.HashSet;
import java.util.Set;

public class StringConstruction {
	public static void main(String[] args) {
		String s="bccb";
        Set<String> snSet = new HashSet<String>();
        char[] cArray=s.toCharArray();
        for (char c : cArray) {
            if(snSet.contains(String.valueOf(c))) {
                continue;
            }else {
                snSet.add(String.valueOf(c));
            }
        }
        System.out.println(snSet.size());
	}

}
