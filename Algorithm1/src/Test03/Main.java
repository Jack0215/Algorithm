package Test03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int [] arr = new int [10];
		
		for(int i=0; i<10; i++) {
			 arr[i] = scan.nextInt();
		};
		
		int [] mode = new int [10];
		
		for (int i=0; i<10; i++) {
			mode[arr[i]]++;
		}
		
		int modeNum = 0;
		int modeCnt = 0;
		for (int i=0; i<10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println(modeNum +" "+modeCnt);
	}

}
