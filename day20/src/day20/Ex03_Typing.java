package day20;

import java.util.ArrayList;
import java.util.Scanner;

class Timer implements Runnable{
	private boolean End =false;
	
	public void timer() throws InterruptedException {
		for(int i=10;i>=0;i--) {
			System.out.println("\t\t 남은 시간 :"+i);
			Thread.sleep(1000);
			if((i%60)==0) {
				System.out.println("타임오버");
			}
		}
		End =true;
	}
	public boolean isEnd() {
		return End;
	}
	@Override
	public void run() {		//오버라이딩이므로 메서드의 형식은 부모와 같아야 하는데, 부모는 예외처리 Throws가 없어서
							//직접 try~catch해야한다.
		try {
			timer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class Input{
	private Timer t;
	Scanner sc = new Scanner(System.in);
	
	public void setT(Timer t) {
		this.t=t;
	}
	
	public void Start() {
		ArrayList <String> al = new ArrayList<String>();
		while(t.isEnd()!=true) {
			System.out.println("단어 입력 : ");
			String str = sc.nextLine();
			al.add(str);
		}
		System.out.println("\n\n지금까지 입력한 단어들 ");
		for(String str : al) {
			System.out.println(str+" ");
		}
	}
}
public class Ex03_Typing {

	public static void main(String[] args) throws InterruptedException {
		//10초의 카운트를 세어서 
		//10초동안 사용자에게 단어를 입력받고
		//10초가 지나면 지금까지 입력한 모든 단어를 띄워쓰기로 구분하여 출력하도록
		//Thread와 Runnable을 이용하요 코드를 작성하세요 
		
		Timer ob1 = new Timer();				//Runnable
		Thread th1 = new Thread(ob1);			//Thread의 생성자 매개변수로 전달
		Input ob2 = new Input();				

		ob2.setT(ob1);
		th1.start();
		ob2.Start();
		
	}

}
