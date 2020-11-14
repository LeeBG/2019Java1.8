package day20;
class Parent{}
class Child extends Parent implements Runnable{//Thread의 내용을 interface로 구현

	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.print(i+" ");
		}
		
	}
	//Thread를 구성하여 작동시킬 클래스
	

}
public class EX02_Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ob1 = new Child();
		Thread th1 = new Thread(ob1);//생성자의 매개변수로 전달
//		=>> thread클래스는 생성자 오버로딩이 되어있다
//			Thread() / Thread(Runnable arg)
		th1.start();
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+" ");
		}
		//Thread는 동시다발적인 작업을 처리할 때
		//EX) 정해진 시간내에 본인인증
	}

}
