package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		//백터의 선언
		Vector<Integer> v = new Vector<>();		//Integer 객체를 담는 벡터
		System.out.println("size : "+v.size()+", Capacity : "+v.capacity());
		
		//1~10 의 값
		for(int i = 1; i<=10;i++) {
			//값을 뒤에 추가
			v.addElement(i);
		}
		System.out.println(v);
		
		System.out.println("size : "+v.size()+", Capacity : "+v.capacity());
		
		v.addElement(11);
		System.out.println("size : "+v.size()+", Capacity : "+v.capacity());
		
		//중간에 삽입
		v.insertElementAt(7, 5);		//벡터 capacity 의 값을 초과하게되면 자동으로 늘어난다
		System.out.println(v);		
		
		//객체 참조
		System.out.println("5번 인덱스의 객체" + v.elementAt(5));
		
		//객체 검색
		int index = v.indexOf(6);
		System.out.println(index);
		index = v.indexOf(0);			//없는 객체의 인덱스는 -1을 반환한다
		System.out.println(index);
		
		//포함 여부 확인
		//내부에 10객체 포함?
		System.out.println(v.contains(10));
		v.removeElement(7);//내부에서 7객체 삭제
		System.out.println(v);
		//내부 객체를 출력
		for(int i =  0;i<v.size();i++) {
			Integer item = v.elementAt(i);
			System.out.print(item+"\t");
		}
		System.out.println();
		//Enhanced for
		for(Integer item: v) {
			System.out.print(item + "\t");
		}
		System.out.println();
		System.out.println(v.toString());
		
		// Vector -> Enumeration 을 받아와서 순회가 권장된다
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			Integer i = e.nextElement();	//데이터를 꺼내고 뒤로이동
			System.out.print(i + "\t");
		}
		 e = v.elements();
		System.out.println("aa");
		for(;e.hasMoreElements();) {
			Integer i = e.nextElement();	
			System.out.print(i + "\t");
		}
		System.out.println();
		//벡터 비우기
		v.clear();
		System.out.println("size : "+v.size()+", Capacity : "+v.capacity());
		
	}
}
