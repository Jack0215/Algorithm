package Test38;

import java.util.Scanner;

public class Main {
	public static void func(int coupon, int stamp, int k, int ans) {
		if (coupon > 0) {
			coupon--;
			stamp++;
			ans++;
			func(coupon, stamp, k, ans);
			return;
		} else if (stamp > 0) {
			if (stamp / k > 0) {
				stamp -= k;
				coupon++;
				func(coupon, stamp, k, ans);
			}
		}
		if (coupon == 0 && stamp / k == 0) {
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int coupon = n;

		func(coupon, 0, k, 0);
	}
}
