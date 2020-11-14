/*
		아래 결과를 만들어보세요

			[GALAXY S9]
			충전중...87%
	
			[USB 미니 선풍기]
			작동 시작 !!
	
			[USB STICK]
			용량 128 GB
			최대 전송속도 60MB/sec
		interface 필드 : static final (자동)
		interface 메서드 : public abstract (자동)
*/
package day17;
		// 2. 각 클래스가 인터페이스를 구현(상속)하도록 설정
class USB_Stick implements USB{

			@Override
			public void Act() {
				String Fan ="USB STICK";
				System.out.println("["+Fan+"]");
				System.out.println("용량 128GB");
				System.out.println("최대 전송속도 60MB/sec");
			}
	
}		// USB 메모리 스틱
class USB_Fan implements USB{

	@Override
	public void Act() {
		String Fan ="USB 미니 선풍기";
		System.out.println("["+Fan+"]");
		System.out.println("작동 시작 !!");
	}
	
}		// USB 미니 선풍기
class USB_Cable implements USB{

	@Override
	public void Act() {
		String phone="갤럭시 S9";
		System.out.println("["+phone+"]");
		System.out.println("충전중...87%");
	}
}				// USB 휴대폰 케이블


interface USB{	// 인터페이스 USB	//인터페이스의 메소드는  public abstract 
	public abstract void Act();
}		

		//1.반응을 정의할 메서드의 형식을 지정

class PC{			// PC
	public static void Connect(USB u) {		//부모클래스의 USB.act
		u.Act();
	}	// USB형태를 연결할 수 있는 컴퓨터 기능
		// 3.연결하면 device에 정의된 메서드를 호출
}

public class USB_Quiz {
	public static void main(String[] args) {
		
		USB_Cable u01 = new USB_Cable();
		USB_Fan u02 = new USB_Fan();
		USB_Stick u03 = new USB_Stick();
		
		PC.Connect(u01);		// 연결하자마자 반응이 나오도록 만들기
		PC.Connect(u02);		// 메인메서드에는 추가 내용 작성 없음
		PC.Connect(u03);		
		
		USB u04 = () -> System.out.println("Mouse 연결!!");
		PC.Connect(u04);
		
		//일반적으로 인터페이스는 객체를 생성 할 수 없었으나
		//함수형 인터페이스(인터페이스가 다른 멤버요소없이 단 하나의 메서드만 가지는 경우)
		//에는 람다식을 이용하여 객체를 생성할 수 있다.
		//해당 인터페이스가 가지는 하나의 메서드의 내용만 지정하여 객체를 생성
		//자바1.8부터 추가된 요소 (인터페이스가 다른 메서드가 없는 하나의 메서드만을 가질 때  )
		
		
		//동물 식물 
	}
}

