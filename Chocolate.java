package com.hackerrank.problemSolving;

import java.util.ArrayList;
import java.util.List;

public class Chocolate {
	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		int d=3,m=2;
		//-------------------------
//		List<Integer> s = new ArrayList<Integer>();
//		s.add(4);
//		s.add(1);
//		int d=4,m=1;
		//d-->sumRes;
        //m-->count;
		int occ=0;
        int sum=0;
        for(int i=0;i<=s.size()-m;i++){
            sum=0;
            for(int j=i;j<i+m;j++){
                sum=sum+s.get(j);       
            }
            System.out.println(sum);
            if(sum==d){
                occ+=1;
            }
        }
        System.out.println(occ+":  res");
        //return occ;
	}

}
