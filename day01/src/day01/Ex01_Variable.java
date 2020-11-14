package day01;

public class Ex01_Variable {

	public static void main(String[] args) {
		
		
		char ch='A';		//변수의 선언 및 초기화 
		char ch2;			//변수의 선언
		//변수를 선언한다는 것은 메모리 공간을 생성한다는 말[자료형][변수이름];
		//변수를 선언 하면서 동시에 초기값을 할당 : 초기화 [자료형][변수이름]=[값];
		
		ch2 = 97;		
		//=>ASCII Code혹은 Unicode로 숫자값을 글자로 변환
		//American Standard Code Information Interchage 영문자 숫자 특수문자 키보드키값
		
		// char=2byte의 정수(글자를 표현하는 자료형)=>자바에서는 2byte C언어는 1byte
		// char=2byte의 정수(글자를 표현하는 자료형)=>자바에서는 2byte C언어는 1byte
		System.out.println("ch:" + ch);
		System.out.println("ch2:"+ ch2);
		
		
		short sh=32767;
		
		System.out.println("sh : "+sh);//(2byte크기의 정수 음/양 을 표현하는 자료형)
		//2byte=16bit
		
		//0111 1111 1111 1111
		
		//char 2byte short 2byte
		//char : 0~65535, 글자에는 음수가필요없으므로 unsigned자료형이다.
		//short : -32768 ~32767
		//4byte 크기의 정수를 표현하는 기본 자료형
		//-21억~+21억
		//자료형을 지정하지 않은 모든 정수를 int 로 간주한다(정수 대표자료형)
		int age=26;
		System.out.println("나이: "+age);
		
		long ln = 2200000000L;//내부적으로는 Int l이나L을 붙여줌
		//8바이트크기의 정수를 담을 수 있는 자료형
		//값을 대입할 때 마지막에 소문자 l이나 대문자L을 적어야 표현가능하다.
		
		float f1 =3.14f;
		//4byte크기의 실수를 표현하는 자료형
		double db=11.24;
		//8byte크기의 실수를 표현하는 자료형(실수의 기본 자료형)
	}//main끝

}//Ex01_Variable끝
