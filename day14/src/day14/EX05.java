package day14;


class Human{
	private  String name;
	private String job;
	private static int all;
	private Human target;		//대상
	
	
	Human(){
		System.out.println("Human 객체를 생성하였습니다!!");
		this.job="무직";
		all++;
	}
	Human(String name,String job){
		this();				//기본생성자 호출
		this.name=name;		
		this.job=job;
	}
	
	
	public void Talk(String msg,Human target) {
		//메시지를 보내기
		target.Listen(msg,this);//대상을 지정하는 경우
	}
	
	
	public void Talk(String msg) {
		if(target==null) {
			System.out.println("대화상대가 존재하지 않습니다. ");
			return;//메서드 종료
		}
		//메시지를 보내기
		target.Listen(msg,this);//대상이 없으면 마지막으로 대화한 대상에게 보냄
	}
	
	
	public void Listen(String msg,Human sender) {
		//메시지를 받기
		System.out.println(sender.name+"이 "+msg+"라고 말함");
		target = sender;
	}
	public void ShowProfile() {
		System.out.println("이름 : "+name );
		System.out.println("직업: "+job+"\n" );
	}
}



public class EX05 {
	public static void main(String[] args) {
		Human m1 = new Human("김희철", "가수");
		Human m2 = new Human();
		m1.Talk("혼잣말.....");
		m1.Talk("안녕, 반가워",m2);
		m2.Talk("그래 나도 안녕");
	}
}
