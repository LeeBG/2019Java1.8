package day12;

import java.util.Scanner;

class TV{
	//TV의 속성값(전원, 채널 볼륨)을 필드로 정의
	//TV의 기능(On/Off, 필드의 값을 조정)을 매서드로 정의
	//각 성격에 맞는 접근 제한자
	//getter setter
	public boolean turn;
	private int chan;
	private int vol;
	

	public int Vol_Up() {
	if(vol>=0&&vol<20) {
		vol++;
		System.out.println("볼륨을 올립니다 : "+vol);
	}
	else if(vol>=20){
		vol=20;
		System.out.println("볼륨을 올립니다 :"+vol);
	}
		return vol;
	}
	public int Vol_Down() {
		if(vol>0) {
			vol--;
			System.out.println("볼륨을 내립니다 : "+vol);
			if(vol==0) {
				System.out.print("---음소거---\n");
			}
		}
		return vol;
	}
	public int chan_Up() {
		
		if(chan>=1&&chan<999) {
			chan++;
			System.out.println("채널을 올립니다 : "+chan);
		}
		else {
			chan=1;
			System.out.println("채널을 올립니다 : "+chan);
		}
		return chan;

	}
	public int chan_Down() {
		if(chan>1&&chan<=999) {
			chan--;
			System.out.println("채널을 내립니다 : "+chan);
		}
		else if(chan<=1) {
			chan=999;
			System.out.println("채널을 내립니다 : "+chan);
		}

		return chan;
	}
	
	public int getChan() {
		System.out.println("채널을 설정합니다 : "+chan);
		return chan;
	}
	
	public void setChan(int chan) {
	
		this.chan = chan;
	}
	
	
	public boolean On_Off() {
		this.turn=!(turn);
		
		if(turn==true)
			System.out.println("전원이 켜졌습니다.");
		else
			System.out.println("전원이 꺼집니다.");
			
		return turn;
	}
	public void show() {
		if(turn==true) {
			System.out.println("=======");
			System.out.println("  ch : "+chan);
			System.out.println("  vol : "+vol);
			System.out.println("=======");
		}
		else if(turn==false){
			System.out.println("//////////////");
			System.out.println("//////////////");
			System.out.println("//////////////");
			System.out.println("//////////////");
		}
	}
		
	TV(){
		this.turn=true;
		this.vol=1;
		this.chan=8;
	}
}
public class Ex05_TV {

	public static void main(String[] args) {
	
		int remote;															// 리모컨 메뉴
		
		System.out.println("초기에 TV가 켜져있습니다. ");
		TV tv1 = new TV();
		Scanner sc = new Scanner(System.in);

		tv1.show();
		while(true) {
			if(tv1.turn==true) {
				System.out.println("(0): 전원 버튼  (1): 채널지정 (2) : 채널올림 (3):채널내림 (4):볼륨올림 (5):볼륨내림 ");
				remote=Integer.parseInt(sc.nextLine());
				switch(remote) {
				
				case 0:
					tv1.On_Off();
					break;				//스위치 빠져나가기
				case 1:
					System.out.print("채널 : ");
					tv1.setChan(Integer.parseInt(sc.nextLine()));
					tv1.getChan();
					break;
				case 2:
					tv1.chan_Up();
					break;
				case 3:
					tv1.chan_Down();
					break;
				case 4:
					tv1.Vol_Up();
					break;
				case 5:
					tv1.Vol_Down();
					break;
				default:
					break;
				}
				
	/*	 	 Test용
	  		tv1.chan_Up();
			tv1.chan_Up();
			tv1.chan_Up();
			tv1.chan_Up();
			tv1.chan_Up();
			tv1.chan_Down();
			tv1.chan_Down();
			tv1.chan_Down();
			tv1.chan_Down();
			tv1.setChan(199);
			tv1.getChan();
			tv1.chan_Down();
			tv1.Vol_Up();
			tv1.Vol_Up();
			tv1.Vol_Up();
			tv1.Vol_Up();
			tv1.Vol_Down();
			tv1.Vol_Down();
			tv1.Vol_Down();
			tv1.Vol_Down();    
	 */
			}	//if - switch
			else
			{
				System.out.println("전원 버튼:0  채널지정:1 채널올림:2 채널내림:3 볼륨올림:4 볼륨내림:5 ");
				remote=Integer.parseInt(sc.nextLine());
				switch(remote) {
				case 0:
					tv1.On_Off();
					continue;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					break;
				}// else - switch
			}//else
			tv1.show();
		}//while
	
	}//main

}//class
