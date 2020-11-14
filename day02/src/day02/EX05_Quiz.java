package day02;

import java.util.Scanner;

public class EX05_Quiz {

	public static void main(String[] args) {
		String name;			//이름
		int age;					//나이
		String phone;			//전화번호
		double height;			//키
		double weight;			//체중
		
		
		Scanner sc= new Scanner(System.in); //동적할당
		
		//위에있는 5가지의 값을 순서대로 사용자에게 입력받고
		//항목별로 한줄씩 출력하는 코드를 작성하세요
		
		System.out.print("이름을 입력하세요");
		name=sc.nextLine();
		
		System.out.print("나이를 입력하세요");
		age=sc.nextInt();
		sc.nextLine();
		
		System.out.print("전화번호를 입력하세요");
		phone=sc.nextLine();
		
		System.out.print("키를 입력하세요");		
		height=sc.nextDouble();	
		sc.nextLine();
		
		System.out.print("체중을 입력하세요");		
		weight=sc.nextDouble();	
		sc.nextLine();

		
		sc.close();//Scanner 닫기
		System.out.println(name+"의 나이는"+age+"이고, 전화번호는"+phone+"이고 키는"+height+"cm이고 체중은"+weight+"Kg입니다.");
		
		double Standard=0.0;
		Standard=(height-100)*0.9;
		System.out.println("표준체중은"+Standard+"KG");
		
	}//main 끝

}//EX05_Quiz  class끝
