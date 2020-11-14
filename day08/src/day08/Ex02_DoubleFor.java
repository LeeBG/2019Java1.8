package day08;

import java.util.Scanner;

public class Ex02_DoubleFor {

	public static void main(String[] args) {
		
		
		// for문안에 다른 for문을 넣어서 중첩하여 처리가능하다
		
		int num=1;

		for(int j=0;j<5;j++) {
			for (int i=0;i<5;i++)
			{
				System.out.printf("%2d ",num++);
			} System.out.println();// i For문
		}//j For문
		
		//구구단 만들기
		int mul=0;
		System.out.print("==================1~5단==================");
//		System.out.println("%d x %d = %d \n");
		for(int j=1;j<10;j++) {
				System.out.println("");
			for(int i=2;i<6;i++) {
				mul=i*j;
				System.out.printf("%d x %d = %2d\t\t ",i,j,mul);
			}
		}
		
		System.out.print("\n==================6~9단==================\n");
		for(int j=1;j<10;j++) {
			System.out.println("");
		for(int i=6;i<10;i++) {
			mul=i*j;
			System.out.printf("%d x %d = %2d\t\t ",i,j,mul);
		}
	}
		int gugudan=2;
		
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
			System.out.print("\n원하는 구구단을 선택하세요 : ");
			gugudan=Integer.parseInt(sc.nextLine());
			if(gugudan<10&&gugudan>1) {
				for(int i=1;i<10;i++) {
					mul=gugudan*i;
					System.out.printf("\t %d x %d = %d \n",gugudan,i,mul);
				}
			}
			else
				System.err.println("10이하의 자연수를 입력하세요");
			
		}
		
		
	
	}//main

}//class
