package com.hackerrank.problemSolving;

public class CaesarCipher {
	static String cipher;
	public static char cipherIndex(int c ) {
		return cipher.charAt(c);
	}
	public static void main(String[] args) {
		
		int k=98;
		String alphaLetter = "abcdefghijklmnopqrstuvwxyz";
		if(k>26) {
			k=k%26;
			System.out.println(k);
		}
		cipher=alphaLetter.substring(k)+alphaLetter.substring(0,k);
		System.out.println(cipher);
		System.out.println(alphaLetter);
		char temp1,temp2;
		String s="159357lcfd";
		String op="159357fwzx";
		System.out.println("Plain text: "+s);
		String result="";
		char[] cArray=s.toCharArray();
		for (char c : cArray) {
			if(Character.isAlphabetic(c)) {
				if(Character.isUpperCase(c)) {
					temp2=Character.toLowerCase(c);
					//System.out.println(temp2);
					temp1=Character.toUpperCase(cipherIndex(alphaLetter.indexOf(temp2)));
					result+=temp1;
					//System.out.print(temp1+" ");
				}else {
					result+=cipherIndex(alphaLetter.indexOf(c));
					//System.out.print(cipherIndex(alphaLetter.indexOf(c))+" ");
				}
			}else {
				result+=Character.valueOf(c);
				continue;
			}
			
		}
		System.out.println("Cipher: "+result);
		System.out.println(s);
		System.out.println(result);
		System.out.println(op);
		
	}
}
