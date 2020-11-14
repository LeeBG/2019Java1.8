package day16;

import java.util.Scanner;

class Human{
	protected String name;
	Scanner sc;
	Human(String name){
		this.name=name;
	}
	
	Human(){
		
	}
}
class Actor extends Human{
	//이름과 직업을 출력하도록 작성
	
	Actor(String name){
		super(name);
	}
	void Show() {
			System.out.println("이름은 "+name);
			System.out.println("직업은 배우");

	}
	
}

class Singer extends Human{
	Singer(String name){
		super(name);
	}
	void Show() {
		System.out.println("이름 : "+name);
		System.out.println("직업은 가수");

	}
}

class Student extends Human{
	Student(String name){
		super(name);
	}
	void Show() {
		System.out.println("이름은 "+name);
		System.out.println("직업은 학생");
	}
}


class Room{
	private Human [] arr = new Human[3];
	
	public void Enter(Human ob1) {
//		객체가 Human이면 입장가능
//		arr에 객체를 넣으면 입장
		for(int i=0;i<arr.length;i++) {
			if(ob1 instanceof Human) {
				if(arr[i]==null) {
					arr[i]=ob1;
					System.out.println(ob1.name+"입장 \n");
					return;
				}
			}
		}
		System.out.println("방이 꽉 찼습니다.");
		
	}
	public void ShowAll() {
		for(int i=0 ;i<arr.length;i++) {
			if(arr[i] instanceof Actor) {
				((Actor) arr[i]).Show();
			}
			if(arr[i] instanceof Singer) {
				((Singer) arr[i]).Show();
		
			}
			if(arr[i] instanceof Student) {
				((Student) arr[i]).Show();
			}
			
		}//for
	}//showAll
	
}
public class Ex03_Polymorphism {

	public static void main(String[] args) {
		//3명의 각기 다른 객체를 생성하고
		//Room 객체를 생성하여 입장시키고,
		//입장 인원들의 프로필을 출력하도록 구현
		Human h1 = new Human("행인1");
		Actor a1 = new Actor("행인2");
		Singer s1 = new Singer("행인3");
		Student d1 = new Student("행인4");
		
		Room room = new Room();
	
		room.Enter(a1);
		room.Enter(s1);
		room.Enter(d1);
		room.Enter(h1);

		room.ShowAll();
	}

}
