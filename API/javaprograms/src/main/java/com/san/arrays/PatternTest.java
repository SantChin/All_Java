package com.san.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

	
	public static void main(String[] args) {
		
		//String regularExpression ="^\\/[^/]+\\/([^/]+)\\/";
		String regularExpression ="([a-zA-Z]:)?(\\\\[a-zA-Z0-9._-]+)+\\\\?";
		
		
		List<String> values = new ArrayList<String>();
		values.add("/Box/Finance - US/");
		values.add("/sites/finance/shared documents/Departments/All Sales team library");
		values.add("Hello World");
		values.add("/users/blawrence/sites/finance/shared documents/Global finance team library/");
		
		
	
		
		
		for(String s : values) {
			
			Pattern p = Pattern.compile(regularExpression);
			Matcher m = p.matcher(s);
			if(m.matches() || m.find()){
				System.out.println(s);
			}
		}
		
	}
}
