package day10;

import java.util.Scanner;

public class Ex05_Sort {

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
			System.out.println();
		}System.out.println("===================================");
		for (int i = 0; i < name.length; i++) {
			System.out.printf(name[i] + "님의 나이는 " + age[i] + "살입니다.\n");
		}
		sc.close();		//닫기
		
		//선택정렬 알고리즘을 이용하여 나이가 많은 순서대로 정렬하고 다시 출력하세요;
		
		String swap;		//이름 바꾸기 변수
		short swap2;	//나이 바꾸기 변수 
		
		for(int i=0;i< name.length; i++) {				//기준
			for(int j=i; j<name.length;j++) {			//대상 비교
				if(age[i]<age[j]) {	//내림차순 나이정렬
					swap2=age[i];
					age[i]=age[j];
					age[j]=swap2;
					
					//정렬된 나이에 따라 이름도 같이 바꾸기
					swap=name[i];
					name[i]=name[j];
					name[j]=swap;
				}
			}
		}
		System.out.println("===================================");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("내림차순 정렬 후 "+name[i] + "님의 나이는 " + age[i] + "살입니다.\n");
		}
		
		
	}//main

}//class
