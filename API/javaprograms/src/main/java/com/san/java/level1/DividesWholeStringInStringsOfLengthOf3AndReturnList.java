package com.san.java.level1;

import java.util.ArrayList;
import java.util.List;

public class DividesWholeStringInStringsOfLengthOf3AndReturnList {

	public static void main(String[] args) {
		
		//String s = "abcdefghi";
		 String s = "abcdefgh"; //Test String
        //String s = "abcdefghij"; //Test String
		
		int n = 3;
		List<String> l = new ArrayList<String>();
		char[] ch = s.toCharArray();
		int cnt = 0;
		String temp = "";
		for(int i=0;i<ch.length;i++) {
			
			if(cnt<n) {
				temp += String.valueOf(ch[i]);
				cnt++;
			}
			
			if(cnt == n || i == ch.length -1) {
				l.add(temp);
				cnt=0;
				temp="";
			}
		}
		
		for(String s2 : l) {
			System.out.println(s2);
		}
	}
}
