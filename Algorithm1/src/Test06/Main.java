package Test06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("두 값을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int div=0;
		
		if(num1>num2) {
			num1=num1;
			num2=num2;
		} else if(num2>num1) {
			num1=num2;
			num2=num1;
		}
		
		//num1이 더 크도록 설정
		for(int i=1; i<num1; i++) {
			if(num1%i==0 && num2%i==0) {
				div = i;
			}
		}
		System.out.println("두 수의 최대 공약수는 "+div+" 입니다.");
	
	}

}
