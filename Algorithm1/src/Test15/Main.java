package Test15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int num = scan.nextInt();
//		
//		int arr [][] = new int[10][10];
//		
//		for(int i=0; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				arr[j][i] = i*j;
//			}
//		}
//		
//		for(int i=1; i<10; i++) {
//			for(int j=2; j<=num; j++) {
//				System.out.printf("%2d *%2d =%3d ",j ,i ,arr[j][i]);
//			}
//			System.out.println();
//		}
		///////////////////////////////////////
		int s = 1;
		int f = 9;
		
		for (int i=1; i<10; i++) {
			for(int j=s; j<=f; j++) {
				System.out.printf("%2d *%2d = %2d ", i,j,i*j);
			}
			System.out.println();
		}
		
		
	}

}
