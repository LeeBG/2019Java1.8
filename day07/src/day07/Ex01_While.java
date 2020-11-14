package day07;

import java.util.Scanner;

public class Ex01_While {

	public static void main(String[] args) {
		
		
		
		//	if	: 조건이 참이면 실행문을 1회실행
		// While : 조건이 참인 동안 실행문을 반복하여 실행
		
		int num=5;
		System.out.println("main : " + num);
		
		if(num<10) {	//조건이 참이면 출력하라
			System.out.println("if :"+ ++num);		//전치 연산자 먼저 증가후 실행
		}	
		while(num<10) {	//조건이 참인 동안 계속 출력해라
			System.out.println("while : "+ ++num);
		}
		System.out.println("main : " + num);
		
		
		int n=1;
		int sum=0;
		while(n<=10) {		//1부터 10까지 더하기
			sum=sum+n;	//sum+=n;
			n++;
		}
		System.out.println("sum : "+sum);
		
		//while의 조건식은 반복횟수 관련일 수도 있고 
		//횟수가 아닐 수도 있다.
		int age=1;//1대신 사용자의 입력이면
					//횟수가 정해지지는 않으나 목표치가 20인 수식
		if(age>1) 
		while(age != 20) {
			age++;
			
		}
		
		System.out.println("20살 ㅊㅋㅊㅋ");
		//1부터 20까지의 짝수의 합을 while을 이용하여 계산하고 출력하기
		

		//2+4+6+8+10+12+14+16+18+20
		
		//1에서 100사이의 홀수의 합과 짝수의 합을 각각 구하시오
		
		int n2=1;
		int sum1=0;//짝수
		int sum2=0;//홀수
		while(n2<=100) {
			if(n2%2==0) {//짝수 일때
				sum1+=n2;
				n2++;
			}
			else{//홀수일때
				sum2+=n2;
				n2++;
			}
		}//while끝
		System.out.printf("짝수의 합 : %d 홀수의 합 :%d \n",sum1,sum2);
		System.out.println("1~100까지의 합 :"+(sum1+sum2));
		
		//while을 이용하여 입력받는 수의 범위를 체크하기
		Scanner sc = new Scanner(System.in);
		while(true) {
	
			System.out.print("나이를 입력하세요 : ");
			age= sc.nextInt();
			if(age>0) 
				break;		//while{} 탈출
							//if는 break를 쓸 수 없다.
			System.out.println("나이를 자연수로 입력하세요!!");
		
		}//while
		System.out.printf("나이는 %d살입니다.\n\n",age);
		sc.close();
	}//main 끝

}//class 끝
