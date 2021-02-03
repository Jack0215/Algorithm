package Test34;

import java.util.Scanner;

public class Main {

	public static int pibo(int n) {
		if(n ==1) {
			return 1;
		}
		if(n ==2) {
			return 1;
		}
		
		return pibo(n-1)+pibo(n-2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int ans = pibo(n);
		
		System.out.println(ans);
	}
}
