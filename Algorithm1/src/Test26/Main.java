package Test26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Scanner scan1 = new Scanner(System.in);
//		int arr1 = scan1.nextInt();
//		
//		//int num = 500;
//		
//		int count1 = 0;
//		while(arr1 > 0) {
//			arr1 /=10;
//			count1++;
//		}
//		
//		Scanner scan2 = new Scanner(System.in);
//		int arr2 = scan2.nextInt();
//		
//		//int num = 500;
//		
//		int count2 = 0;
//		while(arr2 > 0) {
//			arr2 /=10;
//			count2++;
//		}
//		int arrA[] = new int[count1];
//		int arrB[] = new int[count2];

		int arr1 = 738;
		int arr2 = 456;

		int arrA[] = new int[3];
		int arrB[] = new int[3];

		int lenA = 0;
		do {
			arrA[lenA] = arr1 % 10;
			arr1 /= 10;
			lenA++;
		} while (arr1 > 0);

		int mux = 1;
		int tranA = 0;

		for (int i = arrA.length - 1; i >= 0; i--) {
			tranA += arrA[i] * mux;
			mux *= 10;
		}

		int lenB = 0;
		do {
			arrB[lenB] = arr2 % 10;
			arr2 /= 10;
			lenB++;
		} while (arr2 > 0);

		int tranB = 0;

		mux = 1;

		for (int i = arrB.length - 1; i >= 0; i--) {
			tranB += arrB[i] * mux;
			mux *= 10;
		}

		if (tranA > tranB) {
			System.out.println(tranA);
		} else {
			System.out.println(tranB);
		}
	}
}
