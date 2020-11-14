package day11;

 class Pos2D{
	 
	int x;	//변수	
	int y;	//클래스 내에서 사용되는 변수 = > 필드 : [값을 저장할수있는공간]
	String name = "레이너 ";//자료형이 다른것을 저장할 수 있음
	
	void ShowPos() {		//함수, 메서드(Method) : 클래스 내에 정의된 함수 
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}

public class Ex04_Class {

	public static void main(String[] args) {

		Pos2D ob1 = new Pos2D();	//클래스 자료형으로 만들어낸 변수: 객체
		ob1.x=10;						//객체 내부의 필드에 접근하기 위해서( . )사용
		ob1.y=20;						//ob1.x 
		
		System.out.println("ob1.x : "+ob1.x);
		System.out.println("ob1.y : "+ob1.y);
		
		ob1.ShowPos();
		//변수 : 하나의 데이터를 저장한다 자료형을 필요하다. 
		//배열 : [같은 자료형]의 데이터를 묶어서 관리
		//구조체  : 여러 자료형
		//C언어에서 구조체 (Struct) : 여러 자료형을 포함 할 수 있는 [사용자 정의 자료형]
		//=>형식이 지정되어있어서 사용되는 함수도 자주 사용할 수 있는 함수가 정해져있음
		
		//구조체와 함수를 묶어서 하나의 자료형으로 만들어서 쓰자 => Class(결국 자료형)
		
		
		

	}

}
