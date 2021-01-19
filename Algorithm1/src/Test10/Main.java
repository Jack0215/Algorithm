package Test10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
//		int index = 1;
//		
//		for(int i=1; i<=num; i++) {
//			for(int j=1; j<=num; j++) {
//				System.out.printf("%4d",index);
//				index++;
//			}
//			System.out.println();
//		}
//		//////////////////////////////
		
		for(int i=0; i<num; i++) {
			System.out.println();
			for(int j=0; j<num; j++) {
				System.out.printf("%4d", i*(num)+j+1);
			}
		}
	}

}
