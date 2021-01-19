package Test2_again;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [100];
		
		arr[0]=1;
		arr[1]=1;
		//arr[2] = 0 이다.
		for (int i=3; i<=10; i++) {
			arr[i]=arr[i-1]+arr[i-2];
			System.out.print(arr[i]+" ");
		}
		/////////////////////////////////////////
		System.out.println();
		int prePreNum=1;
		int preNum=1;
		System.out.print(prePreNum+" ");
		System.out.print(preNum+" ");
		for(int i=3; i<=10; i++) {
			int nNum = preNum+prePreNum;
			System.out.print(nNum+" ");
			
			preNum = prePreNum;
			prePreNum = nNum;
		}
	}

}
