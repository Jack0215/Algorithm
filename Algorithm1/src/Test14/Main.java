package Test14;


public class Main {

	public static void main(String[] args) {
		int n = 123456789;
		
		int arr [] = new int [10];
		
		while( n > 0) {
			arr[n%10]++;
			n /=10;
		}
		
		for(int j=0; j<10; j++) {
			System.out.println(j+":"+arr[j]);
		}
	}

}
