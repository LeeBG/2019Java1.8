package day12;

class Member{
	private String name;
	private int age;
	private String id;
	private String pw;
	//접근제한자 : 클래스, 멤버 필드, 멤버 매서드에 대해 외부로 부터 접근을 제어하기 위한 매서드
	//필드는 private로 매서드는 public으로 설정하는것이 일반적

	//private  : 클래스 내부에서만 접근가능
	//protected  : 상속 관계에 대해서만 접근 허용
	//package (default) : 같은 패키지 내의 클래스에 대해서 접근 허용
	//public : 모든 외부로 부터의 접근을 허용합니다.
	
	//private 필드에 대해서 값을 세팅하거나, 값을 얻어올수 있는 매서드가 필요해진다.
	//얻기 getter, 대입 setter 라고 한다
	public void setId(String id) {		//setter
		this.id=id;
	}
	public String getId() {					//getter
		return id;
	}
	
	//pw 필드에 대한 getter와 setter 매서드 작성하기
	
	public void setPw(String pw) {		//setter
		this.pw=pw;
	}
	public String getPw() {					//getter
		return pw;
	}
}

public class Ex03_Access_Modifier {			//외부 클래스에서 접근이 가능한 클래스이다.private 외부에서 접근 불가능한 클래스 

	public static void main(String[] args) {
	
		Member m1 = new Member();
//		m1.id="itbank";							//The field Member.id is not visible
//		m1.pw="it";
//		
//		System.out.println("m1의 비밀번호 : "+m1.pw);
		
		m1.setId("itbank");//setter를 이용하여 private필드에 값을 세팅
		
		m1.setPw("123456789");//setter를 이용하여 private필드의 값을 세팅
		
		System.out.println("m1의 ID  : "+m1.getId());
		System.out.println("m1의 PW : "+m1.getPw());
		Human h1 = new Human("박주영",36,"남성");
		h1.Profile();
		
		
		
	}//main

}//class
