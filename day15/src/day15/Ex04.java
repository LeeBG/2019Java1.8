package day15;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

	//STD 와 STD2를 이용하여 학생의 정보를 생성하고 관리할 수 있는 코드 작성하기
		
		Scanner sc = new Scanner(System.in);
		STD[] arr = new STD[100];
		char menu=0;
		int type=0;
		int a[] = new int[100];
		String find;
		
		Loop:while(true) {
			boolean flag=false; //참거짓 판별 
			System.out.println("==================");
			System.out.println("1. 학생 정보 생성 및 입력 ");
			System.out.println("2. 학생 정보 검색 ");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("Q.  종료 ");
			System.out.println("==================");
			System.out.print("선택  : ");
			menu= sc.nextLine().charAt(0);
			
			Menu:switch(menu) {
			case '1':
				System.out.println("유형을 선택하세요 \n");
				System.out.println("1.기본유형\t 2.제 2외국어 포함");
				System.out.print("선택  : ");type=Integer.parseInt(sc.nextLine());
				if(type==1||type==2) {
					if(type==1) {			//기본 유형을 선택하면
						for(int i=0;i<arr.length;i++) {// 배열의 총 공간 중
							if(arr[i]==null) {		//아직 객체를 참조하지 않는 칸을 찾아서
								arr[i]=new STD();	//부모클래스의 객체를 생성
								arr[i].Set_Profile();
								for(int j=0;j<i;j++) {
									if(arr[i].name.equals(arr[j].name)) {
										int add=1;
										add++;
										arr[i].name+=add;
										break;
									}
								}
								a[i]=0;
								break;
							}	
						}
					}
				
					else if(type==2) {
						for(int i=0;i<arr.length;i++) {// 배열의 총 공간 중
							if(arr[i]==null) {		//아직 객체를 참조하지 않는 칸을 찾아서
								arr[i]=new STD2();	//부모클래스의 객체를 생성
								arr[i].Set_Profile();
								break;
						}	
					}
				}
				else {
					System.out.println("잘못 선택 하셨습니다");
				}
				break;
			}
			case '2':
				System.out.print("학생의 이름을 입력하세요");
				find = sc.nextLine();
				if(find.equals("")) {
					for(int i=0;i<arr.length&&arr[i]!=null;i++) {
						arr[i].show();
					if(arr[i] instanceof STD2)// 객체가 해당 클래스의 인스턴스 인지 확인하는 연산자
						((STD2)arr[i]).ShowPrc();//배열이 부모클래스 이므로 자식클래스의 고유기능을 호출 할 수 없다.
					// 기본 형식으로는 호출불가 자식클래스로 캐스팅 필요.
					}//if
					flag=true;
				}//for
				
				for(int i=0;i<arr.length;i++) {
					if(arr[i] != null && arr[i].name.equals(find)) {
						//A.equals(B)  : A와 B객체의 내용이 일치하는지 판단(문자열)
						arr[i].show();
						flag = true;
						break Menu;
					}
				}
				if(!flag) {
					System.out.println(find+"를 찾을 수 없습니다.");
				}break;
				
			case '3':
				System.out.print("수정할 학생의 이름을 입력하세요");
				find =sc.nextLine();
				for(int i=0;i<arr.length;i++) {
					if(arr[i].name.equals(find)) {
						arr[i].Set_Profile();
						flag=true;
						break Menu;
					}//if 이름이 같은지
					if(!flag) {
						System.out.println(find+"를 찾을수 없습니다.");
					}break;
		}//for문 객체배열
			case '4'://학생정보 삭제 학생의 이름을 찾아서 내용모두 삭제
				System.out.print("삭제할 학생의 이름을 입력하세요");
				find=sc.nextLine();
				for(int i=0;i<arr.length;i++) {
					if(arr[i].name.equals(find)) {
						arr[i]=null; 
						flag=true;
						break Menu;
					}
					if(!flag) {
						System.out.println(find+"가 없어 삭제 할 수 없습니다.");
					}break;
				}	
			case 'Q':
				break Loop;
			case 'q':
				break Loop;
			default:
				break Loop;
			
			}//switch
			
		}//while	

	}//main
}//class
		
