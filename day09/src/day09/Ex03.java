package day09;

public class Ex03 {

	static int Add(int n1,int n2) {
		return n1+n2;
	}//Add
	
	/*C언어의 처리
	 * static double Add2(double d1 , double d2){
		double d1+d2;
	}*/

	static double Add(double d1 , double d2) {
		return d1+d2;
	}//Add
	
	//3개의 정수의 합을 반환하는 함수 Add를 작성
	
	static int Add(int x,int y,int z) {
		return x+y+z;
	}//Add
	
	//자료형과 매개변수의 갯수가 일치하는 정의가 이미 만들어져 있으면 생성할 수 없다.
	
	/*
	static float Add(double v1 , double v2) {
		//반환형도 다르고 매개변수의 이름도 다르지만 , 이런 요소는 오버로딩의 기준이 아니다.
		//오버로딩의 기준 : 매개변수의 자료형, 갯수
	}
	*/
	
	//하나의 함수 이름에 여러가지 정의를 만들어 두는 것
	//=>함수의 오버로딩(JAVA)
	/*
	 * 하나
	 */
	
	//매개변수의 갯수가 다르거나 자료형이 다르면
	public static void main(String[] args) {
		System.out.println("2+5 = "+Add(2,5));
		System.out.println("1.2 + 2.3 = "+Add(1.2,2.3));
		System.out.println("1+2+3 = "+Add(1,2,3));
	}//main

}//class
