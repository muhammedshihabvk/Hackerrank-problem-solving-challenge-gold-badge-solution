package com.hackerrank.problemSolving;

public class PalindromIndexMain {
//	static boolean isPalindrome(String s) {
//		 if (s.length()%2==0) {
//	         for (int i = 0; i<(s.length()/2); i++) {
//	             if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
//	                 return false;
//	             }
//	         }
//	         return true;
//	     }
//	     else {
//	         for (int i=0; i<(s.length()/2); i++) {
//	             if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
//	                 return false;
//	             }
//	         }
//	         return true;
//	     }
//}

	//=============================================
//	static boolean isPalindrome(String str) {
//		int n = str.length();
//		int flag = 0;
//		if (n < 100) {
//			System.out.println("1");
//			for (int i = 0; i < n / 2; i++)
//				if (str.charAt(i) != str.charAt(n - i - 1))
//					return false;
//			return true;
//		} else {
//			System.out.println("2");
//			for (int i = 0; i < n / 2; i += 2) {
//				if (str.charAt(i) != str.charAt(n - i - 1))
//					flag = 1;
//			}
//
//			if (flag == 0) {
//				System.out.println("3");
//				for (int i = 1; i < n / 2; i += 2)
//					if (str.charAt(i) != str.charAt(n - i - 1))
//						return false;
//			}
//			return true;
//		}
//
//	}
	//==========================================
	static boolean isPalindrome(String str) {
		int n = str.length();
		for (int i = 0; i < n / 2; i++)
			if (str.charAt(i) != str.charAt(n - i - 1))
				return false;
		return true;
		
	}

	public static void main(String[] args) {
		String s = "bsyhvwfuesumsehmytqioswvpcbxyolapfywdxeacyuruybhbwxjmrrmjxwbhbyuruycaexdwyfpaloyxbcpwsoiqtymhesmuseufwvhysb";
		if (isPalindrome(s)) {
			System.out.println(-1);
		} else {
			char[] cArray = s.toCharArray();

			for (int i = 0; i < s.length(); i++) {
				cArray[i] = ' ';
				String strNew = String.valueOf(cArray).replaceAll("\\s", "");
				if (isPalindrome(strNew)) {
//					System.out.println(cArray[i]);
//					System.out.println(strNew);
					System.out.println(i);
				}
				cArray = s.toCharArray();
			}

		}
	}

}
