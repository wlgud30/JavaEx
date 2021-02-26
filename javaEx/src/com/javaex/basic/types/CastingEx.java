package com.javaex.basic.types;

//byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)
public class CastingEx {

	public static void main(String[] args) {
		implicitCastingEx();
	}
	//명시적 캐스팅
	//표현범위가 넓은 자료형 -> 좁은 자료형
	//개발자가 명시적으로 타입을 변환
	private static void explicitCastingEx() {
		double d = 123.456;	//8바이트 실수형
		System.out.println(d);
		
		float f = (float) d;		//4바이트 실수형
		
		long l = (long) f;
		
		byte b = (byte) l;
		
	}
	//암묵적 캐스팅 (implicit casting: promption)
	//표현 범위가 좁은 자료형 -> 넓은 자료형 : 자바 자동변환
	private static void implicitCastingEx() {
		byte b =25;				//1바이트 정수
		System.out.println(b);
		
		short s = b; 			//2바이트 정수
		
		System.out.println(s);
		
		int i = s; 				//4바이트 정수
		System.out.println(i);
		
		long l  = i;			//8바이트 정수
		System.out.println(l);
		
		float f= l ;				//long이 float 보다 바이트 수는 크지만 표현 범위가 좁다
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
	}
}
