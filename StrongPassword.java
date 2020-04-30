package com.hackerrank.problemSolving;


public class StrongPassword {
	public static void main(String[] args) {
		//String password="#HackerRank";
		String password="E!%Z@";
		int result=0;
		boolean flg=true;
		int flag=0;
		
		char[] cArray=password.toCharArray();
		if(password.length()<6) {
			//System.out.println(6-password.length());
			flg=false;
			flag=6-password.length();
			System.out.println(flag);
		}else {
			System.out.println(flg+" 1");
			boolean digitFlag=false;
			if(flg==true) {
				for (int i = 0; i < cArray.length && digitFlag==false ; i++) {
					if(Character.isDigit(cArray[i])) {
						digitFlag=true;
					}
				}
				if(digitFlag==false) {
					result++;
					flg=false;
				}
			}
			System.out.println(flg+" 2");
			boolean upflg=false;
			//if(flg==true) {
				for (int i = 0; i < cArray.length && upflg==false; i++) {
					if(Character.isUpperCase(cArray[i])) {
						upflg=true;
					}
				}
				if (upflg==false) {
					result++;
					flg=false;
				}
			//}
			System.out.println(flg+" 3");
			boolean lowflg=false;
			//if(flg==true) {
				for (int i = 0; i < cArray.length && lowflg==false; i++) {
					if(Character.isLowerCase(cArray[i])) {
						lowflg=true;
					}
				}
				if (lowflg==false) {
					result++;
					flg=false;
				}
			//}
			System.out.println(flg+" 4");
			boolean symbolFlag=false;
			//if(flg==true) {
				if(password.contains("!") | password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-") || password.contains("+")) {
					symbolFlag=true;
				}
				if (symbolFlag!=true) {
					result++;
					flg=false;
				}
			//}
			System.out.println(flg+" 5");
		}
		System.out.println(result);
		
	}

}
