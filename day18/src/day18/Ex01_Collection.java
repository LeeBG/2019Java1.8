package day18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class Ex01_Collection {
	public static void main(String[] args) {
		// 여러 데이터를 다룰때에, 목적에 맞게 편리하게 사용할 수 있도록 만들어진
		// 자료를 저장하는 구조 : Collection Framework
		
		int [] arr = new int[] {1,2,3};
		// 배열은 가운데 멤버가 탈락하면 그 자리가 null이나 쓰레기값으로 대체되면서
		// 위치 이동이 발생하지 않기 때문에, 직접 위치를 변경해주어야 하고
		// 길이보다 더 많은 데이터를 받으려면 새로운 객체를 생성해야 하는 번거로움이 있다
		
		// List, Set, Map
		
		// List : 중복을 허용하고, 순번에 의해서 데이터를 저장하는 방식
		
		ArrayList al = new ArrayList();
		al.add("String");
		al.add("1");
		System.out.println("al의 길이 : " + al.size());
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i) + " ");
		}System.out.println();
		
		al.remove("1");	// 1을 삭제
		
		System.out.println("al의 길이 : " + al.size());
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i) + " ");
		}System.out.println();
		
		al.add(3.14); // Object를 매개변수로 전달받음
		// 전체 출력하기
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i) + " ");
		}System.out.println();
		
		// 전체 중 문자열에 대해서만 문자열의 길이를 구하기
		for(int i=0;i<al.size();i++) {
			if(al.get(i) instanceof String) {
				System.out.println("문자열의 내용 : " + al.get(i));
				System.out.println("문자열의 길이 : " + ((String)al.get(i)).length());
			}
		}
		
		ArrayList<String> al2 = new ArrayList<String>();
		// 기본적으로 컬렉션은 Object를 추가할 수 있지만
		// < > 사이에 원하는 클래스를 지정하여, 지정된 클래스만 받도록 할수 있다
		// 제네릭 타입 지정
		
//		al2.add(3.14);  // al2는 String만 처리하므로 추가 X
		al2.add("3.14");
		al2.add("ITBANK");
		al2.add("Java");
		
		for(int i=0;i<al2.size();i++) {
			// instanceof 사용하지 않아도 된다
			System.out.println("문자열의 내용 : " + al2.get(i));
			System.out.println("문자열의 길이 : " + al2.get(i).length());
			// down-casting이 필요하지 않다
		}
		
		
		
		
		
		
		
		
	}
}
