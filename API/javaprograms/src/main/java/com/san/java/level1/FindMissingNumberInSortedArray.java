package com.san.java.level1;

/*Missing numbers between 1 to 100 in sorted array in java. */
public class FindMissingNumberInSortedArray {

	public static void main(String[] args) {

		int ar[] = { 3, 5, 8, 44 }; // given array
		int length = ar.length;
		int cnt = 0;

		for (int i = 1; i <= 100; i++) {
			if (cnt < ar.length && i == ar[cnt])
				cnt++;
			else
				System.out.print(i + " ");
		}
		
		cnt =0;
		System.out.println();

		for (int i = 1; i <= 100; i++) {

			if (cnt == length) {
				System.out.print(i + " ");
			} else if (i == ar[cnt]) {
				cnt++;
				continue;
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
