package com.san.searching;

public class BinarySearchExample1 {

	public static void main(String[] args) {
		
		int [] arr = {11,13,15,19,25,29,33,44,55,78,88,99};
		int val = binarySearch(arr,88);
		
		if(val==-1)
			System.out.println("Item not Found");
		else
			System.out.println(val);
	}
	
	//Assuming array [11,13,15,19,25,29,33,44,55,78,88,99]
	public static int binarySearch(int[] arr,int item) {
		
		if(arr.length == 0)
			return -1;
		
		int low = 0;
		int high = arr.length -1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			int guess = arr[mid];
			if(item == guess)
				return mid;
			if(item<guess)
				high = mid-1;
			else
				low = mid+1;
		}
		return -1;
	}
}


