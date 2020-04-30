package com.hackerrank.problemSolving;

public class TheTimeInWords {
	public static  String numberToWord(int n) {
		if(n==1) {
            return "one";
        }else if(n==2) {
            return "two";
        }else if(n==3) {
            return "three";
        }else if(n==4) {
            return "four";
        }else if(n==5) {
            return "five";
        }else if(n==6) {
            return "six";
        }else if(n==7) {
            return "seven";
        }else if(n==8) {
            return "eight";
        }else if(n==9) {
            return "nine";
        }else if(n==10) {
            return "ten";
        }else if(n==11) {
            return "eleven";
        }else if(n==12) {
            return "twelve";
        }else if(n==13) {
            return "thirteen";
        }else if(n==0) {
            return "zero";
        }else if(n==29) {
            return "twenty nine";
        }else if(n==15) {
            return "quarter";
        }else if(n==30) {
            return "half";
        }else if(n==45) {
            return "quarter";
        }else if(n==28) {
            return "twenty eight";
        }else if(n==20) {
            return "twenty";
        }else if(n==25){
            return "twenty five";
        }else {
            return "";
        } 	
	}
	public static void main(String[] args) {
		int h=7,m=29;
		if(m==0) {
            System.out.println(numberToWord(h)+" o' clock");
            //return numberToWord(h)+" o' clock";
        }else if(m==1){
            //return numberToWord(m)+" minute past "+numberToWord(h);
        }else if(m==15) {
            System.out.println(numberToWord(m)+" past "+numberToWord(h));
            //return numberToWord(m)+" past "+numberToWord(h);
        }else if(m==30) {
            System.out.println(numberToWord(h)+" past "+numberToWord(h));
            //return numberToWord(m)+" past "+numberToWord(h);
        }else if(m<30) {
            System.out.println(numberToWord(m)+" minutes past "+numberToWord(h));
            //return numberToWord(m)+" minutes past "+numberToWord(h);
        }else if(m==45) {
            System.out.println(numberToWord(m)+" to "+numberToWord(h+1));
            //return numberToWord(m)+" to "+numberToWord(h+1);
        }else if(m>30) {
            int bal=60-m;
            System.out.println(numberToWord(bal)+" minutes to "+numberToWord(h+1));
            //return numberToWord(bal)+" minutes to "+numberToWord(h+1);
        }else{
            //return " ";
        }

	}

}
