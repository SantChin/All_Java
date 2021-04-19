package com.san.java.level1;

public class PalindromeTill {

	public static void main(String[] args) {
		
		
		int cnt =0;
		for(int i=10;i<1000;i++) {
			
			char[] ch = String.valueOf(i).toCharArray();
			boolean isPalindorme =true;
			for(int j=0;j<ch.length/2;j++) {
				if(ch[j]!=ch[ch.length-1-j]) {
					isPalindorme =false;
					break;
				}
			}
			
			if(isPalindorme) {
				cnt++;
				System.out.println(i);
				}
		}
		
	System.out.println(cnt);
	}
}
