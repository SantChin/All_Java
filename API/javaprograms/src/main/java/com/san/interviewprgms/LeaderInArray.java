package com.san.interviewprgms;

import java.util.ArrayList;

public class LeaderInArray {

	public static void main(String[] args) {
		
		int a[] = new int[] {16,17,4,3,5,2};
		ArrayList<Integer> leader = leader(a,6);
		printArr(leader,6);
	}
	
	static ArrayList<Integer> leader_1(int[] a, int n){
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		int i = n;
		int j = 0; 
		
		while(i<=0) {
		   if(i == n) {
			   output.add(a[i]);
			   i--;
		   }
		   
		   
		}
		return output;
		
	}
	
	static ArrayList<Integer> leader(int[] a, int n){
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		int i = 0;
		int j = 0; 
		
		while(i<=n-1) {
			int ldr = a[j];
			if(i < n-1 && ldr > a[i+1]) {
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
	
	
	private static void printArr(ArrayList<Integer> leader, int i) {
		// TODO Auto-generated method stub
		
	}
}
