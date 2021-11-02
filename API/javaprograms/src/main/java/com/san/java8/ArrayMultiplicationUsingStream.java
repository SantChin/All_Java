package com.san.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayMultiplicationUsingStream {

	public static void main(String[] args) {

		Integer[] arrayInput = { 1, 6, 5, 8, 9 };
		List<Integer> integerList = Arrays.asList(arrayInput);

		Optional<Integer> output = integerList.stream().reduce((a, b) -> a * b);
		if (output.isPresent()) {
			System.out.println("Multiplied values using java8 streams : " + output.get());
		} else {
			System.out.println("Empty List/Array");
		}

		// Using for each
		int outval = 1;
		for (Integer num : integerList) {
			outval = outval * num;
		}
		
		if (outval>1) {
			System.out.println("Multiplied values using java8 streams : " + outval);
		} else {
			System.out.println("Empty List/Array");
		}

	}

}
