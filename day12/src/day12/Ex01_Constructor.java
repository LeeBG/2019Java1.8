package day12;



class Human{
	String name;			//클래스 멤버 필드 (초기값을 안줘도됨)
	int age;			//필드에 초기값을 할당 가능하지만 모든 객체가 같은 값을 가진다
	String gender;			//파란색 => 클래스 내부에서 접근 가능한 클래스 변수
	
	void Profile() {			//필드의 값을 출력해주는 메서드
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+gender+"\n");
	}
	Human()	{	//기본 생성자, 굳이 작성하지 않아도 JVM이 만들어 줌 
		
		//생성자 클래스와 이름이 같고 반환형이 존재하지 않는 [매서드] (void 조차 없음)
	}
	
	Human(String name, int age, String gender){
		//생성자 오버로딩
		this.name = name;			//클래스 필드name에 매개변수 name의 값을 대입			내가 전달한 값으로 초기화
		this.age=age;					//(함수기준에서 입력값을)클래스의 필드에 대입한다.
		this.gender=gender;			//전달반은 name age gender를 내가가진 필드  name age gender에 대입
		
		//this : 클래스 혹은 객체 자기 자신을 가리키는 참조변수 여기서는 객체의 형태로 사용하고 있음
	}
	
	Human(String name,String gender){
		this.name=name;
		this.gender=gender;
		this.age=0;
	}
	
	
}

public class Ex01_Constructor {


	public static void main(String[] args) {
		
		Human h1 = new Human();				//객체		Human(): => 함수의 기능을가지고 클래스의 이름과 같은 생성자
		h1.Profile();		//출력
		/*
		 * 이름 : null					필드의 값은 자동으로 초기화
		 * 나이 : 0
		 * 성별 : null
		 */
		
		 h1.name="박지성";			//객체 생성 이후 필드의 값을 세팅 해 주어야 한다.
		 h1.age=37;
		 h1.gender="남성";
		 
		 h1.Profile();
	
		 Human h2 = new Human();	//생성자 호출(Call)
	

		 h2.name="이병길";			//값을 일일이 넣어주기가 불편하므로 
		 h2.age=24;						//생성자를 활용하여 초기값을 지정
		 h2.gender="남성";			
		 h2.Profile();
	
		 //이때 h1 h2는 서로다른 객체로 다른 
		 
		 //생성자 활용하기
		 Human h3 =new Human("이지은",27,"여성");
		 h3.Profile();
		 
		 Human h4 = new Human("이름","성별");
		 h4.Profile();
	}
	

}
