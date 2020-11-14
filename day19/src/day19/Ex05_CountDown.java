package day19;

import java.util.Scanner;

class Timer{
	
//	시간을 입력받아서(초) 지정된 초만큼 카운트 다운 할 수 있는 객체를 구성
//	남은 시간을 표시할때의 형식: [04:59] <-
//	분과 초를 구분하기 위해서 /,% 연산
//	Thread.Sleep(1000)
	
	public static void Start() throws InterruptedException {
		int min=0;
		int second=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("시간을 입력 (초) : ");
		int sec = Integer.parseInt(sc.nextLine());
		for(int i=sec;i>=0;i--) {
			min=i/60;
			second=i%60;
			System.out.println(min+" 분: "+second+"초");
			Thread.sleep(1000);
			if(i==0) {
				System.out.println("시간 초과!!");
			}
		}
		sc.close();
	}
}


public class Ex05_CountDown {

	public static void main(String[] args) throws InterruptedException{
		
/*	
 * 		Thread.sleep(1000);	//CPU에게 1초간 일시정지를 전달하는 메서드
		
		int time =5;
		for(int i=time;i>=0;i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
*/
		Timer.Start();
		
		
	}

}
