package day19;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Ex02_Exception {
	//자바에서는 exception도 하나의 클래스
	

	public static void main(String[] args) {
		// Exception : 예외 프르그래머의 코드수정 및 보완으로 예방 가능한 문제
		// Error : 프로그램의 코드상으로 수정하기 힘든 문제

		
		int[] arr = new int[] { 10, 20, 30 }; // 길이가 3으로 고정인 배열
//		System.out.println(arr[3]);	//index : 3          0,1,2,3
//		java.lang.ArrayIndexOutOfBoundsException
		
		int a = 10;	
		System.out.printf("%d + %d = %d\n", a, 2, a + 2);
		System.out.printf("%d * %d = %d\n", a, 0, a * 0);
		
//		System.out.printf("%d + %d = %d\n", a, 0, a / 0);		//0으로 나눈다.
//		java.lang.ArithmeticException: / by zero
		
		String str =null;
//		System.out.println("문자열의 길이 : "+str.length());
//		java.lang.NullPointerException
		
		
		//try ~ catch : try 블럭 안에 있는 내부의 코드를 실행 할 때 어떤 예외가 발생하면 catch에서(){}정해진 예외를 감지하고 
		//catch{}내의 처리를 수행
		//예외가 발생하지 않으면 catch는 실행되지 않는다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		try {
			int num;
			num=sc.nextInt();
			System.out.println("입력한 정수는 "+num);
		}
		catch(InputMismatchException e) {		//catch에서 ()에 어떤 예외가 발생하는지 Type(class)를 명시
//			catch가 확인하면 e 라는 예외 객체가 try에서 생성 되었으므로 객체를 활용할 수 있습니다.
//			예외가 발생한다는 것은 객체가 생성된다는 것
			System.out.println("예외가 발생했습니다 !!");
			System.out.println("입력을 올바르게 하지 않았습니다!!");
//			e.printStackTrace();	//예외라는 객체에 이미 정의되어있다.
			//e.printsStackTrace();
		}finally {
			//	예외 발생 여부에 상관 없이 반드시 실행해야할 코드
			
			sc.close();
			//주로 마무리 지어야 할 코드를 작성한다.
		}
		
		System.out.println("프로그램이 종료 되었습니다.");
//		예외처릴를 안하면 중간에 중단이 됨 "프로그램이 종료되었습니다"가 안뜸
		
		
		
		
//		java.util.InputMismatchException
		
		
		


	}

}
