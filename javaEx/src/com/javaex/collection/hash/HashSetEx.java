package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		//basicHashSetEx();
		customHashSetEx();
	}
	
	private static void customHashSetEx() {
		HashSet<Student> hs = new HashSet<>();
		Student s1 = new Student("홍길동",10);
		Student s2 = new Student("장길산",20);
		Student s3 = new Student("전우치",30);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		System.out.println(hs);
		Student s4 = new Student("홍길동",10);
		hs.add(s4);
		System.out.println(hs);
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s1.equals(s4));
		
		//포함여부 확인 
		//HashSet 에서 같은객체는 hashcode 와 값이 모두 같아야 같은객체로 인식한다
		boolean exists = hs.contains(new Student("홍길동",10));
		System.out.println(exists);
		
		
		
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
