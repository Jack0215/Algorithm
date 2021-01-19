package Test08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("수를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int fac = 1;
		for(int i=1; i<=num; i++) {
			  fac *=i;
		}
		System.out.println(fac);
	}

}
