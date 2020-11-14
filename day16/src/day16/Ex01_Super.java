package day16;

class Parent{
	String name;
	
	Parent(){
		System.out.println("부모클래스 생성자 호출!!!");
	}						//			↑
	Parent(String name){	//			↑
		//this(); 가 숨어 있음				↑
		this();			//--------------↑
		this.name=name;
	}
}

class Child extends Parent{
	int num;
	 Child(){
		 //부모클래스의 생성자를 자동으로 호출한다.
		 System.out.println("자식클래스 생성자 호출!!!");
	 }//자동생성이 아님
	 Child(String name){
//		 this.name=name;
		 super(name);		//super는 부모클래스의 셍성자를 호출한다.
	 }
	 void ShowName() {
		 System.out.println("이름: "+this.name);
		 System.out.println("이름: "+super.name);
		 //name 필드는 부모클래스와 자식클래스가 공통적으로 보유하고 있으므로,this or super로 접근 가능
		 System.out.println(this.num);
//		 System.out.println(super.num);   ==>> 부모가 num을 가지고 있지 않기 때문에 
//		 num은 자식클래스만 보유하고 있으므로, 부모클래스를 가리키는 super키워드로는 접근할 수 없다
		 
	 }
}


public class Ex01_Super {

	public static void main(String[] args) {
		// 
		Child c1 = new Child("자식객체");	//자식객체를 생성하는데 부모클래스 생성자 호출
		c1.ShowName();
		
		
		
	
	}

}
