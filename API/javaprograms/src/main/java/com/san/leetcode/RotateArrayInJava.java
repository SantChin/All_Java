package com.san.leetcode;

public class RotateArrayInJava {

	public static void main(String[] args) {

		// Problem : Rotate an array of n elements to the right by k steps.
		// with n=7 and k=3. arr [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
		
		int []arr = {1,2,3,4,5,6,7};
		int k =3;
		
		//Approch 1 - Intermediate array
		//rotatearr1(arr,k);
		
		//Approch 2 - Bubble Rotate
		//O(1) space. Time O(n*k)
		rotateArrUsingBubbleRotate(arr,k);
		
		
		//Approch 3 - Reversal
		//O(1) Space and O(n) time
		//rotateArrUsingReversal(arr,k);
		

	}

	private static void rotateArrUsingReversal(int[] arr, int k) {
		//Steps 
		//1. Divide the arr into two parts
		//2. Rotate the first part : 4,3,2,1
		//3. Rotate the second part : 7,6,5
		//4. Rotate the whole arr   : 5,6,7,1,2,3,4
		
		
		k = k % arr.length;
		
		if(arr==null || k<0)
			throw new IllegalArgumentException("Ilegal Argument");
		
		//length of first part
		int length = arr.length - k;
		
		
		reverse(arr,0,length-1);
		reverse(arr,length,arr.length-1);
		reverse(arr,0,arr.length-1);
		
	}

	private static void reverse(int[] arr, int left, int right) {
		 
		if(arr==null || arr.length == 1)
			return;
		
		while(left<right) {
			
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

	}

	private static void rotateArrUsingBubbleRotate(int[] nums, int k) {
		
		if(nums==null || k<0)
			throw new IllegalArgumentException("Ilegal Argument");
		
		
		for(int i=0;i<k;i++) {
			
			for(int j=nums.length -1 ;j>0 ; j--) {
				int temp = nums[j];
				nums[j]= nums[j-1];
				nums[j-1]=temp;
			}
		}
		
		
		
	}

	private static void rotatearr1(int[] nums, int k) {
		
		if(k>nums.length)
			k = k%nums.length;
		
		int [] result = new int[nums.length];
		
		for(int i=0;i<k;i++) {
			result[i] = nums[nums.length - k+i];
		}
		
		
		int j=0;
		for(int i=k;i<nums.length;i++) {
			result[i] = nums[j];
			j++;
		}
		
		System.arraycopy(result, 0, nums, 0, nums.length);
		
		System.out.println(result);
		
		
		
		
		
	}
}
