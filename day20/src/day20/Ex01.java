package day20;

class A extends Thread{
	//Thread라고 정의되어있는 클래스의 모든 내용을 상속 
	@Override			//run의 내용을 새롭게 재 구성
	public void run() {// 다중작업으로 [실행]할 내용을 작성합니다.
		for(int i=0;i<100;i++) {
			System.out.print(i+" ");
		}
		
	}
}

//인터페이스 => 다중상속을 깰 수 있음.

public class Ex01 {

	public static void main(String[] args) {
		// Thread : 하나의 프로그램이 다중작업을 처리할 수 있도록하는 프로그램의 실행단위
		
		A ob1 = new A();
//		ob1.run();		//run은 실행할 내용을 오버라이딩으로 작성만 하는 메서드
		ob1.start();	//run에 작성된 내용대로 [start()를 호출 해야 별개의 스레드로 작동]된다.
		for(char ch ='A';ch<='Z';ch++) {
			System.out.print(ch+" ");
		}

	}

}
