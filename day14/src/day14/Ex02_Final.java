package day14;

class Test2 {

	int a = 10;
	static int b = 20;
	final int c = 30;
	static final int d = 40;
	private static final int e = 50;
	final int f; // 초기화

	Test2() {
		f = 60; // final 필드도 생성자에 의해서 초기화 하는게 가능
	}

	Test2(int f) {
		this.f = f;// 인자를 매개변수로 전달 받아서 멤버필드에 초기화 할 수 있다.
	}

	final void func1() {		//final 메서드
		//메서드의 내용을 변경할 수 없습니다
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("e : "+e);
		System.out.println("f : "+f);
		
	}
	//부모클래스가 물려줄때 Final속성으로 물려주면, 자식이 함부로 변경 할 수  없다.
	// static final 객체 안 만들어도 됨 클래스소속인데 값을 변경할 수 없다.
	// 상속에서 [오버라이딩]과 관련
	
	
	
	
	
}

public class Ex02_Final {

	public static void main(String[] args) {
		Test2 ob1 = new Test2(70); // 정수형 인자전달
		ob1.a += 1;
		ob1.b += 1;
//		ob1.c +=1;			// final 속성은 초기화 이후로 값을 변경할수 x
//		ob1.d +=1;			// The final field Test2.d cannot be assigned //final 값을 변경 할 수 없도록(초기화는 가능하나 이후 변경 불가능)
//		ob1.e +=1;			//접근 제한자 private : 외부에서 접근 할 수 없도록
		System.out.println("ob1.f  :  " + ob1.f);
		// 생성자에 의해서 초기화가 가능한지.????
		ob1.func1();
	}

}
