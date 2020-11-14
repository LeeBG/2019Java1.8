package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class EX03_Scanner {

	public static void main(String[] args) throws IOException {			//입출력에서의 예외를 던진다.(운영체제에게 떠넘겨라)
		
		// 사용자가 프로그램에 값을 입력할 때에는 여러가지 예외가 발생 할 수 있다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//입력받을 수 있는 객체 br을 생성
		
		/**
		 * System=> in(받는 통로), out(출력 통로), error(문제발생시 에러출력통로)
		 * InputStreamReader 1Byte---2Byte
		 * 버퍼에서 메모리 째로 읽어 여러 덩어리로 합침 => BufferedReader
		 */
		String name;
		
		System.out.println("이름을 입력하세요.");
		name = br.readLine();//사용자가 Enter칠 때까지의 것들을 읽어 한줄단위의 입력을 받는다.
		
		System.out.println("이름 : "+name);
		
		System.out.println("===============================================");
		
		Scanner sc = new Scanner(System.in);			//대문자로 시작하는 자료형들은 CLASS자료형
		//1byte->2byte->줄단위 입력이 내장되어 처리되고 입출력 관련 예외 처리도 내장되어 있다.
		System.out.println("이름을 다시 입력하세요 ");
		name = sc.nextLine();									//사용자에게 입력을 받아서 Enter값 까지의 내용을 전달(반환) => String 의 형태로 전달
		System.out.println("새로 입력한 이름 "+name);
		
		int age;
		System.out.println("나이를 입력하세요 : ");
		age=sc.nextInt();//사용자에게 정수를 입력받아서 전달
		System.out.println("나이 : "+age);
	}

}
