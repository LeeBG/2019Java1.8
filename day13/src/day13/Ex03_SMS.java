package day13;

import java.util.Scanner;

class Phone{
	//서로 다른 폰 두대가 문자메시지를 주고 받는 형태를 객체간의 참조를 활용하여 
	//코드를 구현해 보세요 
		
	String name;				//문자 메시지를 참조할 수 있는 참조변수						
	String msg;					//필드를 생성할 떄, 기본 자료형 외 클래스 자료형도 사용이 가능하다
	Scanner sc;					//필드 혹은 매개변수로 클래스 자료형의 변수를 사용할 수 있다. 
	
	//데이터를 담는 것은 primitive =>데이터
	//reference 주소값
	Phone(String name){
		this.name =name;
		
	}//phone 생성자

	void getMsg(String msg,String Sender) {					//메시지와 보낸사람
		this.msg=msg;												//상대가 보낸 메시지를 내가 가지고 있는 메시지 함에 저장
		System.out.println("["+name+"]"+Sender+"이 보낸 메시지 : "+msg);
		System.out.println();

	}//getMsg
	
	
	void SendMsg(Phone target) {								//target 에게 메시지를 보내기 
		sc= new Scanner(System.in);
		System.out.print("["+name+"] 보낼 메시지 : ");
		String msg = sc.nextLine();								//입력받은 메시지를 
		target.getMsg(msg,name);								//대상의 getMsg를 호출하면서 같이 전달.
																		//보낸 사람(자신의 이름)도 전달
		
		
		//데이터는 하나이지만 주솟값을 계속 넘겨준다 
		//String 객체는 하나고 주소값만 계속 바꾸고 있는것 
		
	}//sendMsg

}//Phone class

public class Ex03_SMS {

	public static void main(String[] args) {

		
		Phone p1 = new Phone("입력");
		Phone p2 = new Phone("출력");
		while(true) {
		p1.SendMsg(p2);
		
		}//while
		//p1에서 입력받아서, p2에서 출력 할 수 있도록
	}//main

}//class
