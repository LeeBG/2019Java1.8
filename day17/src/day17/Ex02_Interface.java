package day17;

interface A{		//추상클래스의 한 종류, [일반적으로] 객체를 생성 할 수 없다.=>예외를 가짐
	int a=10;		//인터페이스의 모든 필드는  static final 속성을 가진다.
	void ShowA();	//인터페이스의 모든 메서드는 public abstract 속성을 가진다.
	
}//다중상속이 유일하게 허용된 자바의 클래스 중 하나
//class B extends A{}//The type A cannot be the superclass of B; a superclass must be a class

class B implements A{		//implements 키워드를 이용하여 구현(상속)한다.

	@Override
	public void ShowA() {		//부모클래스에서 public (A의 메서드public abstract에서)
		System.out.println("a : "+a);
	}
}
interface C{
	int c =20;
	void ShowC();
}
class D implements C,A{		//부모클래스가 interface인경우 다중상속 가능 

	@Override
	public void ShowA() {
		System.out.println("a : "+a);
	}

	@Override

	public void ShowC() {
		System.out.println("c : "+c);
	}
}

public class Ex02_Interface {

	public static void main(String[] args) {
		System.out.println("A.a : "+A.a);
		
//		static 이므로 객체없이 필드에 접근이 가능하다.
//		A.a =12; //final에의해서 초기값변경이 불가능 하다.
		
//		A ob1 = new A();	//Cannot instantiate the type A
		B ob2 = new B();
		ob2.ShowA();
//		C ob3 = new C();	//Cannot instantiate the type A(객체 생성 불가)
		D ob4 = new D();
		ob4.ShowA();
		ob4.ShowC();
	}
	

}
