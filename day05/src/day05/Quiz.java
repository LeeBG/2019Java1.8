package day05;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		
		//Quiz 사용자에게 이름과 세과목의 점수를 입력받고 
		//다음 성적표 기준에 따라 함계 평균 등급을 출력
		/*
		 * 평균						등급
		 * 100						A+
		 * 99.99~90					A
		 * 89.99~80					B						
		 * 79.99~70					C
		 * 69.99~60					D
		 * 60미만						F
		 */

		String name;
		String grade = null;
		int kor,eng,mat;
		
		double avg=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :");
		name=sc.nextLine();
		System.out.print(name+"님의 국어성적을 입력하세요 : ");
		kor=Integer.parseInt(sc.nextLine());
		System.out.print(name+"님의 영어성적을 입력하세요 : ");
		eng=Integer.parseInt(sc.nextLine());
		System.out.print(name+"님의 수학성적을 입력하세요 : ");
		mat=Integer.parseInt(sc.nextLine());
		sc.close();
		
		avg=(kor+eng+mat)/3.0;	//평균
		
		if(avg==100) {
			grade="A+";
		}
		else if(avg>=90&&avg<100) {
			grade="A";
		}
		else if(avg>=80&&avg<90) {
			grade="B";
		}
		else if(avg>=70&&avg<80) {
			grade="C";
		}
		else if(avg>=60&&avg<70) {
			grade="D";
		}
		else if(0<=avg&&avg<60) {
			grade="F";
		}
		else {
			System.err.println("점수범위를 벗어남");
		}
		System.out.printf("합계:%d 점 평균:%.1f 점 등급%s입니다.",(kor+eng+mat),avg,grade);
	}

}
