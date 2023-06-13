package com.san.geek;

public class EquilibriumPoint {

	
	public static void main(String[] args) {
		
		int a[] = {1,3,5,2,2};
		int point = findEqPoint(a,a.length);
		System.out.println(point);
	}

	private static int findEqPoint(int[] a, int n) {
		
		int leftSum = 0;
		int rightSum = 0;
		
		if(n ==1) {
			return a[0];
		}
		for(int j=0;j<n;j++) {
			rightSum += a[j];
		}

		for(int i=0;i<n;i++) {
			rightSum = rightSum - a[i];
			if(leftSum == rightSum) {
				return i+1;
			}else {
				leftSum+=a[i];
			}
		}
		
		return -1;
	}
}
