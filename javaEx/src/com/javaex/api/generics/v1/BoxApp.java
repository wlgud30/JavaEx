package com.javaex.api.generics.v1;

public class BoxApp {
	public static void main(String[] args) {
		IntBox intBox = new IntBox();
		intBox.setContent(21);
		
		int i = intBox.getContent();
		System.out.println(i);
		
		StringBox strBox = new StringBox();
		strBox.setContent("Java");
		
		System.out.println(strBox.getContent());
		
		ObjectBox objBox = new ObjectBox();
		objBox.setContent("String");
		System.out.println(objBox.getContent());
		objBox.setContent(2021);
		Integer retVal = (Integer) objBox.getContent();		//내부 데이터가 Object에서 Java 컴파일러가 체크가 힘들어진다
															//데이터를 불러올 때 , 캐스팅필요 -> 불편,위험
		System.out.println(objBox.getContent());
		
		
	}
}
