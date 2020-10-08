package com.san.designpattern.basicconcepts;

public class Test {

	public static void main(String[] args) {
		
		
		System.out.println("aobj");
		/*
		 * A aobj = new A(); aobj.methodA();
		 */

		System.out.println("bobj");
		B bobj = new B();
		bobj.methodA();
		bobj.methodB();
		
		System.out.println(" A or B?");
		//Superclass oj = new Subclass();
		int x = 10;
		A obj =  new B();  // It has values of B,but props of A
		obj.methodA();
		obj.methodB();
		
		
		
	}

}
