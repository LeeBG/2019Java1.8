package day06;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
	
		
		/*
		 * 문제 . 다음 메뉴를 구현하고 잘 작동되도록 코드를 작성
		 * 1.이름 입력
		 * 2.세 과목 점수 입력
		 * 		합계 평균연산
		 * 
		 * 3.이름, 과목뵬 성적 , 합계 ,평균 출력
		 * 만약 이름이나 성적이 준비되지 않으면 준비되지 않았다는 에러 메시지 출력
		 * 4.종료
		 *  
		 */
		int kor = -1, eng = -1, mat=-1;
		int sum=0;
		int count=0;		//메뉴카운트
		int count1=0;		//조건 카운트
		int count2=0;		//종료 카운트
		double avg=0.0;
		String name="";
		
		Scanner sc = new Scanner(System.in);
		

		while(true) {
			
		System.out.print("0.종료 1.이름 입력 2.국어점수 3.영어점수 4. 수학점수 :");
		count = Integer.parseInt(sc.nextLine());
			
		switch (count){
		case 0:
			count2=1;
			break;
		case 1:
			System.out.print("이름을 입력하세요 :");
			name=sc.nextLine();
			count1++;
			break;
		case 2:
			System.out.print("국어점수를 입력하세요 :");
			kor=Integer.parseInt(sc.nextLine());
			if(kor>=0&&kor<=100) {
			count1++;
			}
			break;
		case 3:
			System.out.print("영어점수를 입력하세요 :");
			eng=Integer.parseInt(sc.nextLine());
			if(eng>=0&&eng<=100) {
				count1++;
			}
			break;
		case 4:
			System.out.print("수학점수를 입력하세요 : ");
			mat=Integer.parseInt(sc.nextLine());
			if(kor>=0&&kor<=100) {
				count1++;
			}
			break;
		}//switch끝
		sum=kor+eng+mat;
		avg=sum/3.0;
		
		if(mat>=0&&eng>=0&&kor>=0&&count1>=4&&count2==1) {
			System.out.printf("국어 : %d, 영어 : %d 수학 : %d 합계 :%d 평균: %.1f \n",kor,eng,mat,sum,avg);
			break;
		}
		else if(count1<4&&count2==1)
		{
			System.out.println("완성x");
		}

	}//while
sc.close();
		
	}//main

}//class
