package ect;
import java.io.IOException;

public class Ex06_Runtime {
	public static void main(String[] args) throws IOException, InterruptedException {
//		1.프로세스를 실행이후 원하는 시점에서 종료시키고 싶을때 
		Runtime rt = Runtime.getRuntime();		//어떤 실행을 위한 준비
		Process pro = rt.exec("notepad");		//메모장 명령어 외부프로그램을 실행
		Thread.sleep(3000);						//3초간의 딜레이
		pro.destroy();							//프로세스 종료
		
//		2.실행만 하고 마는 경우
		rt.exec("notepad C:\\windows\\system32\\drivers\\etc\\hosts");
		
//		
		rt.exec("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe http://www.kgitbank.co.kr");
		
		Process iexplore = rt.exec("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe http://www.kgitbank.co.kr");
		Thread.sleep(3000);
		iexplore.destroy();
		
		
	}
}
