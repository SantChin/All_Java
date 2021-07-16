package com.san.java.level1;


/*
 * 
 * Example (dry run)> 
Let’s say our initial number is 123


Execute code inside while loop as number>0 (i.e. 123)
remainder=number%10;
number=number/10;
reverse=reverse*10+remainder;
remainder=3, number=12, reverse=3


Execute code inside while loop again, as number>0 (i.e. 12)
remainder=number%10;
number=number/10;
reverse=reverse*10+remainder;
remainder=2, number=1, reverse=32
 * */
public class ReverseNumber {

	public static void main(String[] args) {
		
		//int num = 1234;
		
		int num = -321;
		
		System.out.println(reverseNumV1(num));
		boolean flag = false;
		if(num < 0) {
			flag = true;
			num = num * -1;
		}
		
		int reversNum = 0;
		
		while(num>0)
		{
			int reminder = num%10;
			num = num/10;
			reversNum = reversNum * 10 +reminder;
		}
		
		if(flag) {
			reversNum = reversNum * -1;
		}
		
		System.out.println(reversNum);
		
		
	}
	
	
	// Another way
	public static int reverseNumV1(int x) {
		String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
		try {
		    return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
		} catch (NumberFormatException e) {
		    return 0;
		}
	}
}
