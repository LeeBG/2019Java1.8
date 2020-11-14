package day04;

import java.io.IOException;

public class Ex01_sysout {

	public static void main(String[] args) throws IOException {
		//연산자 들어가기 전 출력문
		/*
		 * 
		 * 	System.in;				=>입력장치 ->본체
		 *	System.out;				=>본체=>출력장치
		 *	System.err;				=>본체=>출력장치 (에러)
		 * 
		 * 
		 */
		
//		System.in
		System.out.print("1 byte크기의 글자를 입력 : ");
		int num=System.in.read();				//read가 1바이트만 읽음
		char ch =(char)num;						//아스키 코드=>num
		System.out.println("num : "+num);
		System.out.println("ch : "+ch);

		
//		system.out
		System.out.print("줄바꿈 없는 출력\n");
		System.out.println("자동으로 한줄 바꿔주는 출력");
		System.out.printf(ch+", "+num);
		
		//Escape Sequence : 문자열 내에서 특수한 기능을 하는 문자
		/*
		 * \n : 다음ㅈ불로 바꿈 ,new Line
		 * \r : 커서를 줄 맨 앞쪽으로 옮김,carrige Return
		 * \b: 커서를 한칸 앞쪽으로 옮김, Backspace(삭제하지 않음)
		 * \t: Tab크기(4칸 or 8칸)만큼 오른쪽으로 공간을 확보함
		 * \\:문자로 역슬래시를 출력하고 싶을때
		 * \":문자로 쌍 따옴표를 표시하고 싶을 때
		 * 
		 * 언어 내에서 기능을 가진 문자 앞에 \를 붙이면 기능을 제거하고
		 * 글자의 기능만 가진다.
		 * 단%는 printf()에서 %%로 표기한다.
		 * 
		 */
		/*=====================================
		 * 		이름				전화번호				주소
		 *=====================================
		 *		원빈		010-
		 * 
		 * 
		 * 
		 */
//		System.err
		String name,name2,name3,name4;
		String	phone,phone2,phone3,phone4;
		String add,add2,add3,add4;
		
//		Scanner sc=new Scanner(System.in);
		
		name="원빈";
		name2="이지은";
		name3="이병길";
		name4="지드래곤";
		
		phone="010-1111-1111";
		phone2="010-2222-2222";
		phone3="010-3333-3333";
		phone4="010-4444-4444";
		
		add="부산";
		add2="서울";
		add3="대구";
		add4="광주";

		
		System.out.println("\n\n\n");
		System.out.println("=====================================");
		System.out.println("\t이름\t\t\t전화번호\t\t\t주소\t\t\t\t");
		System.out.println("=====================================");
		System.out.println("\t"+name+"\t\t\t"+phone+"\t\t"+add+"\t\t\t\t");
		System.out.println("\t"+name2+"\t\t"+phone2+"\t\t"+add2+"\t\t\t\t");
		System.out.println("\t"+name3+"\t\t"+phone3+"\t\t"+add3+"\t\t\t\t");
		System.out.println("\t"+name4+"\t\t"+phone4+"\t\t"+add4+"\t\t\t\t");
		
		/*
		 * format에 맞춰서 print하는 기능(함수)
		 * 
		 * 		데이터					서식
		 * 		boolean					%b				논리형 결과(TRUE/FALSE)
		 * 		char						%c					단일 문자
		 * 		byte,short,int			%d				Decimal, 10진수
		 * 									%x					Hexadecimal 16진수
		 * 									%o				Octal, 8진수
		 * 		long						%ld				Long Decimal
		 * 		float						%f					부동 소수점 방식
		 * 		double					%lf				
		 * 		String 					%s					문자열
		 */
		System.out.printf("%b",2>1);;
		System.out.printf("%c\n", 97);
		System.out.printf("%d\n", 97);
		System.out.printf("%f\n",1.2f);
		System.out.printf("%f\n",3.14);
		System.out.printf("%s\n","문자열~");
		System.out.printf("%2d, %2d\n",1,2);
		System.out.printf("%2d, %2d\n",1,22);
		System.out.printf("%02d, %2d\n",1,22);
		
		
		System.out.printf("%.1f\n",1.2f);
		System.out.printf("%.2f\n",3.14);
		System.out.printf("%.1f\n",2.25f);				//반올림하여 1자리 소숫점만 보여준다
		
		
//		System.out.println("서식",값);
//		사식문자의 갯수와 값의 갯수는 일치해야한다.
//		이스케이프 시퀀스는 서식부분어느곳에서 넣어도 된다.
		
		System.err.println("빨간색 글자로 예외, 오류 관련 메시지를 출력합니다.");
		
		

	}//main 끝

}
