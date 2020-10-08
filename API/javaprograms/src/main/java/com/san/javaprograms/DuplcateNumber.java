package com.san.javaprograms;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * You have got a range of numbers between 1 to N, where one of the number is
repeated. You need to write a program to find out the duplicate number.
 * 
 * */

public class DuplcateNumber {

	public int findDuplicate(List<Integer> numbers) {
			int highestNumber = numbers.size()-1;
			System.out.println("highestNumber::"+highestNumber);
			System.out.println((highestNumber+1)/2);
			int total = getSum(numbers);
			System.out.println("Total : " + total);
			System.out.println((highestNumber * (highestNumber+1)/2));
			int duplicate = total - (highestNumber * (highestNumber+1)/2);
		return duplicate;

	}

	public int getSum(List<Integer> numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}

		return sum;
	}

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		DuplcateNumber dn =  new DuplcateNumber();
		for (int i = 1; i <= 6; i++) {
			al.add(i);
		}

		al.add(4);
		
		System.out.println("Duplicated Number  : " + dn.findDuplicate(al));
	}

}
