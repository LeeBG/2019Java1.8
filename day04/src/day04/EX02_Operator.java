package day04;

import java.util.Scanner;

public class EX02_Operator {

	public static void main(String[] args) {
		
		int a=10;
		int b=3;
		
		
		//산술연산
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/(double)b));			
//		정수와 정수의 연산은 정수가 되고 , 연산중에 실수가 포함되면 결과는 실수가 된다
		System.out.println("a%b="+(a%b));
		
		System.out.println("");
		
		
		//관계연산(크기비교) boolean 형태
		System.out.println("a>b : "+(a>b));
		System.out.println("a>=b : "+(a>=b));
		System.out.println("a<b : "+(a<b));
		System.out.println("a<=b : "+(a<=b));
		System.out.println("a==b : "+(a==b));
		System.out.println("a!=b : "+(a!=b));
		
		//단항 연산자(부호및 증가)
		int num=10;
		
		System.out.println("++num :"+ ++num);	//선증가  출력하기전 미리증가
		System.out.println("--num :"+ --num);		//선감소
		
		System.out.println("num++ : "+ num++);	//출력후 후 증가
		System.out.println("num: : "+num);
		System.out.println("num-- : "+ num--);		//출력후 후 감소
		System.out.println("num : "+num);
		
		int view =0;
		view++;			// 1증가
		view +=1;		// 1증가
		view	+=3;		// 3증가
		view +=100;	//100증가
		System.out.println("조회수 : "+view);
		/*
		 * 배정대입연산자 (복합대입연산자)
		 * 
		 * 
		 * 연산자				식				의미
		 * +=					a+=b			a=a+b				현재의 a값에 연산후 a를 대입한다
		 * -=					a-=b			a=a-b
		 * *=					a*=b			a=a*b
		 * /=					a/=b			a=a/b		
		 *%=					a%b			a=a%b
		 * 			
		 * 대입을 할 때 기존의 값을 덮어 씌우지 않고, 유지한 상태에서 b의 값을 연산한다.
		 */
		view *=20;
		System.out.println("view : "+view);

		//논리연산 (And, OR , Not)
		
		boolean bo1=true;
		boolean bo2=false;
		
		System.out.println("bo1&&bo2 : "+(bo1&&bo2));			//true false
		System.out.println("bo1&&true : "+(bo1&&true));			//true true
		System.out.println("bo1||bo2 : "+(bo1||bo2));					//true false
		System.out.println("bo2||false : "+(bo2||false));				//false false
		System.out.println("bo1&&bo2&&true||false : "+(bo1&&bo2&&true||false));
		System.out.println("!true: "+!true);
		
		System.out.println("\n\n\n");
		
		//삼항 연산자
		int n1=10;
		int n2=20;
		
		int n3=(n1>n2)? n1:n2;			//n1과n2 두수의 크기를 비교 큰값을 출력
		
		System.out.println("n3 : "+n3);
		//두가지의 선택지를 가지는 경우에만  주로 사용가능 3,4가지도 가능하지만 복잡함
		//구문 (문장)이 아니라 연산자 이기 때문에 활용범위가 더 넓다.
		
		boolean login =true;
		System.out.println((login)?"로그아웃":"로그인");//로그인이 되어있으면 로그아웃 아니면 로그인 출력
		
		int age;
		int standard=19;//성인 기준
		
		Scanner sc= new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		age=Integer.parseInt(sc.nextLine());
		int pass=(age>standard)? age:standard;
		System.out.println((pass>standard)?"성인":"미성년자");
	/*	if(pass==19) {
			System.out.println("미성년자입니다.");
		}
		else {
			System.out.println("성인입니다.");
		}*/
		
		sc.close();

		
	}

}
