package com.san.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamOnString {

	// Using streams find the vowels count. and duplicates in the string.
	public static void main(String[] args) {

		String input = "Hello Hello";
		long count = input.trim().chars().filter((x)->{
			return (x == 'a' ||x == 'e' ||x == 'i' ||x == 'o' ||x == 'u' );
		}).count();
		
		System.out.println(count);
		
		//Duplicates
		Map<String, Long> mapObj = input.trim().chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
		mapObj.forEach((k,v)->System.out.println(k+"-->"+v));
		
	}
}
