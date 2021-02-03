package Test33;

public class Main {
	
	static final int SIZE = 5;
	static final int COLOR = 2;
	
	static int arr [][] = {
			{0,0,0,0,0},
			{0,0,1,1,0},
			{0,0,0,0,1},
			{0,0,0,0,0},
			{0,0,0,0,0}	
	};
	
	public static void color (int x, int y) {
		if(arr[x][y]!=1) {
			arr[x][y] = COLOR;
		}
		if(x-1>=0 && arr[x-1][y] != COLOR && arr[x-1][y] !=1) {
			color(x-1,y);
		}
		if(x+1<=SIZE-1 && arr[x+1][y]!=COLOR && arr[x+1][y] !=1){
			color(x+1,y);
		}
		if(y-1>=0 && arr[x][y-1] != COLOR && arr[x][y-1] !=1) {
			color(x,y-1);
		}
		if(y+1<=SIZE-1 && arr[x][y+1]!=COLOR && arr[x][y+1] !=1){
			color(x,y+1);
		}
		
	}
	public static void main(String[] args) {
	
		for(int i =0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		color(0,0);
		
		for(int i =0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
