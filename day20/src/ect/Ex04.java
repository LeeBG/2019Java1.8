package ect;
import java.io.*;
public class Ex04 {
	public static void main(String[] args)throws IOException
	{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("kor.txt"), "EUC_KR"));
//		버퍼라이터를 생성하기 위한 구문											기본파일 출력 스트림		대상 파일		인코딩방식
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		//						줄단위 			2바이트				1바이트
		
		//버퍼리더를 이용하여 콘솔 입력을 받기 위한 객체 생성
		String str = "안녕하세요";
		str+="\r\n";		// Enter키의 아스키 코드값
		System.out.println("추가 입력 : ");
		str+=br.readLine();		//sc.nextLine();
		
		
		bw.write(str);	//문자열을 bw의 대상파일 (kor.txt)에 기록한다.
		bw.flush();		//입력버퍼를 비우는 역할(밀어넣기)
		bw.close();		//버퍼라이터를 모두 사용하면 close로 메모리 누수방지
		System.out.println("완료");
	}
}
