package Test36;

import java.util.Scanner;

public class Main {
	public static void func(int n) {
		
		if(n/2 <= 0){
			System.out.println(n);
			return;
		}
		System.out.print(n%2);
		
		func(n/2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int input = scan.nextInt();
		
		func(input);
	}
}
