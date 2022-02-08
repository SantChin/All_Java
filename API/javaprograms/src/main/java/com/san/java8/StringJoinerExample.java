package com.san.java8;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		
		String input = "Hello How are you";
		String[] inputArr = input.split(" ");
		StringJoiner joiner = new StringJoiner("-", "[", "]");
		for(String s : inputArr) {
			joiner.add(s);
		}
		
		System.out.println(joiner.toString());
		
		List<String> asList = Arrays.asList("Hello","How","What","Why");
		String stringval = asList.stream().collect(Collectors.joining("-"));
		System.out.println(stringval);
		
		
		
				
	}
}
