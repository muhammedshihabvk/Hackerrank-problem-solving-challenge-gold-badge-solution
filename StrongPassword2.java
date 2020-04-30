package com.hackerrank.problemSolving;


public class StrongPassword2 {
	public static void main(String[] args) {
		// String password="#HackerRank";
		String password = "+xAu";
		int result = 0;
		boolean flg = true;
		int flag = 0;
		char[] cArray = password.toCharArray();
		System.out.println("~~~~~~~~~~~~~~~~~~~1~~~~~~~~~~~~~~~~~~~");
		boolean digitFlag = false;
		if (flg == true) {
			for (int i = 0; i < cArray.length && digitFlag == false; i++) {
				if (Character.isDigit(cArray[i])) {
					digitFlag = true;
				}
			}
			if (digitFlag == false) {
				result++;
				flg = false;
			}
		}
		System.out.println(digitFlag);
		System.out.println("~~~~~~~~~~~~~~~~~~~2~~~~~~~~~~~~~~~~~~~");
		boolean upflg = false;
		for (int i = 0; i < cArray.length && upflg == false; i++) {
			if (Character.isUpperCase(cArray[i])) {
				upflg = true;
			}
		}
		if (upflg == false) {
			result++;
			flg = false;
		}
		System.out.println(upflg);
		System.out.println("~~~~~~~~~~~~~~~~~~~3~~~~~~~~~~~~~~~~~~~");
		boolean lowflg = false;
		for (int i = 0; i < cArray.length && lowflg == false; i++) {
			if (Character.isLowerCase(cArray[i])) {
				lowflg = true;
			}
		}
		if (lowflg == false) {
			result++;
			flg = false;
		}
		System.out.println(lowflg);
		System.out.println("~~~~~~~~~~~~~~~~~~~4~~~~~~~~~~~~~~~~~~~");
		boolean symbolFlag = false;
		if (password.contains("!") | password.contains("@") || password.contains("#") || password.contains("$")
				|| password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*")
				|| password.contains("(") || password.contains(")") || password.contains("-")
				|| password.contains("+")) {
			symbolFlag = true;
		}
		if (symbolFlag != true) {
			result++;
			flg = false;
		}
		System.out.println(symbolFlag);
		System.out.println("test result:"+result);
		if (password.length() < 6) {
			if(password.length()<=4 && result==1) {
				flag = 6 - password.length();
				System.out.println(flag);
			}
			if(result<=3 && result>0 && password.length()>=4 ) {
				System.out.println("result less: "+result);
			}else {
				flg = false;
				flag = 6 - password.length();
				System.out.println(flag);
			}
			
		}else {
			System.out.println("result fine : "+result);
		}
		

	}
}
