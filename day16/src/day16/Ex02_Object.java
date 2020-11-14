package day16;
class Test{}	//부모클래스
class Test2 extends Test{
	@Override
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {//public은 넣어야함  object에서 public으로 오버라이딩
		return "내가 오버라이딩 한 메서드";
	}
	void Show() {
		System.out.println("고유기능");
	}
}	//자식 클래스

//자바는 클래스에 대해서 다중 상속을 허용 하지 않는다. //부모가 여럿일 수 없음
//자바의 모든 클래스의 최상의 클래스는  => Object 라는 클래스가 있음
//상속을 받지 않는 클래스는 => extends Object 가 있다고 생각해야함
//Object <= toString(); equals(args);
public class Ex02_Object {

	public static void main(String[] args) {
		Test ob1 = new Test();
		Test2 ob2 = new Test2();
			
		System.out.println("ob1 객체의 클래스 이름은 "+ob1.getClass().getSimpleName());
		System.out.println("ob2 객체의 클래스 이름은 "+ob2.getClass().getSimpleName());

		System.out.println("ob1.toString :"+ob1.toString());//객체의 클래스와 참조값을 반환
		System.out.println("ob2.toString :"+ob2.toString());
		
		Object [] arr = new Object[] {"문자열",new Integer(17),ob2,System.in};//자바에 존재하는 모든 객체를 다 받을 수 있음
		//메서드의 매개변수를 Object로 설정하면 모든 객체를 매개변수로 전달 받을 수 있다.
		//ob1.equals(ob2);
		System.out.println(ob2.toString());
		System.out.println(arr[2].toString());
		ob2.Show();
		
//		arr[2].Show();  고유기능은 부모클래스가 가지지 않으므로 자식클래스로 참조해야 실행가능
//		Casting 을 하기전 해당 자식클래스가 자식클래스가 맞는지 판별하는 연산자
//		A instanceof B : A객체가 B클래스로 생성된 객체인지 아닌지 판별하여 boolean값을 반환합니다.
		System.out.println("arr[2] instanceof String? :"+(arr[2] instanceof String));//arr[2]가 Object에 들어가 있기 때문 
		System.out.println("arr[2] instanceof Test2? :"+(arr[2] instanceof Test2));
		//UpCasting 업 캐스팅 : 객체가 다양한 타입들을 동시에 받기 위해 (서로다른 자료형을 한데 뭉쳐서 사용하고 싶을때 )
		//부모클래스가 참조하고있는 내용을 다시 자식클래스의 자료형으로 내려줘야할 때
		
		for(int i=0;i<arr.length;i++) {		//전체 배열중에서(비행기 탑승)
			if(arr[i] instanceof Test2) {	//해당 객체가 Test2의 자료형으로 생성된 객체라면(긴급상황시 탑승자중 의사를 찾음)		
				((Test2)arr[i]).Show();		//Down-Casting을 실행하여 자식 자료형으로 참조하고 고유기능 실행
			}
		}
		//자식 객체를 부모클래스로 참조: UP-Casting
		//UpCasting 된 객체를 다시 본래의 자식클래스로 참조 : Down-Casting
		//하나의 객체는 부모클래스로도 참조가 가능하고, 자식클래스로도 참조가 가능
		//하나의 객체가 여러가지 형태로 취급 될 수 있는 특징 : 다형성(Polymorphism)
		//다형성 : 하나의 객체가 여러가지 상황에 따라 다른 자료형 형태로 취급될 수 있음

	}

}
