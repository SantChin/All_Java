package com.san.drunk;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		int input = 5;
		if(input % 2 == 0 ) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		
		//Without Modulus Operator
		
		int quotient = input/2;
		if((quotient * 2) == input) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		
		//Another Approch
		//BitWise Operaotr
		
		// &  1 1 -> 1  // If both are 1 s then only 1
		// |  1 0 -> 1  // If any one is 1 then 1
		// |  0 0 -> 0
		// |  0 1 -> 1 
		

		// int  a = 25 ;   1 1 0 0 1
		// int  b = 15 ;   0 1 1 1 1
		
		//				&  0 1 0 0 1
		//				/  1 1 1 1 1
		
		
		if((input & 1) == 0 ) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
	
	
	}
		

}
