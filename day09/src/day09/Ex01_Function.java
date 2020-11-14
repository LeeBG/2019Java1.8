package day09;

public class Ex01_Function {

	public static void main(String[] args) {
		
		// 함수(Function) : 어떠한 기능을 수행할 수 있는 코드들의 집합, 이름을 부여하여
//		호출하도록 작성
		
		System.out.println();//입력값을 전달하지 않아도 "\n" 줄바꿈 기능을 기본적으로 수행한다.
		
		System.out.println("아이유");//함수를 호출하는 형태  System.out.println
		
		// y = f(x)  				//y = 결과값
		// y = 2x+1  			//입력: 1,7
									//출력: 3,15
		
		System.out.println(Myfunc(1));
		Myfunc2(7);
//								함수의 호출 -> 인자를 함수의 정의에 가져옴
//		== System.out.println(3);
		System.out.println("메인함수의 종료");
		
		//void 자료형 : 반환하는 값이 없을 경우
	}//main
	
	
	
	static int Myfunc(int x) {				//함수를 선언(형태를 선언 (ex) int, void  )
		
		//[반환값][함수이름](인자(argument))		//반환형은 변수가 아닌 자료형만 작성(int String double)
															//반환형의 자료형은 return 의 자료형과 일치
															//return은 최대 1개의 값만 반환할 수 있다.
		
		// 출력						입력
		//함수를 정의한다. => 실제 함수내의 코드를 작성
		
		int result=0;
		result = (2*x)+1;
		
		return result;
				//return 1.현재 함수를 종료한다.
				//return 2.다음에 오는 값을 호출된 자리로 반환
		
	
	}
	static void Myfunc2(int x) {
		System.out.println("결과 : "+((2*x)+1));
		return;	//함수종료
	}
	

}//class
