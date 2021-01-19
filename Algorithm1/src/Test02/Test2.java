package Test02;


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A[n] = A[n-1] + A[n-2] n>=3
		//a1 = 1, a2=1
		int [] arr = new int [100];
		
		arr[1]=1;
		arr[2]=1;
		
		for(int i=3; i<100; i++) {
			arr[i] =  arr[i-1] + arr[i-2];
		}
		for(int i=1; i<=10; i++) {
			System.out.print(arr[i]+" ");
		}
		
		/////////////////////////////////////
		System.out.println();
		int firstNum = 1; //A[n-1]
		int secondNum  =1; //A[n-2]
		
		System.out.print(firstNum+" ");
		System.out.print(secondNum+" ");
		
		for(int i=3; i<=3; i++) {
			int thirdNum = firstNum+secondNum;
			System.out.print(thirdNum+" ");
			
			secondNum = firstNum;
			firstNum = thirdNum;
//			int nnNum = nNum +  secondNum;
//			System.out.println(nnNum);
		}
	}

}
