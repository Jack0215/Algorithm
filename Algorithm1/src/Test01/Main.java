package Test01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Stu1 = new Student("이재윤","20165603");
		Student Stu2 = new Student("김재윤","20165604");
		Student Stu3 = new Student("박재윤","20165605");
		Student Stu4 = new Student("최재윤","20165606");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(Stu1);
		list.add(Stu2);
		list.add(Stu3);
		list.add(Stu4);
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("이름으로 학번을 검색하시겠습니끼?"+" y or n");
			String input = scan.next();
			boolean flag=false;
			
			if(input.equals("y")) {
				System.out.println("이름을 입력하세요");
				String name = scan.next();
				for ( Student stu:list) {
					if(stu.getName().equals(name)) {
						System.out.println("입력하신 "+name+"님의 학번은"+stu.getNo()+"입니다.");
						flag=true;
					}
				}//end for
				if(!flag) {
					System.out.println(name+"님의 학번 정보가 없습니다.");
				} //end if(!flag)
			} //end if (input.equals("y"))
			else if(input.equals("n")) {
				System.out.println("종료되었습니다.");
				break;	
			}			
		}
	}

}
