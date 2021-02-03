package Test23;


public class Main {

	public static void main(String[] args) {
		String s = "ABCDE123";
		char len [] = s.toCharArray();
		int slen = s.length();
//		for(int i=slen-1; i>=0; i--) {
//			System.out.print(len[i]);
//		}
		//////////////////////////
		
		char tmp;
		
		for(int j=0; j<slen/2; j++) {
			tmp = len[j];
			len[j]=len[slen-1-j];
			len[slen-1-j]=tmp;
		}
		
		s = new String(len);
		System.out.println(s);
		
	}

}
