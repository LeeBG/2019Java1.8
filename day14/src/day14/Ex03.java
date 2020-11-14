package day14;

import java.util.Scanner;

class Man{
	private static int all;	//생성한 총 인원
	private int age;
	private String name;


	Man(int age, String name){
		this.age=age;
		this.name=name;
		all++;
	}
	public static void ShowAll() {
		System.out.println("객체의 갯수 : "+all);
		System.out.println();
	}
	public void showProfile() {
		System.out.println(name+"의 나이는 "+age);
	}
	Man(){
		System.out.print("나이 와 이름을 차례로 입력 : ");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		
		//Man 클래스를 이용하여 객체를 5개 생성하고 각 객체를 arr 배열에 담으세요 
		//Man 클래스에서 [객체가 하나 생성 될 때 마다] 증가하는 필드 all을 생성하세요
		//all을 이용하여 출력한 총 인원을 출력하는 메서드를 만들어서 호출하세요

		int num[]=new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 와 이름을 차례로 입력 : ");
		Man a = new Man(Integer.parseInt(sc.nextLine()),sc.nextLine());
		Man.ShowAll();
		System.out.print("나이 와 이름을 차례로 입력 : ");
		Man b = new Man(Integer.parseInt(sc.nextLine()),sc.nextLine());
		Man.ShowAll();
		System.out.print("나이 와 이름을 차례로 입력 : ");
		Man c = new Man(Integer.parseInt(sc.nextLine()),sc.nextLine());
		Man.ShowAll();
		System.out.print("나이 와 이름을 차례로 입력 : ");
		Man d = new Man(Integer.parseInt(sc.nextLine()),sc.nextLine());
		Man.ShowAll();
		System.out.print("나이 와 이름을 차례로 입력 : ");
		Man e = new Man(Integer.parseInt(sc.nextLine()),sc.nextLine());
		Man.ShowAll();

		Man[] arr = new Man[] {a,b,c,d,e};			//class Man => 자료형 같이 사용

		for(int i=0;i<arr.length;i++) {
			arr[i].showProfile();
		}
		Man.ShowAll();
		System.out.println("배열의 길이 : "+arr.length);
		
	}
		
	
}

