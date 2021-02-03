package Test22;


public class Main {

	public static void main(String[] args) {
		String n = "12321";
		
		int len = n.length();
		boolean flag = true;
		
		for(int i=0; i<len/2;i++) {
			if(n.charAt(i)!=n.charAt(len-1-i)) {
				flag = false;
			}
		}
		System.out.println(flag);
	}

}
