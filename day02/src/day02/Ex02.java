package day02;

public class Ex02 {

	public static void main(String[] args) {
		
		//이름과 나이를 변수에 담아서 콘솔로 출력하는 코드 작성하기
		
		String name="홍길동";
		int age=22;
		double left_sight=1.2;
		double right_sight=1.3;
	/*	
		System.out.println("이름 :"+ name);
		System.out.println("나이 :"+age);
		System.out.println("좌시력"+left_sight);
		System.out.println("우시력"+right_sight);
	
		System.out.println(left_sight+" "+right_sight);
	*/
		//숫자간의 +는 산술 연산을 처리하고, 문자열이 포함되면 덧붙이기 (나열)한다.
		
		//1.위에서 작성한 변수들을 활용하여 한 문장이 되도록 이름,나이 양쪽 시력을 출력하세요
		System.out.println("이름은 "+name+"이고, 나이는 "+(age+1)+
				"살, 좌시력은 "+left_sight+"이고, 우시력은 "+right_sight+"입니다.");
		String result;
		
		result=name;
		result=result+"님의 나이는";
		result=result+age;
		result=result+"살이고, 시력은 왼쪽";
		result=result+left_sight;
		result=result+",오른쪽";
		result=result+right_sight;
		result=result+"입니다.";
		System.out.println(result);
	
	
	
	
	}//main끝

}//Ex02끝
