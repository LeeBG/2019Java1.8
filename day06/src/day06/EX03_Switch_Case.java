package day06;

import java.util.Scanner;

public class EX03_Switch_Case {

	public static void main(String[] args) {
		//
		
		
		Scanner sc=new Scanner(System.in);
		int input;
		
		System.out.print("주민번호 앞 7자리 입력  :" );
		input=sc.nextInt();
		
		switch (input%10) {
		case 9:
		case 1:
		case 3:
			System.out.println(" 남성입니다.");
			break;
		case 0:
		case 2:
		case 4:
			System.out.println("여성입니다.");
			break;
		default:
			System.out.println("값을 식별 할 수 없습니다");
			break;
		}
	}

}
