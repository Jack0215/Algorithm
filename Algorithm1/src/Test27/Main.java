package Test27;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int arr [][] = new int[num][num];
		
		int x = 0;
		int y = 0;
		
		int n = 1;
		
		int f = num;
		
		for(int i=0; i<2*num-1; i++) {
			
				switch(i % 4) {
				case 0:
					for(int j=0; j<f; j++) {
						arr [y][x] = n;
						x++;
						n++;
					}
					x--;
					y++;
					f--;
					break;
					
				case 1:
					for(int j=0; j<f; j++) {
						arr [y][x] = n;
						y++;
						n++;
					}
					y--;
					x--;
					break;
					
				case 2:
					for(int j=0; j<f; j++) {
						arr [y][x] = n;
						x--;
						n++;
					}
					x++;
					y--;
					f--;
					break;
					
				case 3:
					for(int j=0; j<f; j++) {
						arr [y][x] = n;
						y--;
						n++;
					}
					y++;
					x++;
					break;
					
				}
			}			
		
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
