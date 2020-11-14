package day15;

class Pos2D {		//2차원과 3차원의 좌표를 출력하는 작업에서 중복되는 부분이 있는지? yes
	int x;
	int y;
	public void ShowPos() {
		System.out.println("x : "+x);
		System.out.println("y : "+y+"\n");
	}
	public void func1() {}

}
class Pos3D extends Pos2D{		//Pos2D클래스를 상속받는 Pos3D를 만듦
	//부모클래스의 내용(클래스의 구성요소)
	//필드, 메서드 ㅣ  내용과 이름을 그대로 가져온다.
	//생성자 : 부모클래스와 자식클래스의 이름이 다르므로, 오버로딩된 경우 신경을 써야함.
	//접근 제한자 : 부모클래스에서 설정한 범위를 그대로 사용해야 한다.
		//메서드 오버로딩이가능 : 중복정의
		//메서드 오버라이딩 : 부모에게 물려받은 함수를 새로 재정의 하는과정
	int z;
	
	@Override//컴파일러에게 내가 해당 메서드를 오버라이딩 중이라고 알려줌
			//오버라이딩 규칙에 어긋나면 경고를 전달함.
	public void ShowPos() {				//Cannot reduce the visibility(가시성 접근제한자의범위) of the inherited method from Pos2D(접근제한자를 지웠을 때)
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("z : "+z+"\n");
	}
	//메서드의 접근 제한자와 봔환형, 함수이름, 매개변수의 형태는 동일하게 가져가나
	//내용이 다를 수 있다.(오버라이딩 : 물려받은 내용을 변경하는 것, 상속에서만 발생)
}
public class Ex01 {
	public static void main(String[] args) {
		Pos2D ob1 = new Pos2D();
		ob1.x=3;
		ob1.y=4;
		ob1.ShowPos();
		Pos3D ob2 = new Pos3D();
		ob2.x=11;
		ob2.y=12;
		ob2.z=14;		
		ob2.ShowPos();	
		
		
		/*	[student] is [parent]
		 * 	학생은 사람이다.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}
}
