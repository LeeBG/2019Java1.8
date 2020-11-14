package day06;

import java.util.Scanner;

public class Ex04_Menu {

	
	public static void main(String[] args) {
		
		// 
		Scanner sc = new Scanner(System.in);
		
		int menu=0;				//int의 기본 초기값.
		String word = null;		//String 의 기본 초기값은 null, reference type은 null을 기본초기값으로 사용
		
		
		while(true) {
		
		System.out.println("===메뉴 구현하기 ===");
		System.out.println("1.돈까스");
		System.out.println("2.라면");
		System.out.println("3.쌀국수");
		System.out.println("4.짬뽕");
		System.out.println("5.국밥");
		System.out.println("0.종료");
		System.out.print("메뉴를 선택하세요 : ");
		
		menu=Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 0:
			return;	//현재 실행중인 함수를 종료하는 제어문
		case 1:
			word="돈까스";
			break;
		case 2:
			word="라면";
			break;
		case 3:
			word="쌀국수";
			break;
		case 4:
			word="짬뽕";
			break;
		case 5:
			word="국밥";
			break;				//다음줄을 실행하지 않고 빠져나간다
		default:
			System.err.println("메뉴를 잘못 입력하셨습니다.");
		
		}
		if (!(word ==null)) {
			System.out.println("선택한 메뉴는 "+word+"입니다.");
		}
		
		}//while
		
		
		/*
		 * 		변수선언
		 * 		제어문 안에 또 다른 제어문 사용가능
		 * 	
		 * 		while(true){
		 * 				메뉴 출력
		 * 				입력
		 * 				switch(변수){
		 * 					case 값1: 실행문; break;
		 * 					case 값2:
		 * 						 실행문1;
		 * 						 실행문2;
		 * 		 				 break;
		 * 					default:
		 * 					}
		 * 		}//end of while
		 */
		
	}//main

}//class
