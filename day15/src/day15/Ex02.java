package day15;

import java.util.Scanner;

class Human{
	String name;
	int age;
	String gender;
	public void show() {
		System.out.println("이름 "+name);
		System.out.println("나이 "+age);
		System.out.println("성별 "+gender);
	}
}
class Student extends Human{
	//Human 클래스를 상속받은 Student 클래스가 
	//과목별 성적을 저장하고 출력 할 수 있도록 기능을 추가하세요 
	int kor,eng,mat;
	double avg;
	public void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.print(name+"님의 국어를 입력하세요 :");
		kor=Integer.parseInt(sc.nextLine());
		System.out.print(name+"님의 영어를 입력하세요 :");
		eng=Integer.parseInt(sc.nextLine());
		System.out.print(name+"님의 수학를 입력하세요 :");
		mat=Integer.parseInt(sc.nextLine());
	}		//자바는 다중 상속을 허용하지 X(A라는 부모클래스는 하나만 존재한다.)
	@Override
	/*
	 * (non-Javadoc)
	 * @see day15.Human#show()
	 * 
	 */
	public void show() {	
		System.out.println("이름 "+name);
		System.out.println("나이 "+age);
		System.out.println("성별 "+gender);
		avg=(kor+eng+mat)/3.0;
		System.out.printf(name+"의 나이는 "+age+"살이고, 합계 : "+(kor+eng+mat)+" 평균 : %.1f \n",avg);
	}
}
public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		Student 클래스의 객체 st1을 생성하여 이름 나이 합계 평균을 출력
		Student std = new Student();
		System.out.print("이름 나이 성별순으로 입력 :");
		std.name=sc.nextLine();
		std.age=Integer.parseInt(sc.nextLine());
		std.gender=sc.nextLine();
		std.scan();
		std.show();					//Stdudent 클래스에 정의된 Show
		

		Human h1 =std;		//학생객체를 사람 자료형으로 참조한다.
		h1.show();
		
	}

}
