package com.san.simpleprgm;

import java.util.Scanner;

public class BasicPrgm {

	public static void main(String[] args) {
		
		System.out.println("Sample Basic Progrms..........");
		
		System.out.println("..............Printing Integers......................");
		
		//1.Printing Integers
		
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
		
		System.out.println("..............Command Line Args....................\n");
		
		//2.Command Line Args
		
		for(String s : args) {
			System.out.println(s);
		}
		
		System.out.println("................Using Scanner..................\n");
		
		//3.Using Scanner
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a value to read using scanner : ");
//		int value = scanner.nextInt();
//		System.out.println("Read Using Scanner Value : "+value);
//		scanner.close();
		
		System.out.println(".............FarhernHeit to Celicius.................\n");
		
		//4.FarhernHeit to Celicius
		
		float temp = 5.04f;
		temp = ((temp-32)*5)/9;
		System.out.println(temp);
		
		
		System.out.println(".............Swap With 3rd Variable.................\n");
		//5.Swap With 3rd Variable
		int f1 = 2; int f2 = 3;
		System.out.println("Before Swap : "+ f1 +"--->"+f2);
		int res = f1;
		f1=f2;
		f2=res;
		System.out.println("After Swap : "+ f1 +"--->"+f2);
		
		System.out.println(".............Swap WithOut 3rd Variable.................\n");
		//5.Swap WithOut 3rd Variable
		int e1 = 2; int e2 = 3;
		System.out.println("Before Swap : "+ e1 +"--->"+e2);
		e1=e1+e2;
		e2 = e1-e2;
		e1 = e1-e2;
		System.out.println("After Swap : "+ e1 +"--->"+e2);
	}
}
