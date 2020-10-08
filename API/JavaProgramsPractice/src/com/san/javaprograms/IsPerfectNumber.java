package com.san.javaprograms;

/*
 * A perfect number is a positive integer that is equal to the sum
of its proper positive divisors, that is, the sum of its positive
divisors excluding the number itself. Equivalently, a perfect number
is a number that is half the sum of all of its positive divisors.
The first perfect number is 6, because 1, 2 and 3 are its proper
positive divisors, and 1 + 2 + 3 = 6. Equivalently, the number 6
is equal to half the sum of all its positive divisors:
		( 1 + 2 + 3 + 6 ) / 2 = 6.
 * */

public class IsPerfectNumber {

	public void perfectOrNot(int number) {

		int sum = 0;
		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				sum += i;
			}

		}

		if (sum == number) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a Perfect Number");
		}

	}

	public static void main(String[] args) {
		IsPerfectNumber pn = new IsPerfectNumber();
		pn.perfectOrNot(7);
	}

}
