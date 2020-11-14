package day17;

abstract class AB{			//abstract class : 추상 클래스, 추상 메서드를 포함하다. 존경
	int a;
	int b;
	public abstract int Result();//abstract method : 추상 메서드 , 정의가 없고 형식만 존재
}
class Child extends AB{			//Result의 내용을 만드는 역할

	@Override
	public int Result() {		//상속받은 추상메서드는 [내용]이 달라도 된다.
		
		return a+b;				//int 형이기때문에 int형 반환
		
	}	//추상클래스를 상속받는 자식클래스는 의무적으로 추상 메서드를 오버라이딩 해야합니다.
	
}
class CD extends AB{
	@Override
	public int Result() {		//상속받은 추상메서드의 [형식]은 같아야 한다.
		return a*b;
	}
}
public class Ex01_Abstract {
	public static void main(String[] args) {
	// AB ob = new AB();	//추상클래스는 내용이 구체적이지 않으므로 객체를 생성 할 수 없다.
							//추상클래스는 상속받는 자식 클래스가 추상 메서드를 정의하여 
							//오버라이딩하고 객체를 생성한다.
		Child ob1 = new Child();
		CD ob2 = new CD();
		
		ob1.a=10;
		ob1.b=20;
		ob2.a=11;
		ob2.b=22;
		
		AB [] arr = new AB[] {ob1,ob2};
		
		for(AB tmp : arr) {//for(int i=0;i<arr.length;i++){(arr[i]==tmp)}
			System.out.println(tmp.Result());
		}
		
		
		
		
		//실제로 존재 하지 않는 내용까지 만들어 내는 객체
	}

}
