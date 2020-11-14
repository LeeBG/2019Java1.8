package day07;

import java.util.Scanner;

public class EX03_IDNumber {

	public static void main(String[] args) {
		// 사용자에게 이름과 주민등록번호 13자리(가상)을 모두 입력받아서 
		//4자리의 출생연도(현재2019), 월,일,나이,성별을 알려주는 코드
		
		// 1. 주민번호가 13자리가 아니면 다시 입력하기(while)
		// 2. 자릿수를 구분하여 연월일을 별도의 변수에 저장
		// 3. 나머지 항목은 자유용으로 풀기

		
		String name;	//이름
		String number = null;//주민
		String gender1=null;//성별 출력
		long year;
		long data;	//성별부터 다른 정보까지 얻기위한 주민등록번호 숫자정보
		long month;
		long date;
		long age;
		
	//123456-7899999
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print(name+"님의 주민등록번호13자리를 입력하세요 : ");
		number=sc.nextLine();
		
		while(number.length()!=13) {			//주민등록번호
			System.out.print(name+"님의 주민등록번호13자리를 다시 입력하세요 : ");
			number=sc.nextLine();
		}
		
		//9305161 gender 앞6자리와 연도별성별구별위한 gender을 뽑아냄	
		
		data=Long.parseLong(number)/1000000;
		year=data/100000;
		month=(data/1000)%100;
		date=(data/10)%100;
		//gender 내에서 원하는 숫자만을 뽑아내는 단계
		
		
		if(data%2==0)										//여성 일때
		{ 
			gender1="여성";
			switch ((int)data%10) {				//주민등록 번호 7째자리
			case 2:
				year+=1900;
				break;
			case 4:
				year +=2000;
				break;
			default:
				break;	
			}	//switch끝
		}		//if 문 끝
		else {														//남성 일때
			gender1="남성";
			switch ((int)data%10) {				//주민등록 번호 7째자리
			case 1:
				year +=1900;			//1900년생 주민번호
				break;
			case 3:
				year +=2000;			//2000년생 주민번호
				break;
			default:
				break;
				
			}//switch
			
		}//else
		age=2019-year+1;		//나이를 구하는 식 => 현재년도에서 태어난 년도를 빼고 +1(한국기준)
		
		if(year>1900&&month<=12&&month>0&&date<=31&&date>0&&month!=2) {
	
			if(year>1900&&month==2&&date<=29&&date>0&&year%4==0)
				System.out.printf("출생년도 : %d년, 성별 : %s, 월 :%d, 일 : %d일, 나이 :%d살 ",year,gender1,month,date,age);
			else if(year>1900&&month==2&&date<=28&&date>0&&year%4!=0)
				System.out.printf("출생년도 : %d년, 성별 : %s, 월 :%d, 일 : %d일, 나이 :%d살 ",year,gender1,month,date,age);
			else if(year>1900&&month==4||month==6||month==9||month==11&&date<=30)
				System.out.printf("출생년도 : %d년, 성별 : %s, 월 :%d, 일 : %d일, 나이 :%d살 ",year,gender1,month,date,age);
			else 
				System.out.printf("출생년도 : %d년, 성별 : %s, 월 :%d, 일 : %d일, 나이 :%d살 ",year,gender1,month,date,age);
			
		}
		else {
			System.out.println("없는 날짜 입니다. ");
		}
		
		sc.close();	//스캐너 닫기
	}

}
