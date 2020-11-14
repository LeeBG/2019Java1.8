package day05;

import java.util.Scanner;

public class EX02_If {

	public static void main(String[] args) {
		
		// 사용저에게 점수를 입력받아 0~100사이의 점수가 아닌 경우는 입력 오류라는 메시지 출력하기
		
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("점수 입력 : ");
		score=Integer.parseInt(sc.nextLine());
		
		if(0<=score&&score<=100) {
			if(score>=60)
				System.out.println("합격");
			else 
				System.out.println("불합격");	
			
		}//바깥 If
		
		else	//if(100<score||score<0)//점수의 범위를 벗어나면
			System.err.println("정상적인 점수의 범위를 벗어 났습니다.");
		

	}

}
