package com.sab.aaa.drunk.prgms;

import java.util.Arrays;

public class MoveAllZerosToTheEndOfArray {

	public static void main(String[] args) {
		int input[] = {0,4,9,0,1,3,0,4,5};
		
		//Approch 1
		int outputArr[] = new int[input.length];
		int res = 0;
		
		for(int i=0;i<input.length;i++) {
			if(input[i]>0) {
				outputArr[res] = input[i];
				res++;
			}
		}
		
		 System.out.println(Arrays.toString(outputArr));
		 
		 
		 //Approch 2
		 
		
	}
}
