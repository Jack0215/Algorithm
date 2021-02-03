package Test11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int [] [] arr = new int [num][num];

		for(int i=0; i<num; i++) {
			if(i%2==0) {
				for(int j=0; j<num; j++) {
					arr[i][j] = i*num +j+1;
				}
			} else {
				for(int j= num-1; j>=0; j--) {
					arr[i][j] = i*num +num - j;
				}
			}
		}
			
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		}
	}

