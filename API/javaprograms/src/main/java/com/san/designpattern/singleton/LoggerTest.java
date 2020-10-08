package com.san.designpattern.singleton;

public class LoggerTest {

	
	public static void main(String args[]) {
		
		Logger obj1 = Logger.getInstance();
		Logger obj2 = Logger.getInstance();
		Logger obj3 = Logger.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
	}
}
