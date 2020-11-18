package com.san.java.level1;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) {
		String s = "abdef";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		}
}
