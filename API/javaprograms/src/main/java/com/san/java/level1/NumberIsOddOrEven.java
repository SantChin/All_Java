package com.san.java.level1;

public class NumberIsOddOrEven {

	public static void main(String[] args) {
		 int number=54;
         
         if((number&1) ==0)
                System.out.println(number+" is EVEN");
         else
                System.out.println(number+" is ODD");
	}
}
