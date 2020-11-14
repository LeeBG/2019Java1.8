package day04;

import java.io.IOException;
import java.util.Scanner;

public class EX03_Quiz {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		
//		char ch=(char) System.in.read();
		System.out.print("한글자 입력 : ");
		char ch=sc.nextLine().charAt(0);//nextLine에서 받은것들String베열 중 0번째 한글자를 추출하여 char ch 에 담는다
		System.out.println("ch : "+ch);
		//if
		//삼항연산자 중복
		/*
		if(ch=='+') {
			System.out.println("+입니다.");
		}
		else if(ch=='-') {
			System.out.println("-입니다.");
		}
		else if(ch=='*') {
			System.out.println("*입니다.");
		}
		else if(ch=='/') {
			System.out.println("/입니다.");
		}
		else if(ch=='%') {
			System.out.println("%입니다.");	
		}
		else {
			System.out.println("연산자 기호가 아닙니다.");
		}
		*/
		boolean flag =(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%');
		System.out.println((flag)?"연산자 기호가 맞습니다":"연산자 기호가아닙니다.");
		flag=(ch=='+');
		System.out.println((flag)?"+가 맞습니다":"+가아닙니다.");
		flag=(ch=='-');
		System.out.println((flag)?"-가 맞습니다":"-가아닙니다.");
		flag=(ch=='*');
		System.out.println((flag)?"*가 맞습니다":"*가아닙니다.");
		flag=(ch=='/');
		System.out.println((flag)?"/가 맞습니다":"/가아닙니다.");
		flag=(ch=='%');
		System.out.println((flag)?"%가 맞습니다":"%가아닙니다.");
		sc.close();
		
	}

}
