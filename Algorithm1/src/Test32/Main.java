package Test32;

import java.util.Scanner;

public class Main {

	public static int func(int start, int end) {
		if(start == end) {
			return start;
		}else {
		return start + func(start+1,end);
		}
	}
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		int start = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int end = scan2.nextInt();
		
		System.out.println(func(start, end));
	}
}
