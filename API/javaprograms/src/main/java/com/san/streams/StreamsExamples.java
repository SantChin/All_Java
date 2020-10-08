package com.san.streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamsExamples {

	public static void main(String[] args) {

		int[] nums = { 4, 1, 13, 90, 16, 2, 0 };

		// finding small number

		int min = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min)
				min = nums[i];
		}

		//System.out.println("Min Number is " + min);

		// Using streams

		//OptionalInt min1 = IntStream.of(nums).min();
		//IntStream.of(nums).min().ifPresent(System.out::println);
		
		//Other Functions are
		//IntStream.of(nums).min()
		//IntStream.of(nums).sum()
		//IntStream.of(nums).max()
		//IntStream.of(nums).average()
		//IntStream.of(nums).count()
		
		
//		System.out.println( "Using Streams " );
//		IntStream.of(nums).min().ifPresent(System.out::println);
//		IntStream.of(nums).max().ifPresent(System.out::println);
//		System.out.println(IntStream.of(nums).sum());
//		System.out.println(IntStream.of(nums).average());
//		System.out.println(IntStream.of(nums).count());
		
		
		
		//IntSummaryStatics
		
		// Array of integers find smallest 3 distinct numbers
		
		//Normal
		int [] copy = Arrays.copyOf(nums, nums.length);
		
		Arrays.sort(copy);
		
		//pick first 3
		for(int i=0;i<3;i++) {
			System.out.println(copy[i]);
		}
		

		//Strems
		System.out.println( "Using Streams " );
		//This called method chaining // intenaally creates a copy
		//Three distinct parts are there . 1.create 2.process 3. consume
		IntStream.of(nums) //create
		.distinct()
		.sorted()
		.limit(3)
		.forEach(System.out::println); //consume
	
	
		
		//
	
	}
}
