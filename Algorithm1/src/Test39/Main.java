package Test39;

import java.util.Scanner;

public class Main {

	static int cache[] = new int[1000];

	public static int func(int num) {
		if (cache[num] != 0) {
			return cache[num];
		}
		return cache[num] = func(num - 1) + func(num - 2) + func(num - 3);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		cache[1] = 1;
		cache[2] = 2;
		cache[3] = 4;
		System.out.println(func(n));
	}
}
