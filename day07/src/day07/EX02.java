package day07;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		int num=1;
/*		
		System.out.println("num : "+num++);
		System.out.println("num : "+num++);
		System.out.println("num : "+num++);
		System.out.println("num : "+num++);
		System.out.println("num : "+num++);
		System.out.println("num : "+num++);
		System.out.println("num : "+num++);
		System.out.println("num : "+num++);
		System.out.println("num : "+num++);
		System.out.println("num : "+num++);
		
		*/
		while(num<=10)
			System.out.println("num : "+num++);
		Scanner sc = new Scanner(System.in);
		
		int input;
		Loop1: while(true) {			//			★★★★제어문 블럭에 Label을 할당 할 수 있다.★★★★

			System.out.print("정수 입력 :");
			input = Integer.parseInt(sc.nextLine());
			
			switch(input%2) {
			case 0:
				if(input==0)
					break Loop1;		//while문을 탈출 (제어문이 여러가지 겹칠때 Label을 이용하여 원하는 제어문 탈출가능 )
				
				System.out.println("짝수");
				break;		//switch의 break;
			case 1:
				System.out.println("홀수");
				break;
				
			}//switch
			
		}//while
		System.out.println("프로그램을 종료합니다.");
	}//main

}//class
