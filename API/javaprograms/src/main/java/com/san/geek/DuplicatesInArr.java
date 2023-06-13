package com.san.geek;

import java.util.ArrayList;

public class DuplicatesInArr {

	public static void main(String[] args) {
		
		
		int a[] = {2,3,1,2,3}; // {2,8,11,12,3}
		findDuplicates(a,a.length);
		//printArr(resultArr);
	}

	private static void printArr(ArrayList<Integer> resultArr) {
		for(Integer s : resultArr) {
			System.out.print(s + " ");
		}
		
	}

	private static void findDuplicates(int[] arr, int n) {
		 // First check all the values that are
        // present in an array then go to that
        // values as indexes and increment by
        // the size of array
        for (int i = 0; i < n; i++) 
        {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Now check which value exists more
        // than once by dividing with the size
        // of array
        for (int i = 0; i < n; i++) 
        {
            if ((arr[i] / n) >= 2)
                System.out.print(i + " ");
        }
	}
}
