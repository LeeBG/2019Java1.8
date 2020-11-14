package day02;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//[자료형][변수이름]=[값];
		//자료형을 몰라서 빨간줄이 그어짐
		//빨간줄에 마우스를 올려놓고 import Scanner(java.util)
		
		//Scanner라고 하는 자료형을 가져와서 Scanner형태의 sc변수(객체)를 생성하고
		//시스템 입력을 기반으로 하는 새로운 스캐너를 대입한다.
		
		String name;
		int age;
		String address;
		
		System.out.print("이름을 입력하세요 : ");
		name=sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println(name+"님의 나이는"+ age+"살 입니다.");		//\r \n빼고 숫자만 가져감
		
		System.out.print("주소를 입력하세요 : ");		//\r \n
		address = sc.nextLine();
		
		System.out.println("주소는 "+address+"입니다.");
		
		/*
		 * 자바안에서는 문자열 안에 NULL을 쓰지 않는다.
		 * 
		 * 
		 * nextLine() 이외의 입력으로 받은 이후
		 * 다시 nextLine()을 한번 미리 사용한다.
		 * nextLine()을 한번 미리 사용한다.
		 * 
		 * 
		 * '\r' : Carrige Return, 커서를 줄의 맨 첫칸으로 이동시킨다. ASCII 13
		 * '\n': New Line, 커서를 다음 줄로 이동시킨다, ASCII 10
		 * 
		 * 
		 */
		sc.close();//열려있는 입력 통로를 닫고 스캐너를 마무리한다.                                                                  
	}

}
