package Test37;

public class Main {
	
	static final int SIZE = 5;
	static final int APART = 1;
	static int apartCnt = 0;
	
	static int [] household = new int [10];
	
	static int [][] map = {
			{0,0,0,1,1},
			{0,0,0,0,1},
			{1,0,0,0,0},
			{1,1,0,0,0},
			{1,1,0,1,1}
	};
	
	public static void func(int y, int x, int apartIndex) {
		map[y][x] = 0;
		household[apartIndex]++;
		
		if(x - 1 >=0 && map[y][x-1]==APART) {
			func(y, x-1, apartIndex);
		}
		if(x + 1 <=SIZE-1 && map[y][x+1]==APART) {
			func(y, x+1, apartIndex);
		}
		if(y + 1 <=SIZE-1 && map[y+1][x]==APART) {
			func(y+1, x, apartIndex);
		}
		if(y - 1 >=0 && map[y-1][x]==APART) {
			func(y-1, x, apartIndex);
		}
 
	}
	public static void main(String[] args) {
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				if(map[i][j] ==1) {
					func(i,j,apartCnt);
					apartCnt++;
				}
			}
		}
		
		System.out.println(apartCnt);
		for(int i : household) {
			System.out.print(i+"  ");
		}
	}
}
