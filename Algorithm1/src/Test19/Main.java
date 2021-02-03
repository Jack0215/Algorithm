package Test19;


public class Main {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 3;
		int n3 = n1;
		for(int i=0; i<n2-1; i++) {
			n3 *= n1;
			
		}
		System.out.println(n3);
	}

}
