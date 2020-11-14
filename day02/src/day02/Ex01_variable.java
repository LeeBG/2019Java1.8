package day02;

public class Ex01_variable {

	public static void main(String[] args) {
		/* 범위주석
		 * 
		 * 
		 */
		
		/*
		 * 변수를 생성할때
		 * [자료형] [변수이름];				//변수의 선언
		 * [자료형] [변수이름]=[값];		//변수의 선언 및 초기화
		 * [변수이름]=[값];					//이미 선언된 변수는 자료형을 기재하지 않고
		 * 											//값을 대입하거나 사용한다.
		 * 변수는 동시에 하나의 값만 저장하기 때문에 새로운 값을 대입하면 기존의값이 덮어 씌워진다.
		 * 
		 */
		boolean bo;	//true 혹은 false 의 값만 저장할 수 있는 논리 자료형,1Byte
		char ch;			//ASCII Code혹은 Unicode로 문자(정수형태)를 저장하는 자료형,2BYte
		short sh;		//2byte정수
		int num;			//4byte정수, 정수의 대표자료형
		long ln;			//8byte정수
		float fl;			//4byte실수
		double db;		//8byte실수, 실수의 대표 자료형
		
		ch=65;
		fl=3;
//		num=3.14;			//자료형이 맞지 않다 double을 int 로 바꿀 수 없다.
		//영어 소문자로 시작하는 자료형을 Java의 기본 자료형(Primitive type)
		
		String name="아이티 뱅크";		//대문자로 시작하는 자료형 Class라고 한다.
//		class는 기본자료형을 이용하여 사용자가 직접 만들 수 있는 사용자 정의 자료형이다.
		
		System.out.println(name);	//자동으로 한줄 바꿈을 출력하는 함수
		System.out.printf(name);		//서식에 맞춰서 출력하는 함수
		System.out.print(name);		//줄 바꿈없이 출력하는 함수
		
		/*
		 * 변수: 값을 담을 수 있는 공간
		 * 함수: 어떤 기능을 포함하고 있는 코드의 묶음,name()
		 * 제어문: 프로그램의 흐름을 제어하는 구문
		 * 상수: 변수에 담지 않고 바로 사용하는 값, 프로그램 시작전에 미리 메모리에 로드된다.
		 */
	}

}
