package Test09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int inputNum = num;
		int sum = 0;
		
		//1232 => 123 => 12 => 1 => 0
		//	 3 	 	3 	  2    1  =>8
		
		while(num >0) {
			sum += num% 10;
			num /= 10;
			
		}
		System.out.println(inputNum+"의 각 자릿수의 합은"+sum+"입니다.");
	}		

}
