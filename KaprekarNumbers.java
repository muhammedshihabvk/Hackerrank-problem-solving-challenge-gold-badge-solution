package com.hackerrank.problemSolving;

public class KaprekarNumbers {
	public static long kapNumChecker(long x) {
		long equArray, result = 0;
		long square = x * x;
		String[] sArray = new String[2];
		//System.out.println(square);
		String value = String.valueOf(square);
		//System.out.println(value);
		char[] arr = value.toCharArray();
		equArray = arr.length / 2;
		//System.out.println(equArray);
		sArray[0] = value.substring(0,(int) equArray);
		sArray[1] = value.substring((int)equArray);
		//System.out.println(sArray[0] + "=========" + sArray[1]);
		try {
			result = Integer.parseInt(sArray[0]) + Integer.parseInt(sArray[1]);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			result=0;
		}
		
		if(result>0) {
			return result;
		}else {
			return 0;
		}
		
	}

	public static void main(String[] args) {
		long res=0;
		int p=1;
		int count=0;
		System.out.println("================");
		if(p==1) {
			System.out.print(1+" ");
		}
		//System.out.print(1+" ");
		for (long i = 1; i <= 99999; i++) {
			res=kapNumChecker(i);
			if(res>0 && res==i) {
				count++;
				System.out.print(res+" ");
			}
		}
		if(count==0){
            System.out.print("INVALID RANGE");
        }
	}

}
