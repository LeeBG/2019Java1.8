package day14;

class Pos2D{
	private int x;
	private int y;
	
	public Pos2D() {
		System.out.println("객체를 생성했습니다 !!");		//공통처리부분이 여러줄이면
		x=-9;										//생성자 마다 작성하면 효율이 떨어진
		y=-9;
	}
	public Pos2D(int x,int y) {
//		System.out.println("객체를 생성했습니다 !!");
//		Pos2D();		// 생성자 내부에서는 자기자신의 이름을 사용x
		this();			// 생성자 내부에서 또 다른 생성자를 호출할때 this()를 사용한다.
						// this()는 각 생성자의 첫번째 줄에서만 호출이 가능
		this.x=x;
		this.y=y;
	}
	
	//this.멤버	(필드 메서드)
	//this() 	(또 다른 생성자 호출)
	//this   	(객체 자기자신을 메서드의 인자값으로 전달하고 싶을 때)
	
	public void showPos() {
		System.out.println("x :"+x);
		System.out.println("y :"+y);
		System.out.println();
	}
}

public class Ex04 {
	public static void main(String[] args) {

		Pos2D ob1 = new Pos2D(3,4);
		Pos2D ob2 = new Pos2D();
		
		ob1.showPos();
		ob2.showPos();
	}

}
