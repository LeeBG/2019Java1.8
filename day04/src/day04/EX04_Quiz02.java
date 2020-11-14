package day04;

import java.util.Scanner;

public class EX04_Quiz02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		int b;
		int result=0;	// 정답
		System.out.print("A를 입력하세요  :");
		a=Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력하세요  :");	
		char ch=sc.nextLine().charAt(0);		
		System.out.print("B를 입력하세요  :");
		b=Integer.parseInt(sc.nextLine());		
		sc.close();	//닫기
		
		
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%') {
			if(ch=='+') {
				result=a+b;
			}
			else if(ch=='-') {
				result=a-b;
			}
			else if(ch=='*') {
				result=a*b;
			}
			else if(ch=='/') {
				result=a/b;
			}
			else {
				result=a%b;	
			}
		}
		else {
			System.out.println("연산자가 아님");
			System.exit(0);
		}
		System.out.printf("%d%c%d = %d",a,ch,b,result);
		}
}
