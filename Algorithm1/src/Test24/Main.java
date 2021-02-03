package Test24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("학생은 몇명입니까?");
		Scanner total = new Scanner(System.in);
		int to = total.nextInt();
		int[] stu = new int[to];
		double sum = 0;
		double avg = 0;
		double cnt = 0;
		while (true) {
			System.out.println("점수를 입력하세요");
			Scanner scan = new Scanner(System.in);
			for (int i = 0; i < to; i++) {
				stu[i] = scan.nextInt();
				sum += stu[i];
			}
			avg = sum/to;
			for(int j=0; j<to; j++) {
				if(stu[j]>avg) {
					cnt++;
				}
			}
			double rate = (cnt/to*100);
			System.out.println(to);
			System.out.println(rate);
			
			break;
		}
	}

}
