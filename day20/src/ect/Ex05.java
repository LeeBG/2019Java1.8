package ect;
import java.io.*;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\한글 디렉토리");
		System.out.println(dir.exists());
		dir.mkdirs();		//directory 생성
		System.out.println(dir.exists());
		
		File f01 = new File(dir,"myfile.txt");	
		System.out.println(f01.exists());
		f01.createNewFile();//파일 생성
		
		/*
		 * 	파일 객체 생성시 문자열 하나를 전달하면 new File("파일이름");
		 * 	파일 객체 생성시 문자열 둘을 전달하면 new File("디렉토리경로", "파일이름");
		 */
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f01), "EUC_KR"));
		
		bw.write("안녕하세요\r\n");
		bw.write("내용을 추가중입니다\r\n");
		bw.flush();
		bw.close();
		
		
		
		
	}

}
