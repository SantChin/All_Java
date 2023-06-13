package com.san.interviewprgms;

public class SortArray012 {

	public static void main(String[] args) {
		
		int a[] = new int[] {0,2,0,1,0,1};
		sort012(a,6);
		
		printArr(a,6);
	}



	private static void sort012(int[] a, int n) {
		
		int lo = 0;
		int mid = 0;
		int hi = n-1;
		while(mid<=hi) {
			if(a[mid] == 0) {
				swap(lo,mid,a);
				mid++;
				lo++;
			}else if(a[mid] == 1) {
				mid++;
			}else if(a[mid] == 2) {
				swap(mid,hi,a);
				hi--;
			}
		}
		
	}

	private static void swap(int v1, int v2, int[] a) {
		int temp = a[v1];
		a[v1] = a[v2];
		a[v2] = temp;
	}
	
	private static void printArr(int[] a, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
}
