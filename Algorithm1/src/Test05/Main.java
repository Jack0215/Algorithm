package Test05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		
		char [] arr;
		
		arr = word.toCharArray();
		
		for(int i=0; i<word.length(); i++) {
			if(arr[i] >= 'a' && arr[i] <='z') {
				arr[i] = (char) (arr[i] + 'A'-'a');
			}else if(arr[i] >= 'A' && arr[i] <='Z'){
				arr[i] = (char) (arr[i] - ('A'-'a'));
			}
		}
		System.out.print(arr);
		
	}

}
