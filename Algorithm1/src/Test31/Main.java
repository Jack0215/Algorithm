package Test31;

public class Main {

	public static int func(int num) {
		if(num==1) {
			return 1;
		}else {
			return num * func(num-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(func(5));
	}
}
