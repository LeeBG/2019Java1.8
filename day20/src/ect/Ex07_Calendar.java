package ect;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex07_Calendar {
	public static void main(String[] args) throws Exception {
		Calendar cal = Calendar.getInstance();
		System.out.println("달력 : "+cal);
		System.out.println("연도 : "+cal.get(Calendar.YEAR));
		System.out.println("월 : "+cal.get(Calendar.MONTH));
		System.out.println("일 : "+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("시 : "+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : "+cal.get(Calendar.MINUTE));
		System.out.println("초 : "+cal.get(Calendar.SECOND));
		System.out.println();
		
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = fm.format(cal.getTime());
		System.out.println("현재시간 : "+str);
		
		Runtime rt = Runtime.getRuntime();
		Thread.sleep(2000);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		System.out.println("\n\t글자를 지웠습니다");
	}
}







