package day10;

import java.util.Scanner;

public class Ex03_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 5명의 이름과 나이를 입력받아서 출력하는 코드를 작성하세요
		//	배열과 for문을 이용하여 작성하세요 
		
		String name[] = new String[5]; 			// 이름 배열
		short age[] = new short[name.length]; 	// 나이 변수
		for (int i = 0; i < name.length; i++) {
			System.out.print((i + 1) + ".이름을 입력하세요 : ");
			name[i] = sc.nextLine();
			System.out.print((i + 1) + ".나이를 입력하세요 : ");
			age[i] = Short.parseShort(sc.nextLine());
			System.out.println("===================================");
		}System.out.println("");
		for (int i = 0; i < name.length; i++) {
			System.out.printf(name[i] + "님의 나이는 " + age[i] + "살입니다.\n");
		}
		sc.close();		//닫기
	}//main

}//class
