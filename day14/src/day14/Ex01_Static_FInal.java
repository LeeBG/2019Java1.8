package day14;

class Test{
	String field1;
	
	public void Method1() {
		
	}
	int v1;				//non static
	static int v2;			//static
	
	public void func1() {		//non static 일반 메서드
		System.out.println("v1  : "+v1);
		System.out.println("v2  : "+v2);
		func3();		//func1()이 실행 되어있다는것 load되어 있다.
	}
	public static void func2() {		//static 멤버필드나 멤버메서드에 특수한!@@@
//		System.out.println("v1  : "+v1);    Cannot make a static reference to the non-static field v1
		System.out.println("v2  : "+v2);
	}//값에 접근 하려고 할떄 static method에서 non-static필드를 참조 할 수 없다.
	public static void func3() {
		func2();
	}
	/*
	 * static 키워드가 붙으면 객체 소속이 아니라 클래스 자체의 소속이 된다.
	 *	1, 객체를 생성하지 않아도 멤버에 접근할 수 있따.
	 *	2. 객체마다의 값이 아니므로,			<<<모든 객체들이 같은 값을 공유하게 된다.>>>
	 *	3. 생성(메모리에 로드되는) 시점이 서로 다르기 때문에,[static]-[non-static]
	 * 		서로 참조 할 경우 조심
	 * = 이클립스에서는 static 속성을 가지는 멤버는 Italic(기울임꼴)으로 표기
	 */
	
	// 자바 소스 실행  - 컴파일(바이트 코드) - 자바 가상머신(기계어 변환) - 실행
	// 소스 코드 내의 import, class (static 속성을 가진 멤버도 같이 생성)			< 이 시점에서 일반 함수들은 생성 x
	// 메인 메서드를 찾아서 실행 - 객체 생성 - 멤버 필드 , 멤버 메서드 생성(non-static)
	
}

public class Ex01_Static_FInal {

	public static void main(String[] args) {
		//클래스는 자료형(설계도)이고 
		//객체를 생성해야 내부 멤버 접근이 가능하다
		
		Test ob1 = new Test();
		ob1.field1 = "Test";					//갹체.필드
		ob1.Method1();							//객체.메소드
		
		int num = Integer.parseInt("122")+1;		//Integer => 클래스 객체생성을 따로 하지않아도 사용가능한 이유 static
		System.out.println("num : "+ num);
		//객체없이, 클래스에 의해서 멤버 필드와 메서드에 접근 해 보기
		System.out.println(Test.v2);
		Test.func2();			//Integer.parseInt()와 같은 호출 형식
		//클래스.멤버
		
		Test ob2 = new Test();
		Test ob3 = new Test();
		Test ob4 = new Test();
		
		Test.v2 = 70;
		ob2.func2();				// The static method func2() from the type Test should be accessed in a static way 
		ob3.func2();				// Static 응 객체로 참조해도 참조 할수 있지만 클래스로 참조하길 바란다. (ex)) Test.func2();)
		ob4.func2();
		Test.func2();
		

		Test.v2 = 33;
		ob3.func2();			
		ob4.func2();
	}

}
