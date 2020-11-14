package Interface_step;


/*
 * 
 * 1. 메서드의 형식을 지정하기 위해서 (여러 사람이 공동 개발을 할 경우에 메서드의 통일을 위해서)
 * 2. 서로 다른 클래스(부모클래스를 가지는 경우)의 자료형을 공통으로 묶어서 일괄 처리 하기 위해서
 * 
 * -	네트워크 통신, 다중 스레드 작업
 */



class Friend extends Man implements Companion{
	Friend(String name){
		this.name=name;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

class Animal {
	String name;
	}

class Man{
	String name;	
	
	Man(){}
	Man(String name){
		this.name=name;
	}
	void Give(Companion c) {
		System.out.print(this.name+"이 ");
		System.out.println(c.getName()+"에게");
		
	}
/*	void Give(Cat c1) {
		System.out.print(this.name+"이 ");
		System.out.println(c1.name+"에게 먹이를 던져줬다.");
	}
	
	void Give(Dog d) {		//매개변수가 다른 오버로딩
		System.out.print(this.name+"이 ");
		System.out.println(d.name+"에게 먹이를 던져줬다.");
	}*/
}//Man


class Cat extends Animal implements Companion{
	Cat(String name){//생성자
		this.name=name;
	}
	@Override
	public String getName() {
		return this.name;
	}
}
class Dog extends Animal implements Companion{
	Dog(String name){				//생성자
		this.name=name;
	}
	@Override
	public String getName() {
		return this.name;
	}
}

interface Companion{
	// 필드는 생성하지 않기( static final )
	//	name 필드를 반환하는 메서드 getName()를 형식 지정하기
	//	자식 클래스는 getName()을 구현하기
	//	Cat,Dog,Friend 이 Companion을 구현하도록
	
	public abstract String getName();
}

public class Ex01 {

	public static void main(String[] args) {
		Man kim = new Man("김수현");
		Cat c1 = new Cat("고양이");
		Dog d1 = new Dog("강아지");
		Friend f1 = new Friend("박명수");
		
		kim.Give(c1);
		kim.Give(d1);
		kim.Give(f1);
		kim.Give(f1);
						//1.f1객체는 Animal이 아니다.
						//2.Animal을 상속받도록 하고 싶어도, 이미 부모클래스가 있다.
						//3.Java는 다중 상속을 허용하지 않는다.
						//4.interface Companion을 생성하고
						//	Cat,Dog,Friend 이 Companion을 구현 하도록				
		//김수현이 강아지에게도 먹이를 줄 수 있도록 코드를 수정하세요
		//1.Dog 클래스를 정의
		//2.Man 클래스의  Give 메서드가 Cat도 매개변수로 받고 Dog도 받도록 
		//Overloading하세요 

	}

}
