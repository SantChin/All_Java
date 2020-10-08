package com.san.javaprograms;

/*Write a program to reverse a number using numeric operations. 
 * Below example shows how to reverse a number using numeric operations.*/

public class RverseNumber {

	int revNumber = 0;

	public int reveseNumber(int number) {

		while (number != 0) {
			revNumber = (revNumber * 10) + (number % 10);
			number = number / 10;
		}
		return revNumber;
	}

	public static void main(String[] args) {

		int number = 1783;
		RverseNumber rn = new RverseNumber();
		System.out.println("RverseNumber : "+rn.reveseNumber(number));
		
		
	}

}
