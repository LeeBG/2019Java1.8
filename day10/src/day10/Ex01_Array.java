package day10;

import java.util.Scanner;

public class Ex01_Array {
	public static void main(String[] args) {
		
		// 데이터를 저장하는 공간 
		
		// 변수 - 단일 데이터를 저장하는 공간
		//		(하나하나의 개별적인 데이터를 저장하므로, 연관성있는 여러 데이터 사용시 불편)
		
		// 배열 - [같은 자료형]의 데이터를 [연속적인 메모리공간]에 저장하여, 
		// index(순번)으로 참조할 수 있는 변수들의 묶음, 참조형 reference type
		
		int [] arr;		// 배열의 선언
		int arr2[];		// 배열을 의미하는 []는 변수이름 앞/뒤에 써도 된다
		int [] arr3 = {1,2,3};// {x,y,z};
		int [] arr4 = new int[5];
		int[] arr5 = new int[] {10,20,30,40,50}; // 길이 대신 내용을 작성해도 된다.
//		int [] arr6 = new int [2] {1,2};
//		길이와 내용을 동시에 작성하지 않는다
		System.out.println("arr3[0] : "+arr3[0]);
		System.out.println("arr3[0] : "+arr3[1]);
		System.out.println("arr3[0] : "+arr3[2]);
//		System.out.println("arr3[0] : "+arr3[3]); //3번째 공간이 없음 3칸만 만들어지지 않음
		
		//배열의 길이와 같은 인덱스는 존재하지 않는다.
		//(배열의 길이-1) => 배열의 마지막 멤버를 이야기한다.
		
		System.out.println(arr3.length);
		
		System.out.println(arr4[0]);
//		배열 공간만 생성한 경우에는 자료형에 맞는 초기값으로 자동 초기화 (Reference Type의 특징)
		
//		1														|														4
//		arr														|													arr4
//																|												new=>hip
//																|											 		0 0 0 0 0 
		
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);
		System.out.println(arr4[4]);
		
		//갈색으로표시되는것 지역변수 
		
		//배열을 선언할 때에는 자체가 배일임을 표시하거나,길이를 표현한다.
		//그 외 배얄에 접근할 때에는 순번을 나타내는 index값을 표현한다.
		
		System.out.println("");
		
		// 배열의 순번이 정수 형식으로 1씩 증가하면서 값에 접근하므로
		// for문을 이용할 수 있다.
		
		for(int i=0;i<arr3.length;i++) {		//초기값 0부터  길이 :배열이름.length
			System.out.println("arr["+i+"] : "+arr3[i]);
		}
		System.out.println("");
		
		for(int num: arr3) {		//증감이 +1이라면(배열 내 모든 멤버변수를 순회하려면) 1씩증가하는것이 고정이라면 
			System.out.println("num :"+num);
		}
		
		
		// 정수형 배열을 age를 선언하고, String 배열 name을 선언한 후
		//for 문을 이용하여 이름과 나이를 순차적으로 출력하는 코드
		
		String [] name = {"김희철","김영철","궁예"};
		int [] age = {36,46,1046};
		
		for(int i=0 ;i<name.length;i++) {
			System.out.printf("이름 : %s 나이 :  %d 살\n",name[i],age[i]);
		}
		System.out.println("who made a cough sound?");
		//배열의 멤버 변수는 일반 변수와 동일하게 취급하면 된다.
		
		int num;
		num=3;
		arr3[0]=3;
		
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();			// 형태가 같으므로 일반 변수 다루듯 다루세요 
		arr3[1]=sc.nextInt();
	
		
		
	}
	

}
