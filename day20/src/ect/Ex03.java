package ect;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		File test = new File("C:\\java_test\\test.txt");
		File dir = new File("C:\\java_test");
		if(dir.exists()==false)
			dir.mkdir();	//디렉토리  or 폴더를 생성하는 메서드
		if(test.exists()==false) {
			try {
				test.createNewFile();
			}catch(Exception e){
				e.printStackTrace();
			}
		
		}//if끝
		String data = "\r\n 이 내용을 텍스트 파일에 추가하고 싶습니다.";
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test"), "EUC_KR"));
		bw.write(data);			//문자열을 버퍼에 전달\
		bw.flush();				//버퍼의 데이터를 파일에 밀어 넣기
		bw.close();				//마무리
		boolean bo2 =test.exists() && test.isFile() && test.canRead();
		System.out.println(bo2);
		if(bo2)
		{
			Scanner sc1 = new Scanner(test);
			while(sc1.hasNextLine())
				System.out.println(sc1.nextLine());
			sc1.close();
		}
	}

}
