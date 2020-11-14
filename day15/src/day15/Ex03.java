package day15;

import java.util.Scanner;

class STD{
	public int prc;
	//이름, 세 과목을 입력받고 출력할 수 있도록 작성
	//합계와 평균은 3과목 기준으로 출력
	String name;
	int kor,eng,mat,sum;
	double avg;
	Scanner sc;
	
	public void Set_Profile() {
		sc= new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");name=sc.nextLine();
		System.out.print("국어성적을 입력하세요 :");kor=Integer.parseInt(sc.nextLine());
		System.out.print("영어성적을 입력하세요 :");eng=Integer.parseInt(sc.nextLine());
		System.out.print("수학성적을 입력하세요 :");mat=Integer.parseInt(sc.nextLine());
		sum=kor+eng+mat;
		avg=sum/3.0;
		System.out.println();
		
	}
	void show() {
		System.out.println("=====출력=====");
		System.out.println("이름 : "+ name);
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ String.format("%.2f", avg));
		System.out.println();
	}
}

class STD2 extends STD{
	//외국어 과목추가
	//합계와 평균은 4과목 기준으로 출력
	//입력과 출력의 메서드는 오버라이딩을 작성
	
	int prc;
	@Override
	/*
	 * (non-Javadoc)
	 * @see day15.STD#Set_Profile(java.lang.String)
	 */
	public void Set_Profile() {
		sc= new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");name=sc.nextLine();
		System.out.print("국어성적을 입력하세요 :");kor=Integer.parseInt(sc.nextLine());
		System.out.print("영어성적을 입력하세요 :");eng=Integer.parseInt(sc.nextLine());
		System.out.print("수학성적을 입력하세요 :");mat=Integer.parseInt(sc.nextLine());
		System.out.print("프랑스어 성적을 입력하세요 : ");prc=Integer.parseInt(sc.nextLine());
		sum=kor+eng+mat+prc;
		avg=sum/4.0;
		System.out.println();
	}
	@Override
	public void show() {
		System.out.println("=====출력=====");
		System.out.println("이름 : "+ name);
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ String.format("%.2f",avg));
		System.out.println();
	}
	void ShowPrc() {
		System.out.println("프랑스어 : "+prc);
	}
}

public class Ex03 {

	public static void main(String[] args) {
		STD2 ob1= new STD2();
		STD ob2 = new STD();
		STD2 ob3 = new STD2();
		
		STD [] room = new STD[] {ob1,ob2,ob3};
		
		// 배열에 들어가면서 공통점으로 묶어주기 위해 부모클래스 자료형을 사용한다.
		// 부모클래스로 자식 객체를 참조
		
		for(int i=0;i<room.length;i++) {
			room[i].Set_Profile();
		}
		for(int i=0;i<room.length;i++) {
			room[i].show();
		}
		
		// 캡슐화 : 외부에서 객체 내부에 함부로 접근 할 수 없게 하는 특징(접근 제한자 , getter, setter)
		// 상속  : 이미 만들어진 클래스를 참조하여 새로운 클래스를 손쉽게 작성하기(Extends)
		// 다형성 : 하나의 객체는 부모클래스 형태로도 참조 가능하고 자식클래스 형태로도 참조 가능하다.
		ob1.ShowPrc();
//		room[1].showlang();
		System.out.println(ob1);
		System.out.println(room[1]);
		
		}

}
