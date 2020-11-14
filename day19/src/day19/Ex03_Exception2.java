package day19;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{		//Exception : 모든 예외 클래스의 최 상위 클래스
	
	@Override
	public String toString() {
		return "범위에 맞게 점수를 넣지 않았습니다!!";
	}
}
public class Ex03_Exception2 {

	public static void main(String[] args) {
		/*
		 * 
		 * 	
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int score;
		try {
		System.out.print("점수입력(0~100) : ");
		score = sc.nextInt();
		if(0>score||score>100) 
			throw new MyException();			//내가 지정한 예외
			//throw 는 예외객체를 catch에게 전달 합니다.
		
		System.out.println("입력한 점수 : "+ score);
		}catch(InputMismatchException e) {
			System.out.println("자료형이 일치 하지 않습니다. 정수를 입력하세요 ");
		}catch(MyException e) {
			System.out.println(e.toString());
		}catch(Exception e) {//예외 클래스의 최상위 이므로, 나머지 모든 예외를 처리한다.
//			내가 미처 생각하지 못한 예외
			e.printStackTrace();
		}finally {
			sc.close();
		}
		System.out.println("프로그램 종료");
	}
}
