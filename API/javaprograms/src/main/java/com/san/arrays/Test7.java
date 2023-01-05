package com.san.arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Test7 {

	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<String>();
		
		set.add("Hello");
		set.add("Hi");
		set.add("Hi");
		set.add("Hello");
		set.add("Hello");
		set.add("World");
		
		//System.out.println(set);
		
		for(String s : set) {
			//System.out.println(s);
		}
		
		//String name = "INNER BOXNOTE.docx";
		
		//String changeExtension = changeExtension(name,"");
		//System.out.println(changeExtension);
		//replaceExtension(name);
		
		//String text = "SUM([1]Sheet1!$E$6,[1]Sheet1!$E$7)";
		//replaceTextValues(text);
		
		String test5 = "/Users/Santosh/Box/Finance - US/CFO/Budgeting/GSIH Budgets/2020/2020 Top-Down Budget.xlsx";
		test5 = test5.replace("%20"," ");
		System.out.println(test5);
		String destFolderName = "Global Finance Team Library";
		
		replaceAString(test5);
	}
	

	
	public static void replaceAString(String value) {
		String destFolderName = "Global Finance Team Library";
		Set<String> keySet = new HashSet<String>();
		// [^/users/.*/box/.*$, ^/users/box/.*$, ^/box/.*$]
		keySet.add("^/users/.*/box/.*$");
		keySet.add("^/users/box/.*$");
		keySet.add("^/box/.*$");
		for (String keyValue : keySet) {
			Pattern compile = Pattern.compile(keyValue.toLowerCase());
			if (compile.matcher(value.toLowerCase()).matches()) {
				String _keyValue = keyValue.replace(".*$", "");
				value = value.replaceAll("(?i)" + _keyValue, "/sites/Santosh2/Shared Documents/");
				if(!value.contains(destFolderName)) {
					value = value.replaceAll("/sites/Santosh2/Shared Documents/", "/sites/Santosh2/Shared Documents/"+destFolderName+"/");
				}
				System.out.println(value);
			}
		}
	}






	private static void replaceTextValues(String text) {
		if(!text.contains("'")) {
			//SUM([1]Sheet1!$E$6,[1]Sheet1!$E$7)
			System.out.println(text);
			text = text.replace("[", "'[");
			text = text.replace("!","'!");
			System.out.println(text);
		}
		
		
	}

	public static void replaceExtension(String name) {
//		name.la
//		String  ext = getFileExtension(name);
//		System.out.println(ext);
	}
	
	private static String getFileExtension(String fileName){
		int dot = fileName.lastIndexOf(".");
		if(dot != -1){
			return fileName.substring(dot + 1);	
		}else{
			return null;
		}
	}
	
	public static String changeExtension(String name) {
		  int i = name.lastIndexOf('.');
		  String _name = name.substring(0,i);
		  _name =  _name + ".boxnote";
		  return _name;
	}
	
}
