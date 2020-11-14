package ect;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		File f01 = new File("a.txt");//실제 파일이나 디렉토리가 아니여도 객체는 생성된다
		System.out.print("f01 존재하는지? ");
		System.out.println(f01.exists());
		
		System.out.print("f01 디렉토리(폴더)인지? ");
		System.out.println(f01.isDirectory());
		
		System.out.print("f01 파일인지? ");
		System.out.println(f01.isFile());
		
		
		try{									//그냥 쓰면 IOException 예외 발생할 수 있음
	    	boolean bool = f01.createNewFile();	//파일이 없으면 생성하고 생성여부를 논리값으로 저장
	    	System.out.println("파일 생성 : "+bool+"\n");
	    }catch(IOException e){}
	    
	    System.out.println("File : ["+f01.toString()+"] 읽기 가능 ? "+f01.canRead());
	    System.out.println("File : ["+f01.toString()+"] 쓰기 가능 ? "+f01.canWrite()+"\n");
		
		
		
		
		File f02 = new File("C:\\windows\\system32\\drivers\\etc\\hosts");
		
		System.out.print("f02 존재하는지? ");
		System.out.println(f02.exists());
		
		System.out.print("f02 디렉토리(폴더)인지? ");
		System.out.println(f02.isDirectory());
		
		System.out.print("f02 파일인지? ");
		System.out.println(f02.isFile());
		
		System.out.print("f02 읽기가능인지? ");
		System.out.println(f02.canRead());
		
		if(f02.isFile() && f02.canRead())
		{
			Scanner sc = new Scanner(f02);
			System.out.println("읽어온 파일을 출력합니다");
			while(sc.hasNextLine())		{			//다음줄을 가지고 있을때 까지
				System.out.println(sc.nextLine());	//다음줄을 반복 출력합니다
//				Thread.sleep(1000);
			}
		}
	}

}
