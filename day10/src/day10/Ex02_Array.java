package day10;

import java.util.Scanner;

public class Ex02_Array {

	public static void main(String[] args) {

		// C언어 ,Python, Java 세 과목의 성적을 입력받아서
		// 과목이름 : 정수형식으로 반복하여 출력하도록 베열을 활용하여 코드 작엉

		int score[] = new int[3];
		String sub[] = { "C언어", "Python", "Java" };

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print(sub[i] + "의 점수를 입력하세요 : ");
			score[i] = sc.nextInt();

		}System.out.println("");
		
		int sum = 0;				//합계 

		for (int j = 0; j < score.length; j++) {
			System.out.println(sub[j] + "의 점수 : " + score[j] + "점");
			sum = sum + score[j];

		}
		System.out.printf("합계 : %3d점 , 평균 : %.2f점 ", sum, (double) (sum / 3.0));

		
		sc.close();
	}

}
