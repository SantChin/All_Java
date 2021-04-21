package com.san.java.level1;

public class ChangeStringCharactersCase {

	public static void main(String[] args) {
		
		
		String inputString = "SanTosh";
		char[] ar = inputString.toCharArray();
		for(int i = 0;i<ar.length;i++) {
			if(ar[i]>=65 && ar[i]<=90)
				ar[i]+=32;
			else if(ar[i]>=97 && ar[i]<=122)
				ar[i]-=32;
		}
		System.out.println(String.valueOf(ar));
	}
}
