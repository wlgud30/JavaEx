package com.javaex.api;

public class WrapperEX {
	public static void main(String[] args) {
		Integer i = new Integer(10);		//-빠른시간내에 다른방식으로 코딩
		Float F = new Float(3.14159f);		// deprecated 자바의 버전 업으로 더이상 사용되지않지만 구버전 호환을위해 남겨둠
		
		//valueOf() static 메서드를 이용하자
		Character c = Character.valueOf('c');

		//문자열로 초기화할수있다 -추천
		Integer i2 = Integer.valueOf("10");
		Float f2 = Float.valueOf("3.14159f");
		Boolean b2 = Boolean.valueOf("false");
		//파라미터로 전달된 문자열이 해당 타입으로 변환될 수 있는 형태의 문자열이어야한다
		
		//자동박싱 지원
		Integer i3 = 10; 		//Integer i3 = Integer.valueOf(10);
		
		//유틸리티 메서드들
		//parse 계열 메서드 : 문자열을 이용 해당 타입으로 변환 다른형태로 출력메서드
		System.out.println(Integer.parseInt("-123"));		//문자열 -> 정수
		System.out.println(Integer.parseInt("FF",16));		//16진수 ff -> 정수로변환
		System.out.println(Integer.toBinaryString(28));		//28을 2진수 형태의 문자열로 출력
		System.out.println(Integer.toHexString(28));		//28을 16진수 형태의 문자열로 출력
	
		
		//형변환 메서드들
		Double d4 = i3.doubleValue();
		System.out.println(d4);		
		//자동 박싱과 자동 언박싱 WrapperClass(포장클래스) 도 객체이다.
		Integer i4 = Integer.valueOf(2021);
		Integer i5 = Integer.valueOf(2021);
		
		System.out.println(i4==i5); 		//둘다 객체이기때문에 값이 같아도 두 객체는 같지않다(주소값비교)
		System.out.println(i4.equals(i5)); 	//값의 비교를 위해서는unboxing 비교,equals 비교를 해야한다
		System.out.println(i4.intValue()==i5.intValue());
										
		
	}
	
	
	

}
