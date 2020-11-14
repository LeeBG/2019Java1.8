package day18;

import java.util.ArrayList;
import java.util.Scanner;

class Member{	// 회원 1인에 대한 정보, 필드와 getter, setter 만 작성하기
	private String name;
	private String id;
	private String pw;
	
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
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
class Handler{  // member 객체들을 관리할 수 있는 기능을 구현하기
	private ArrayList<Member> al = new ArrayList<Member>();
	private Scanner sc = new Scanner(System.in);
	
	// 회원 가입 메서드
	public boolean Join(){
		Member tmp = new Member();
		System.out.print("회원 이름 : ");
		tmp.setName(sc.nextLine());
		System.out.print("회원 ID : ");
		tmp.setId(sc.nextLine());
		System.out.print("회원 PW : ");
		tmp.setPw(sc.nextLine());
		System.out.println("회원 가입 신청이 완료되었습니다 !!");
		System.out.println();
		return al.add(tmp);
	}
	// 회원 정보 확인 메서드
	public void Show(){
		String find;
		System.out.print("[검색] 회원 ID : ");
		find = sc.nextLine();
		for(int i=0;i<al.size();i++){
			if(find.equals(al.get(i).getId())){
				System.out.println("ID : " + al.get(i).getId());
				System.out.println("PW :  ********");
				System.out.println("이름 : " + al.get(i).getName());
				System.out.println();
				return;
			}
		}
		System.out.println("회원 정보를 찾을 수 없습니다 !!");
	}
	// 회원 탈퇴 메서드
	public void Leave(){
		String find;
		System.out.print("[검색] 회원 ID : ");
		find = sc.nextLine();
		for(int i=0;i<al.size();i++){
			if(find.equals(al.get(i).getId())){
				System.out.println(al.get(i).getId() + "님을 탈퇴처리합니다");
				System.out.print("계속 하시겠습니까? (y/n) :");
				if(sc.nextLine().charAt(0) == 'y') {
					al.remove(i);
					System.out.println("탈퇴 완료 되었습니다");
					System.out.println();
					return;
				}
				else {
					System.out.println("탈퇴 요청을 취소합니다");
					System.out.println();
					return;					
				}
			}
		}
		System.out.println(find + " 를 찾을 수 없습니다");
		System.out.println();
		return;

	}
	// 현재 회원 수를 출력하는 메서드
	public void HowMany() {
		System.out.println("현재 회원 수 : " + al.size());
		System.out.println();
	}
}
public class Ex03_MemberJoin {
	public static void main(String[] args) {
		// while, switch ~ case, 메뉴를 구현하고 Handler객체를 생성하여 Handler의 기능을 호출
		System.out.println("=== 회원정보 관리 프로그램 ===\n");
		Handler hd = new Handler();
		Scanner sc = new Scanner(System.in);
		char menu = 0;
		while(true) {
			hd.HowMany();
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 탈퇴");
			System.out.println("Q. 종료");
			System.out.print("선택 : ");
			menu = sc.nextLine().charAt(0);
			switch(menu) {
			case '1':hd.Join(); break;
			case '2':hd.Show(); break;
			case '3':hd.Leave(); break;
			case 'q':
			case 'Q':
			case 'ㅂ':
				System.out.println("프로그램을 종료합니다");
				sc.close();
				return;
			}
		}
	}
}
