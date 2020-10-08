package com.san.javaprograms;

/*Write a program to reverse a string using recursive methods.
You should not use any string reverse methods to do this.*/

public class StringRecursiveReversal {

	String reverse = "";
	public String reveseString(String str){
		if(str.length() == 1 ){
			return str;
		}else{
			reverse += str.charAt(str.length()-1)
					+reveseString(str.substring(0,str.length()-1));
			return reverse;
		}
		
		
	}
	public static void main(String[] args) {
		String s = "SAN";
		StringRecursiveReversal sr = new StringRecursiveReversal(); 
		System.out.println(sr.reveseString(s));
		
		
		

	}

}
