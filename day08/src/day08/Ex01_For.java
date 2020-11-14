package day08;

import java.util.Scanner;

public class Ex01_For {

	public static void main(String[] args) {
		/*
		 * int cnt = 0; while (cnt < 5) { //횟수에 의한 반복은 while로 표현 가능
		 * 
		 * System.out.printf("%d : Hello, world !!\n", cnt); cnt++; } // while
		 * System.out.println("\n\n");
		 * 
		 * for (int i = 0; i < 5; i++) { //횟수에 의한 반복은 for문으로 하는것이 더 편하다.
		 * System.out.printf("%d : Hello, world!!\n", i); } // for for (int i = 0; i <
		 * 5; i++) { //횟수에 의한 반복은 for문으로 하는것이 더 편하다.
		 * System.out.printf("%d : Hello, world!!\n", i); } // for cnt=0; for ( ; cnt<5
		 * ; ) { System.out.printf("%d : Hello, world!!\\n"); }
		 * 
		 * 
		 * for ( 1초기값 2조건식 4 증감식 ){ 3 실행문 }
		 * 
		 * 
		 * 
		 */
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.printf("1부터 10까지의 합은 : %d\n", sum);

		System.out.println();
		// 1에서 100사이의 홀수의 합과 짝수의 합을 구해서 출력하자
		int odd = 0;
		int even = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 1) {
				odd += i;
			} else {
				even += i;
			}

		}
		System.out.printf("홀수의 합 : %d 짝수의 합 : %d \n", odd, even);

		/*
		 * 1에서10정수 한줄에 출력하기
		 * 
		 */
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1);
		}

		/*
		 * A부터 Z까지의 알파벳을 한줄에 출력하기
		 * 
		 */
		System.out.println();
		char ch = 0;
		for (int i = 65; i < 91; i++) {
			ch = (char) i;
			System.out.print(ch);
		}
		System.out.println();
		for (ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
		/*
		 * A부터 Z까지의 알파벳을 한줄에 출력하기 문자사이에 ,를 붙이고 마지막에 , 없애기
		 */
		System.out.println();
		for (int i = 65; i < 91; i++) {
			ch = (char) i;

			if (i == 90) {
				System.out.print(ch);
				break;
			}

			System.out.print(ch + ",");

		}
		/*
		 * 정수 하나의 입력받아 1부터 입력받은 수까지의 합을 출력하는 코드
		 * 
		 */
		int input;
		int sum2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n정수를 입력하세요 : ");
		input = Integer.parseInt(sc.nextLine());
		if (input >= 0) {
			for (int i = 1; i < input; i++) {
				sum2 += i;
			}
			System.out.println("1부터 입력한 수까지의 합은 :" + sum2);
		}
		else {
			System.out.println("0또는 음수를 입력하였습니다.");
		}
		
		sc.close(); 			//Scanner 닫기
		/*
		 * 1 변수선언 또는 선언 된 변수 초기화 2 반복문 범위 3 실행 4 증감
		 */

		// 1 =>2 => 3=>4=>2 => 3=>4=>2 => 3=>4=>2 => 3=>4=>..........
	}// main

}// class
