package com.san.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {

	public static void main(String[] args) {

		String arrayInput[] = { "amit", "ajay", "viay", "amit", "zade" };
		List<String> arrList = Arrays.asList(arrayInput);
		
		Stream<String> inputstream = arrList.stream();
		inputstream.forEach(val -> System.out.println(val));
		
		// long count = inputstream.filter(x->x.equals("amit")).count();
		// System.out.println(count);
		 
		 
		 //Using supplier to use
		System.out.println("-----------------------------------------------------------------");
		 Supplier<Stream<String>> suppliInputStream= ()->Stream.of(arrayInput);
		 
		 suppliInputStream.get().forEach(val -> System.out.println(val));
			
		 long countval = suppliInputStream.get().filter(x->x.equals("amit")).count();
		 System.out.println(countval);
		 
	}
}
