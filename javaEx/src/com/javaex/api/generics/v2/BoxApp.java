package com.javaex.api.generics.v2;

public class BoxApp {
	public static void main(String[] args) {
		//Generic 으로 설계된 클래스는 new(인스턴스화) 될때 내부 데이터 타입을 지정할 수 있다.
		GenericBox<Integer> ib = new GenericBox<Integer>();
		ib.setContent(2010230);
		int i = ib.getContent();
	
		System.out.println(i);
		
		GenericBox<String> sb = new GenericBox<String>();
		sb.setContent("스트링");
		String str = sb.getContent();
		System.out.println(str);
		
		
		
	}
}
