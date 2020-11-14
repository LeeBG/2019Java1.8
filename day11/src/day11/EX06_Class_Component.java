package day11;


class Test{		//JAVA에서는 총5가지의 클래스 구성요소가 존재한다.
	//Field : Data를 저장 할 수 있는 공간(변수)
	
	String name;
	private int score;				//접근 제한자 : 클래스 내부의 값에 접근 할 수 있는 범위를 제한
	double avg;						//private는 비공개(내부에서는 접근 가능) ,public 공개
	
	//Method : Data를 이용하여 처리할 수 있는 코드들의 집합, 함수
	
	void Func() {
		score=100;					//내부에서는 접근 가능
	}
	
	//Constructor : Class의 형태대로 객체를 생성하는 함수, 생성자 클래스마다 하나씩 가지고 있다
	
	Test(){	//함수인데, 클래스의 이름과 같고 반환형이 존재하지 않는 함수
				//객체 생성, 클래스에 정의된 필드 생성, 매서드 연결
				//클래스 작성시 정의하지 않으면, 자바가상머신이 자동으로 작성해 준다.
		System.out.println("객체 생성!!");
	}
}//Test클래스 끝

//1필드2매서드3생성자(클래스의 정의대로 객체를 만들어내는 함수)4.필드에는 접근 범위 설정private public
//함수는 public으로 설정하는 것이 일반적 필드는 private가 일반적 5.
public class EX06_Class_Component {

	public static void main(String[] args) {
			Test ob1 = new Test();
//			ob1.score=100;				//private 설정된 값에는 외부에서 접근 불가
			ob1.avg=95.33;				//public은 외부에서도 접근 가능  class기준
			System.out.println("name : "+ob1.name);
			//초기화도 진행 되어있지 않았는데 이미 초기화 null로 되어있다?????
			//Garbage collector
			//1.필드가 초기화 되지 않았다면, 자료형에 맞는 값으로 초기화합니다. 
			//2.참조되지 않는 객체를 자동으로 소멸시킨다.(메모리 관리)  알아서 지워줌
			//3.생성자의 자동 생성, 기타 자동으로 처리하는 내용을 관리해 준다.

	}

}
