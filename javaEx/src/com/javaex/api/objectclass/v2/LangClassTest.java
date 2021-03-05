package com.javaex.api.objectclass.v2;

public class LangClassTest {
	
	public static void main(String[] args) {
		Point p = new Point(10,10);
		Point p2 = new Point(10,10);
		
		//참조 타입의 ==  : 주소값비교
		//참조 타입에서 값의 비교 .equals();
		
		System.out.println("p,p2는 같은객체? "+(p==p2));
		System.out.println("p,p2의 값이같은가? "+p.equals(p2));
		System.out.println();
		
	}

}
