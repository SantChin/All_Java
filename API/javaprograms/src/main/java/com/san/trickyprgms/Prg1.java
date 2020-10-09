package com.san.trickyprgms;

import java.io.IOException;

class A {

	public void m1() {
		System.out.println("From A m1()");
	}
}

class B extends A {
	public void m1() {
		System.out.println("From B m1()");
	}

	public void m2() {
		System.out.println("From B m2()");
	}
}

//--------------------------------------------------------
class C {
	void m1() throws ArrayIndexOutOfBoundsException {
		System.out.println("In m1 A");
	}
}

class D extends C {
	void m1() throws IndexOutOfBoundsException {
		System.out.println("In m1 B");
	}
}

//------------------------------------------------------------

class E {
	void m1() throws IOException {
		System.out.println("In m1 A");
	}
}

class F extends E {
//	void m1() throws Exception {
	// System.out.println("In m1 B");
//	}
}

public class Prg1 {

	public static void main(String[] args) {
		A a = new B();
		// a.m2();
		// There will be compile-time error. Even though we are assigning B’s object to
		// A’s reference we can call only methods which are in A from A’s reference.

		C c = new D();
		c.m1();
		// In m1 B
		// This will work fine as ArrayIndexOutOfBoundsException and
		// IndexOutOfBoundsException are Runtime exceptions and there is no rule for
		// runtime exceptions while method overriding.

		E e1 = new F();
		try {
			e1.m1();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// B. Compile-time error
		// As IOException and Exception are checked exception, so you can not broaden
		// the scope of Exception while method overriding.
	}

}
