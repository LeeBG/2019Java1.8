package day09;

import java.util.Scanner;

public class Ex06_Quiz {

	public static void main(String[] args) {
		//GuGuDan()메서드를 작성하기
		int a;
		String c=null;
		/*
		 * 
		 * 매개변수로 정수를 전달 받으면 해당 단수를 출력하기
		 * 매개변수를 전달 받지 않으면 전체 구구단을 책받침 형태롤 출력하기
		 * 매개변수가 2~9범위를 벗어나면 오류메세지를 출력하기 
		 * 
		 */
		System.out.print("원하는 구구단을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		a=Integer.parseInt(sc.nextLine());
		GuGuDan(a);
		GuGuDan();
	}
	
	static void GuGuDan(int dan) {
		
		int  mul;
		while(true) {
			if(dan<10&&dan>1) {
				for(int i=1;i<10;i++) {
					mul=dan*i;
					System.out.printf("%d x %d = %d \n",dan,i,mul);
				}
			}
			else
				System.err.println("2~9의 자연수를 입력하세요");
				break;
		}
	}
	static void GuGuDan() {
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
	}
	
}
