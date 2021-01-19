package Test07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("값을 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int mok = 2;
		
		
//		if(num/mok != 0)	{
//			System.out.println("입력하신 값"+num+"은 소수입니다.");
//			
//			}
//		
		////////////////////
		boolean isPrimeNumber = true;
		for(int i = 2; i<=num-1; i++) {
			if (num % i ==0 ) {
				isPrimeNumber = false;
			} 
		}
		if (isPrimeNumber) {
			System.out.println("입력하신 값 "+num+"은 소수입니다.");
		}
	}

}
