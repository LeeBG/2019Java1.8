package day18;

import java.util.Hashtable;	// 순번이 없고, key와 value의 1:1 매핑을 이용하여 저장하는 자료형
							// 배열의 index 대신 key라는 객체를 내가 지정하여 사용할 수 있다
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex05_Map {
	public static void main(String[] args) {
		Hashtable <String, String> ht = new Hashtable<String, String>();
		// 사전 (Dictionary)
		
		ht.put("iu930516", "아이유"); // (key, value)
		ht.put("1234", "3만원");
		ht.put("바늘", "실");
		
		System.out.println(ht.get("iu930516"));
		System.out.println(ht.get("아이유"));
		
		System.out.println(ht.get("1234"));	// key 1234 에 맵핑되어 있는 value 3만원을 반환한다
		System.out.println(ht.get("123"));	// null : 값을 반환하지 않는다
		System.out.println(ht.get("234"));	// null
		
		// 모든 키와 밸류를 확인하고 싶을 경우
		
		Enumeration <String> enu = ht.keys();	// enu에는 ht의 key값들만 순번없이 모여 있다
		
		while(enu.hasMoreElements()) {	// 접근하지않은 값을 하나라도 가지고 있으면 true
			String key = enu.nextElement();	// 그 값중 하나를 key에 저장
			String value = ht.get(key);	// 방금 얻은 key를 이용하여 value를 저장
			System.out.println("key : " + key + ", value : " + value);
		}
		System.out.println("값만 추출하기");
		
		Enumeration <String> enu2 = ht.elements();
		
		while(enu2.hasMoreElements()) {	// 다음 값을 가지고 있으면
			System.out.println("값 : " + enu2.nextElement());	// 그 값을 출력한다
		}
		
		Set<Entry<String, String>> set = ht.entrySet();
		
		Iterator it = set.iterator();
		System.out.println();
		while(it.hasNext()) {
			System.out.println("아무 값 : " + it.next());
		}
		
		
		
		
		
		
		
		
		
	}

}
