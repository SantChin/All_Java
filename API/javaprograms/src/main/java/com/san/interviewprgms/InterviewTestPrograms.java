package com.san.interviewprgms;

//Can we access a static method of a class through null reference? If Yes how  and if No why 

//Yes..because static members belongs to the class rather than instance
//And we should avoid such type of coding as it is misleading

public class InterviewTestPrograms {

	public static void hello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		InterviewTestPrograms test = null;
		test.hello();

		
	}
}
