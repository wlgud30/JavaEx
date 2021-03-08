package com.javaex.api.generics.v3;

public class BoxApp {
	public static void main(String[] args) {
		//Generic 으로 설계된 클래스는 new(인스턴스화) 될때 내부 데이터 타입을 지정할 수 있다.
		//Key 타입이 String, Value 타입이 Integer
		GenericBox<String,Integer> intBox = new GenericBox<>();
		intBox.setKey("Integer");
		//intBox.setKey(123);	key는 String 타입으로 지정했기때문에 int값이 들어갈 수 없다
		intBox.setContent(2021);
		
		System.out.println(intBox.toString());
		
		
	}
}
