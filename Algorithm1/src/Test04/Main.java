package Test04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2진수로 변환 할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int Num = scan.nextInt();
		int [] bin = new int[100];
		int i = 0;
		/* 19 / 2 = 9 ...1
		 * 9  / 2 = 4 ...1
		 * 4  / 2 = 2 ...0
		 * 2  / 2 = 1 ...0
		 * 1  / 2 = 0 ...1
		 * 
		 * 10011 = 19
		 * */
		
		
		while(Num>0) {
			bin[i] = Num % 2;
			Num /= 2;
			i++;
		};
		
		i--;
		
		for(; i>=0; i--) {
			System.out.print(bin[i]);
		}
	}

}
