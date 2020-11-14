package day11;

import java.util.Scanner;//이미 만들어진 class소환
import java.util.ArrayList;


public class Ex03_ArrayList {

	public static void main(String[] args) {
		
			
		Scanner sc;		//참조변수 선언
		sc=  new Scanner(System.in);
		
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2);		
		al.add(3);
		
		
		System.out.print("al : ");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}System.out.println();
		
		
		System.out.println("al.size() : "+al.size());		//길이
		
		al.add(4);
		al.add(5);
		al.add(6);
		
		System.out.println("al.size() : "+al.size());		//길이
		
		System.out.print("al : ");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}System.out.println();
		
		
		
		//변수 : 하나의 데이터를 저장한다 자료형을 필요하다. 
		//배열 : [같은 자료형]의 데이터를 묶어서 관리
		//구조체  : 여러 자료형
		//C언어에서 구조체 (Struct) : 여러 자료형을 포함 할 수 있는 [사용자 정의 자료형]
		//=>형식이 지정되어있어서 사용되는 함수도 자주 사용할 수 있는 함수가 정해져있음
		
		//구조체와 함수를 묶어서 하나의 자료형으로 만들어서 쓰자 => Class(결국 자료형)
		
		
		
		

		// 메서드를 이용하여 값을 출력

	}

}
