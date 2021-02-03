package Test21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num[] = new int[100];
		boolean reduceNum[] = new boolean[100];

		while (true) {
			System.out.println();
			System.out.println("숫자를 입력하시겠습니까? y or n");
			Scanner start = new Scanner(System.in);
			String sta = start.next();
			if (sta.equals("y")) {
				System.out.println("숫자를 입력하세요");
				Scanner scan = new Scanner(System.in);
				int input = scan.nextInt();
				for (int i = 0; i < num.length; i++) {
					num[i] = input;
					reduceNum[num[i]] = true;
				}
				for (int j = 0; j < reduceNum.length; j++) {
					if (reduceNum[j]) {
						System.out.print(j+" ");
					}
				}
			} // end if
			else if (sta.equals("n")) {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}
}
