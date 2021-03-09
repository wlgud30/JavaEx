package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableEx {
	public static void main(String[] args) {
		//Map인터페이스
		Map<String,ClassRoom> map = new Hashtable<>();
		
		
		//인덱스 접근이아니라 키를 이용한 접근
		map.put("101", new ClassRoom("Java","R101"));
		map.put("202", new ClassRoom("C","R202"));
		map.put("303", new ClassRoom("Python","R303"));
		
		System.out.println("Map : "+ map);
		//키셋 -> HashSet - > 순서가없다
		
		//조회
		ClassRoom room = map.get("202");		//키접근
		System.out.println(room);
		
		//변경
		map.put("202", new ClassRoom("Linux","R202"));
		System.out.println(map);
		//동일한 키를 쓰면 내용을 덮어쓴다
		
		//특정 키가 포함되어 있는가?
		System.out.println(map.containsKey("202"));
		
		//특정 값이 포함되어 있는가? -> SUBJECT 가 Java인 객체가 있는가
		System.out.println(map.containsValue(new ClassRoom("Java")));
		
		//반복자 활용
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			ClassRoom item = map.get(it.next());
			System.out.println(item);
		}
		
		//삭제
		map.remove("202");
		
		//비우기
		map.clear();
		
	}
}
