package com.san.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		
		
		try {
			//testMethod(1,0);
			//testMethod2("ben@filefuze.co.READ.123");
			testMethod3("GDOC");
		}catch(Exception e) {
			System.out.println("Exception thrown"+e);
		}
	}
	
	private static void testMethod3(String name) {
		String objectName = name.lastIndexOf(".") !=-1 ? name.substring(0,name.lastIndexOf(".")) : name;
		System.out.println(objectName);
	}

	private static void testMethod2(String email) {
		
		email = email.substring(0,email.lastIndexOf("."));
		System.out.println(email);
		
		List<String> dataList = new ArrayList<String>();	
		dataList.add("ben@filefuze.co|READ|123");
		dataList.add("max@filefuze.co|READ");
		
		List<String> collect = dataList.stream().map(e->e.substring(0,e.lastIndexOf("|"))).collect(Collectors.toList());
		System.out.println(collect);
	}

	private static void testMethod(int i, int j) {
		try {
			int k = i/j;
			System.out.println(k);
		}catch(Exception e) {
			throw e;
		}finally {
			System.out.println("finally block");
		}
		
	}
}
