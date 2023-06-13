package com.san.geek;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArray {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> output = new ArrayList<>();
		int [] arr = {16,17,4,3,5,2};
		int n = 6;
		
		output = leadersV1(arr,n);
		System.out.println(output);
		
	}
	
	
	
	 static ArrayList<Integer> leadersV1(int arr[], int n){
	        ArrayList<Integer> output = new ArrayList<Integer>();
	        
	        int ldr = 0;
	        for(int i=n-1;i!=0;i--) {
	        	if(arr[i]>=ldr) {
	        		output.add(arr[i]);
	        		ldr = arr[i];
	        	}
	        }
	        Collections.reverse(output);
			return output;
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	   static ArrayList<Integer> leaders(int arr[], int n){
	        ArrayList<Integer> output = new ArrayList<Integer>();
			
			int i = 0;
			int j = 0; 
			
			while(i<=n-1) {
				int ldr = arr[j];
				if(i < n-1 && ldr > arr[i+1]) {
					if((i+1) == n-1) {
						output.add(ldr);
						j++;
						i=j;
					}else {
						i++;
					}
				}else if(j==n-1){
					output.add(ldr);
					j++;
					i=j;
				}else {
					j++;
					i=j;
				}
			}
			return output;
	    }
}
