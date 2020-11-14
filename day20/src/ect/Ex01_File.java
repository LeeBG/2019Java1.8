package ect;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01_File {

	public static void main(String[] args) throws FileNotFoundException {
		
//		File read = new File("C:\\windows\\system32\\drivers\\etc\\hosts");
//		File 형식의 객체는 존재유무, 폴더or파일, 권한에 상관없이 객체생성가능
		File read = new File("D:\\1월 평일 JAVA 이병길\\good.txt");
		boolean bo1 = read.exists()&&read.isFile()&&read.canRead();
//		파일이 존재하는지, 파일이 폴더/파일중에서 파일 형식인지, 일기가 가능 한지 확인하는 단계
//		
		
		System.out.println("지정한 파일 객체가 존재하고, 파일형식이고, 일기가능한가: "+bo1);
		Scanner sc1 = new Scanner(read);		//지정한 파일을 스캐너로 읽기
												//이때 파일이 존재하지 않을 수 있으므로, 예외처리 필요
		
		String result="";
		
		while(sc1.hasNextLine()) {			//지정한 파일이 다음줄이 존재한다면
			result += sc1.nextLine();		//다음줄을 result에 더하고 
			result += "\r\n";				//줄을 바꾸어 준다 수동으로Enter삽입
		}
		sc1.close();
		System.out.println(result);
	}

}
