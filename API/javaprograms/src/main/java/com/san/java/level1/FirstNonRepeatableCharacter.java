package com.san.java.level1;

public class FirstNonRepeatableCharacter {
	
	public static void main(String[] args) {
		
		String s= "zzzzzbbbccccddehhhhiii";
		//String s = "aabcdeefggi";
		char ch[] = s.toCharArray();
		
		char currentCh = ch[0];
		int currentChCount = 1;
		for(int i=1;i<ch.length;i++) {
			
			if(currentCh == ch[i]) {
				currentChCount++;
			}
			
			else if(currentChCount == 1) {
				
				System.out.println("NonRepeatableCharacter = "+currentCh);
				currentCh = ch[i];
				currentChCount = 1;
			}else {
				currentCh = ch[i];
				currentChCount = 1;
			}
		}
		
		if(currentChCount == 1) {
			
			System.out.println("NonRepeatableCharacter = "+currentCh);
		}
	}
	
}
