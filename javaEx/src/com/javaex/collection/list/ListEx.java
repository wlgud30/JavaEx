package com.javaex.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		listClassEx();
	}
	
	public static void listClassEx() {
		//List 관련 클래스는 List 인터페이스를 구현하고있다
		List<String> list = new LinkedList<>();		//실제클래스는 LinkedList 
													//LinkedList 와 ArrayList 는 List를 상속받기때문에 선언만 새로해줘도 된다
		list = new ArrayList<>();
		
		System.out.println(list);
		System.out.println(list.size());
		
		//객체 추가
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Python");
		System.out.println(list);
		
		//객체 삽입
		list.add(2,"C#");
		System.out.println(list);
		
		//List는 중복 삽입을 허용
		list.add("Java");
		System.out.println(list);
		
		//조회
		System.out.println(list.get(2));
		//루프
		for(String str : list) {
			System.out.print(str+"\t");
		}
		System.out.println();
		//반복자를 이요한 순회 : 추천
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {	//뒤에 내용이 더 있는가?
			String str = it.next();
			System.out.print(str+"\t");
		}
		System.out.println();
		//객체의 삭제
		list.remove(2);
		list.remove("Java");			//중복되는 값을 삭제할때	링크드리스트는 헤드부터 접근하기때문에 앞에있는 값부터 삭제한다
		System.out.println(list);
		
		//검색
		int position = list.indexOf("Java");
		System.out.println(position);
		position = list.indexOf("Linux");
		System.out.println(position); 			//없는 객체 검색시 -1 반환
		
		//비우기
		list.clear();
		System.out.println(list);
		
		
		
	}
}
