package Test35;

import java.util.Scanner;

public class Main {

	public static void func(int n) {
	
		if(n/10 == 0) {
			System.out.println(n);
			return;
		}
		
		func(n/10);
		System.out.println(n%10);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int in = scan.nextInt();

		func(in);
	}
}
