package Test40;

import java.util.Scanner;

public class Main {

	static int cnt = 0;
	static int min = 99999999;

	public static void func(int num, int way, int cnt) {
		if (way == 3 && num % 3 == 0) {
			cnt++;
			num /= way;
			for (int i = 1; i <= 3; i++) {
				func(num, way, cnt);
			}
		} else if (way == 2 && num % 2 == 0) {
			cnt++;
			num /= way;
			for (int i = 1; i <= 3; i++) {
				func(num, way, cnt);
			}
		} else if (num >= 2) {
			cnt++;
			num -= 1;
			for (int i = 1; i <= 3; i++) {
				func(num, way, cnt);
			}
		}
		if (num == 1 && cnt < min) {
			min = cnt;
			return;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		for (int i = 0; i <= 3; i++) {
			func(n, i, 0);
		}
		System.out.println(min);
	}
}
