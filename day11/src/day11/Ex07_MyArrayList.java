package day11;

import java.util.Scanner;

class ArrayList{
	Scanner sc = new Scanner (System.in);
	private int len =1;
	
	int [] arr =new int [len];
	int tmp[];
	
	void Input() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0 ) {		// 0이면 입력받아라
				System.out.printf("입력 (%d) : ", arr.length);
				arr[i] = sc.nextInt();
				if(arr[i] == 0) {	// 입력받았는데도 0이면 종료해라
					System.out.println("0을 입력하여 종료합니다");
					return;
				}	
			}
		}
		
		if(arr[arr.length - 1] != 0) {			// 만약 배열의 마지막 값이 0이 아니면(꽉 찼으면)
			System.out.printf("출력 (%d) : ", arr.length);	// 출력하기
			for (int i = 0; i < arr.length; i++) {	
				System.out.print(arr[i]);		
				if(i != arr.length - 1) 
					System.out.print(", ");	// 끝값이 아니면 ", " 를 출력
			}System.out.println("\n");
			
			tmp = new int[len + arr.length]; // tmp = new int[단위길이 + 기존길이];
			
			for(int i=0;i<arr.length;i++) 	// arr의 길이만큼 반복하여
				tmp[i] = arr[i];			// arr의 데이터를 모두 tmp에 복사
			
			arr = tmp;						// {1, 2, 3, 0, 0, 0}
		}
	}
	int get(int i) {
		return arr[i];
	}
	int size() {
		return arr.length;
	}
	
	void add(int n) {
		if(arr[arr.length-1]!=0) {
			tmp = new int[len+arr.length];
			for(int i=0;i<arr.length;i++) {
				tmp[i]=arr[i];
			}
			arr=tmp;
		}//if
		arr[arr.length-1]=n;
	}
	
}
public class Ex07_MyArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.Input();
		
		System.out.println(al.get(0));
		java.util.ArrayList al2 = new java.util.ArrayList();
		
		al2.add(2);// <배열에 ()안의 값을 추가하는 매서드
		System.out.println(al2.get(0));

	}

}
