package com.hackerrank.problemSolving;

public class MarsExploration {
	public static void main(String[] args) {
		// String s ="SOSSPSSQSSOR";
		String s = "SOSSPSSQSSOR";
		int result = 0;
		char[] temp = new char[3];
		char[] cArray = s.toCharArray();
		for (int i = 0; i < cArray.length; i += 3) {
			if (s.substring(i, i + 3).equals("SOS")) {
				
			} else {
				if (s.substring(i, i + 3).equals("OSO")) {
					result += 3;
				} else {
					temp = s.substring(i, i + 3).toCharArray();
					for (int j = 0; j < temp.length; j++) {
						if(temp[j]!='S' && j==0) {
							System.out.println("contineu"+result);
							result+=1;
						}
						if(temp[j]!='S' && j==2) {
							System.out.println("contineu"+result);
							result+=1;
						}
						if(temp[j]!='O' && j==1) {
							result+=1;
						}
					}

				}

			}
		}
		System.out.println(result);
	}
}
