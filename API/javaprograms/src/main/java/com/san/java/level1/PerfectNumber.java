package com.san.java.level1;


/* Perfect number is a positive integer that is equal to the sum of its positive divisors excluding the number itself.*/
public class PerfectNumber {

	public static void main(String[] args) {
		
		int n =28;
		
		int sumofdivisors = 1;
		
		for (int i=2;i<=n/2;i++)
		{
			if(n%i ==0 )
				sumofdivisors+=i;
	
		}
		
		if(sumofdivisors == n)
			System.out.println("A Perfect Number");
		else
			System.out.println("Not A Perfect Number");
	}
	
	
}
