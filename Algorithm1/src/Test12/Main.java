package Test12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int arr[][] = new int[n][n];

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr [i][j] = i*1 + j*n+1;
			}
		}
		
		
		/*
		 * int num = 1;
		 * for(int i=0; i<n; i++){
		 * for(int j=0; j<n; j++){
		 * arr[j][i] = num;
		 * num++
		 * }
		 * }
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
