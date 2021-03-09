package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		basicHashSetEx();
	}
	
	private static void customHashSetEx() {
		
	}
	private static void basicHashSetEx() {
		HashSet<String> hs = new HashSet<>();
			
			
			//요소 추가
			hs.add("Java");
			hs.add("C");
			hs.add("C++");
			hs.add("Python");
			
			System.out.println(hs);			//순서는유지하지않음
			System.out.println(hs.size());
			
			hs.add("Java");
			System.out.println(hs); 		//중복을허용하지않음
			
			//요소의포함여부확인
			System.out.println(hs.contains("Java"));
			System.out.println(hs.contains("Linux"));
			System.out.println(hs);
			
			//요소의삭제
			hs.remove("C++");
			System.out.println(hs);
			
			//비우기
			hs.clear();
			System.out.println(hs);
			
			
	}
}
