package day09;

import java.util.Scanner;

public class Ex05_Making {

	public static void main(String[] args) {

		System.out.println("거꾸로 한 결과 값 : "+Reverse(1234));
		System.out.println(+Reverse(12345));
		System.out.println(+Reverse(1232321));
		System.out.println(+Reverse(1231442));
		//코드의 재사용성을 증가시킨다.
		
		System.out.println("다른 코드");
		System.out.println(Reverse(13542));
		
		//다른 함수와 연계해서 사용할 수 있다.
		//(10000+2345)를 구하여 그값을 뒤집어보자
		
		System.out.println(Reverse(Add(10000, 2345)));
		//연계작업이 가능하다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		String data1 = sc.nextLine();							//반환형 : String
		int data2=Integer.parseInt(data1);				
																		//입력값 : String 
																		//출력값 : Integer
		System.out.println("입력받은 수 : "+(data2 +1));
		
		
		
	}
	
	static int Add(int n1, int n2) {
		return n1+n2;
	}
	static int Reverse(int num) {	
		int ret=0;
		
		while(true) {
			ret+=num%10;
			num /= 10;
			ret*=10;
			
			if(num<10) {
				ret+=num;
				return ret;
			}
		
		}
	}//Reverse
	
}//class
