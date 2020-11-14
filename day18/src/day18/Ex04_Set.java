package day18;
import java.util.HashSet;	// 순번이 없고, 중복을 허용하지 않는다
import java.util.Iterator;  // 순번이 없는 집합 내에서 각 자료들을 순환할때 사용

public class Ex04_Set {
	public static void main(String[] args) {
		HashSet hs = new HashSet();	// Object를 처리한다
		hs.add("ITBANK");
		hs.add(3.14);
		hs.add(new Integer(10));
		hs.add(3.14);
		
		System.out.print("hs내의 멤버 : ");
		for(Object ob : hs) {// hs내의 모든 멤버중 하나를 ob라고 할때
			System.out.print(ob + " "); // ob의 값을 출력해라
		}System.out.println();
		
		System.out.println("hs의 크기 : " +  hs.size());
		
		Iterator it = hs.iterator();	// Set을 Iterator 형으로 변환
										// 여러 데이터를 순환할 수 있도록 만들어진 자료형
		System.out.print("Iterator it의 값들 : ");
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}System.out.println();
		
		
	}

}
