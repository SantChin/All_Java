package com.san.java.level1;


/*
 * Example of fibonacci series in java -
0 1 1 2 3 5 8 13 21 34 55 89.

First number of series is 0 & second number of series is 1.
So, logic behind the series generation is that the subsequent number generated is sum of previous two number of series.

Example of fibonacci series in java -
First number of series is 0 & second number of series is 1.
So, third number will be 0+1=1
So, fourth number will be 1+1=2
So, fifth number will be 2+1=3 and so on…


Logic of fibonacci series in java ->
temp will be sum of previous two number of series(first and second)
than make first equal to second.
and then make second equal to temp. [now first and second are last two number of series]
 
 * */

public class FibonacciSeries {

	public static void main(String[] args) {

		int first = 0;
		int second = 1;
		System.out.print(first + " " + second);
		int temp = 0;
		while (temp < 100) {
			temp = first + second;
			System.out.print(" " + temp);
			first = second;
			second = temp;
		}
	}
}
