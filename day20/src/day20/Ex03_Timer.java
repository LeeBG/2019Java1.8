package day20;

import java.util.Scanner;

class Quiz implements Runnable {

	Scanner sc= new Scanner(System.in);
	Timer2 t2= new Timer2();
	@Override
	public void run() {
		System.out.println("====================");
		System.out.println("다음중 자바의 구성요소가 아닌것은?");
		System.out.println("1. 클래스");
		System.out.println("2. 접근 제한자");
		System.out.println("3. 쓰레기수집");
		System.out.println("4. 포인터");		//자바에서 사용x
		System.out.println("5. 생성자 오버로딩");
		while(t2.isEnd()!=true) {
			System.out.print("정답 :");
			int ans = Integer.parseInt(sc.nextLine());
			if(ans==4) {
				t2.setEnd(true);
			}
		}
		//Timer가 끝났는지 아닌지 확인(끝이면 정답을 입력해도 오답으로 처리하도록)
	}
	public void setT2(Timer2 t2) {
		this.t2 = t2;
	}

}
class Timer2 implements Runnable{//Thread로 작동시키기

	private boolean End =false;
	
	public void timer() throws InterruptedException {
		for(int i=10;i>=0;i--) {
			System.out.println("\t\t 남은 시간 :"+i);
			Thread.sleep(1000);
			if((i%60)==0) {
				System.out.println("타임오버");
			}
			else if(End==true) {
				System.out.println("정답");
				break;
			}
		}
		End =true;		//끝남
	}
	@Override
	public void run() {
		try {
			timer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isEnd(){
		return End;
	}
	public void setEnd(boolean end) {
		End = end;
	}
	
}

public class Ex03_Timer {
	public static void main(String[] args) throws InterruptedException {

		Timer2 t= new Timer2();
		Thread th = new Thread(t);
		Quiz q= new Quiz();
		
		Thread.sleep(50);
		q.setT2(t);
		th.start();
		q.run();
		
	}

}
