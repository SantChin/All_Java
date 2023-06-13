package com.san.xmlparsing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSetNullValueTest {

	public static void main(String[] args) {
		
		Set<String> colList = new HashSet<String>();
		
		//List<String> colList = new ArrayList<String>();
		
		colList.add("ABC");
		colList.add(null);
		colList.add("DEF");
		colList.add("ABC");
		colList.add("DEF");
		colList.add(null);
		
		
		System.out.println(colList.size());
		
		
		for(String s : colList) {
			System.out.println(s);
		}
		
	}
}
