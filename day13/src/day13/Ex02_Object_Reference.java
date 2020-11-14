package day13;

class Kid { // 클래스는 자료형
	String name;
	Ball b;						//Ball 형태를 참조할 수 있는 변수

	Kid(String name) {
		this.name = name;
	}

	void getBall(Ball b) {
		this.b = b;				//어딘가에 있는 공을 내 공으로 지정한다. 
	}
	
	
	void throwBall(Kid target) {			//대상을 지정하여 
		target.getBall(b);					//대상에게 내 공을 가지게 한다.
		b=null;	//내공은 없다			// 변수는 값이 복사되므로, 내 공은 없는 것으로 처리
	}
	
}// Kid 끝

class Ball {
} // 클래스는 자료형

public class Ex02_Object_Reference { // 객체 참조

	public static void main(String[] args) {
		
		Kid k1 = new Kid("스티브");
		Kid k2 = new Kid("토니");
		Ball b = new Ball();
		
		k1.getBall(b);			//스티브가 공을 주웠다.
		k1.throwBall(k2);    	//스티브가 토니에게 공을 던집니다.(암묵적으로 토니가 공을 받았다)
		System.out.println("스티브가 공을 가지고 있는가 ? : "+(k1.b != null));
		System.out.println("토니가 공을 가지고 있는가 ? : "+(k2.b != null));
		System.out.println();
		
		k2.throwBall(k1);
		System.out.println("스티브가 공을 가지고 있는가 ? : "+(k1.b != null));
		System.out.println("토니가 공을 가지고 있는가 ? : "+(k2.b != null));
		System.out.println();
	}//main

}//class
