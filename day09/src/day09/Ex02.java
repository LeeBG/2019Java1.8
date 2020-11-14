package day09;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int n1,n2,result;		//지역변수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		n1=sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		n2=sc.nextInt();
		sc.close();
		
		if(n1!=n2) {
			result = BigNumber(n1,n2);
			System.out.println("두 수 중 큰 수는 "+ result + "입니다. ");
		} 
		else
			result = BigNumber(n1,n2);
			
	}
	
	static int BigNumber(int x, int y) {
		
		int bigger=0;
		if(x-y<0) {
			bigger=y;
		}
		else if(x-y>0) {
			bigger=x;
		}
		else {
			bigger =x;
			System.out.println("두 수 는 같습니다.");
		}
		
		return bigger;
	}

}
