package com.san.arrays;

public class RotateArray {

	public static void main(String[] args) {
		// int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		// int[] resArr = rotate(arr, 2, 7);
		// printArr(resArr);

		// int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		// rotate_M2(arr, 2, 11);
		// printArr(arr);

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate_M3(arr, 2, arr.length);
		printArr(arr);
	}

	// d= by position
	// n = length
	public static int[] rotate(int[] arr, int d, int n) {
		int resArr[] = arr.clone();
		for (int i = 0; i < d; i++) {
			int temp = resArr[0];
			for (int j = 0; j < resArr.length - 1; j++) {
				resArr[j] = resArr[j + 1];
			}
			resArr[n - 1] = temp;
		}
		return resArr;
	}

	public static void printArr(int[] arr) {
		if (arr != null && arr.length > 0) {
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i]);
		} else {
			System.out.println("Array is null or empty");
		}
	}

	// Another method

	public static int[] rotate_M2(int[] arr, int d, int n) {

		/* To handle if d >= n */
		d = d % n;
		int i, j, k, temp;
		int gcd = GCD(d, n);

		for (i = 0; i < gcd; i++) {
			/* move i-th values of blocks */
			temp = arr[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}

		return null;
	}

	static int GCD(int a, int b) {
		if (b == 0)
			return a;
		else
			return GCD(b, a % b);
	}

	// Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
	// Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
	// Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]

	public static void rotate_M3(int[] arr, int d, int n) {
		roatate_M3_a(arr,0,d-1);
		roatate_M3_a(arr,d,n-1);
		roatate_M3_a(arr,0,n-1);
	}
	
	private static void roatate_M3_a(int[] arr,int start,int end) {
//		while(start<end) {
//			int temp = arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
//			start++;
//			end--;
//		}
		
		//With For Loop
		
		for(int i=start;i<end;i++,end--) {
			int temp = arr[i];
			arr[i]=arr[end];
			arr[end]=temp;
		}
		
	}

}
