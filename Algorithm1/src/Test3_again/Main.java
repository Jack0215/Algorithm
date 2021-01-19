package Test3_again;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			arr[i]=scan.nextInt();
		}
		
		int [] mode = new int[10];
		
		for(int i=0; i<10; i++) {
			mode[arr[i]]++;
		}
		
		int modeNum=0;
		int modeCnt=0;
		
		for(int i=0; i<10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println("최빈값은 "+modeNum+" 이며 "+modeCnt+"회 입력되었습니다.");
	}

}
