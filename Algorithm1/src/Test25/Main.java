package Test25;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int res = num;
		int cnt = 0;
		int tmp = 0;
		//26 2+6=8 => 68 6+8=14 => 84 8+4=12 => 42 4+2=6 => 26;
		//05 0+5=5 => 55 5+5=10 => 50 5+0 = 5
		//42 4+2=6 => 26 3+6=8 => 68 6+8=14 =>84 8+4=12 =>42
		
		do {
			tmp = res / 10 + res % 10;
			res = res % 10 * 10 + tmp % 10;
			cnt++;
		} while( num != res);
		System.out.println(cnt);
	}
}
