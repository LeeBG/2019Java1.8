package day06;

import java.util.Scanner;

public class EX02_Switch_Case {

	public static void main(String[] args) {
		// Switch~Case : 하나의 변수에 대해서, 변수의 값이 무엇이냐에 따라서 코드의 흐름을 분기한다.
		
		
		Scanner sc = new Scanner(System.in);
		String txt;
//		
//		System.out.print("정수 하나를 입력하세요 : ");
//		num=Integer.parseInt(sc.nextLine());
//		
		System.out.print("문자를 입력하세요 : ");
		txt=sc.nextLine();
		
		switch(txt) {//num이라는 변수의 값이 
		
			case "itbank": //1일경우
				System.out.println("입력한 값는 itbank");
				break;
				//if (num==1)
			case "ITBANK": //2일경우
				System.out.println("입력한 값은 ITBANK");
				break;
				//else if (num==2)
			case "kgitbank": //3일경우
				System.out.println("입력한 값은 kgitbank");
				break;
				//else if (num==3)
			default://나머지 일 경우
				System.out.println("다른 문자입니다. ");
				//else
				
			}//switch의 이점: switch는 비교 한번만 함		//간단한 비교는 if보다 효율적임  하나의 값에 포커스
																		//자바만에서의 switch특징 문자열값도 별다른 기술 없이 비교가능하다.
			if(txt.equals("itbank"))
				System.out.println("if : itbank");
			
			System.out.print("================================================\n\n");
			
			// password 입력 : itbank
			// 성공 !! / 실패!!
			
			String str;
			System.out.print("비밀번호를 입력하세요 : ");
			str=sc.nextLine();
			
			switch (str) {
			case  "itbank":
				System.out.println("로그인 성공!!");
				break;
				//각 case의 마지막은 반드시 break;를 작성하여야 한다.
				//break => {}을 탈출
			default:
				System.out.println("로그인 실패!!");
				break;
			
				
			}  
			
			
			
		
			
			
	}//main

}//class
