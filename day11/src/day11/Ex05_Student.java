package day11;

import java.util.Scanner;

//학생 관리 프로그램

class Student{//학생이라는 자료형 만들기		
	
	//필드선언
	String name;
	int kor,eng,mat,sum=0;
	double avg;
	Scanner sc;
	//메서드
	void Input() {
		sc= new Scanner(System.in);
		System.out.print("이름을 입력하세요  : ");
		name = sc.nextLine();
		System.out.print("국어점수를 입력하세요  : ");
		kor=Integer.parseInt(sc.nextLine());
		System.out.print("영어점수를 입력하세요  : ");
		eng=Integer.parseInt(sc.nextLine());
		System.out.print("수학점수를 입력하세요  : ");
		mat=Integer.parseInt(sc.nextLine());
		sum=kor+eng+mat;
		avg=sum/3.0;
		System.out.println();
		
	}
	void show () {
		System.out.printf("[%s] : %d,%d,%d, 합계 : %d, 평균 : %.2f\n"
				,name,kor,eng,mat,sum,avg);
	}
}

public class Ex05_Student {
	
	public static void main(String[] args) {
		
		Student st01;      // Student 자료형을 가리킬 수 있는 참조변수 st01
								//값이 없으면 실제 데이터를 참조하고 있는게 아니다
		st01 = new Student();	//new Student(); // new 클래스 이름();
		
		st01.Input();
		st01.show();
		
		Student st02 = new Student();			//c참조변수선언 및 초기화 작업은 동시에 진행해도 된다.
		Student st03 = new Student();			//각 객체는 서로다른 공간을 차지하므로, 데이터가 겹치지 않는다. 
		
		st02.Input();st03.Input();
		st02.show();st03.show();
		

		//잘 만들어진 클래스를 활용하려면 메인함수의 코드가 짧아지고 단순해 진다.
		//클래스
	}
}
