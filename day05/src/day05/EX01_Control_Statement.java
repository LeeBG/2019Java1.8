package day05;

import java.util.Scanner;

public class EX01_Control_Statement {

	public static void main(String[] args) {
		
		//제어문 : 프로그램의 흐름이나 분기를 제어하는 구문
		
		/*
		 * 1.조건문: if switch ~ case
		 * 				조건에 따라 실행 여부를 결정하는 구문	
		 * 
		 * 
		 * 2.반복문: while for do~while
		 * 				조건에 따라 지정된 횟수, 혹은 무한대로 반복을 실행하는 구문
		 * 
		 * 
		 * 3.분기문: break,continue,return
		 * 				조건에 상관없이 반복을 탈출하거나, 반복의 처음으로 되돌아가는 구문
		 */
		
		
		
		/*
		 * if(조건){
		 * 		실행문;
		 * }
		 * 
		 * 	실행문이 한 줄인 경우에는 {}블럭을 생략할 수 있다.
		 * 	조건에 따라서 조건이 참이면 실행문을 실행하고 
		 * 	거짓이면 실행문을 실행하지 않는다.
		 * 	조건절 바로 다음에 ;(세미콜론)을 작성하지 않는다!!
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age=Integer.parseInt(sc.nextLine());
		
		if(age>=20)
			System.out.println("성인입니다.");
		
		else	/*if(!(age>=20))*/
			System.out.println("미성년자입니다.");
		
		if(age>=25) {		//여러줄 ->중괄호{}를 묶어준다.
			System.out.println("당신은 25세 이상입니다.");
			System.out.println("1년에 적어도 한번 주기적으로 건강검진을 실시하시기 바랍니다.");
			System.out.println("감사합니다.");
		}
		System.out.println("정수 입력 : ");
		int n=Integer.parseInt(sc.nextLine());
		
		if(n==1) System.out.println("1");
		
		else if(n==2) System.out.println("2");
		
		else if(n==3) System.out.println("3");
		
		else	System.out.println("나머지 숫자");
		
		
		//==========================================
		
		// [연습문제] 세 과목의 점수를 입력받아 평균이 60점이상이면 합격 아니면 불합격
		
		int kor,eng,mat;
		double avg;
		System.out.print("국어 점수를 입력하세요 : ");
		kor=Integer.parseInt(sc.nextLine());
		System.out.print("영어 점수를 입력하세요 : ");
		eng=Integer.parseInt(sc.nextLine());
		System.out.print("수학 점수를 입력하세요 : ");
		mat=Integer.parseInt(sc.nextLine());
		
		avg=(kor+eng+mat)/3.0;
		
		System.out.printf("평균점수는  %.2f 점 이므로 .",avg);
		
		if(avg>=60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");

		}
		
		
	}

}
