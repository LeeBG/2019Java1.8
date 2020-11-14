package day12;

import java.util.Scanner;

class Member2{			//클래스의 이름은 첫글자로 대문자로 시작하며
								//_는 포함가능, 숫자는 첫 글자를 제외한 곳에 넣을 수 있음
								//여러 단어의 합성어는 각 단어의 첫 글자를 대문자로 처리
								//is,get,set,has 와 같은 단어는 소문자로 써도 무방
	
	private String name;
	private String id;
	private String pw;		//블럭 선택하고 우클릭 - source - generate Getter/Setter  =>>자동으로 getter setter 만들어줌
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/*public String getPw() {
		return pw;
	}*/
	public void setPw(String pw) {
		this.pw = pw;
	}
	public boolean equalPW(String pw) {
		return pw.equals (this.pw);		
	}
}
public class Ex04_getter_setter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String user_id,user_pw,user_name;
		
		System.out.print("====회원가입====\n");
		
		System.out.print("[회원가입] ID 입력 : ");
		user_id=sc.nextLine();
		System.out.print("[회원가입] PW 입력 : ");
		user_pw=sc.nextLine();
		System.out.print("[회원가입] 이름 입력 : ");
		user_name=sc.nextLine();
		
		Member2 m1 = new Member2();
		m1.setName(user_name);
		m1.setId(user_id);
		m1.setPw(user_pw);
		
		System.out.print("====회원가입 성공 !!====\n");
		
		System.out.println("로그인을 하세여");
		
		System.out.print("[로그인] ID 입력 : ");
		user_id=sc.nextLine();
		System.out.print("[로그인] PW 입력 : ");
		user_pw=sc.nextLine();
		
		if(user_id.equals(m1.getId())){
			if(m1.equalPW(user_pw)) {
				System.out.println(m1.getName()+"님 환영합니다. ");
			}
			else {
				System.out.println("비밀번호를 확인하세요");
			}
		}
		else {
			System.out.println("아이디를 확인하세요");
		}
		
	}
}
