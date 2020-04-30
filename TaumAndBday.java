package com.hackerrank.problemSolving;

public class TaumAndBday {
	public static void main(String[] args) {
		//changed the function input parameters name b-->c ,w-->x, bc-->bce, wc-->wce, z-->ze
		int c=443463982;
		int x=833847400;
		int bce=429734889;
		int wce=628664883;
		int ze=610875522;
		
		long res=0L;
		long b=(long)c;
        long w=(long)x;
        long bc=(long)bce;
        long wc=(long)wce;
        long z=(long)ze;
		res=(b*bc)+(w*wc);
		long tmpRes=0L;
		if((bc+z)<wc) {
				tmpRes=(b+w)*bc+w*z;
				if(tmpRes<res) {
					System.out.println("1"+tmpRes);
				}else {
					System.out.println("2"+res);
				}
		}else if(wc+z<bc) {
				tmpRes=(b+w)*wc+b*z;
				if(tmpRes<res) {
					System.out.println("3 "+tmpRes);
				}else {
					System.out.println("4 "+res);
				}
		}else {
			System.out.println("5:"+(long)res);
		}
		
		
		
	}

}
