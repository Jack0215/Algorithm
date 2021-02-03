package Test30;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] arr = new int[n];

		int cnt = 1;

		for (int i = 0; i < arr.length; i++) {
			if (cnt % 2 == 1) {
				arr[i] = cnt;
				cnt++;
			} else {
				arr[i] = cnt;
				cnt++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				System.out.println(arr[i]);
				break;
			}
			if(i % 2 != 1) {
				System.out.print(arr[i]+"+");
				
			} else if(i % 2 == 1) {
				System.out.print(arr[i]+"-");
			}
		}
	}
}
