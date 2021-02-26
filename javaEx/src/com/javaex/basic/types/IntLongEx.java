package com.javaex.basic.types;

//정수 타입 연습
//byte(1) < short(2) < int(4 : 정수형의 기본타입) < long (8)
public class IntLongEx {

	public static void main(String[] args) {
		int intVar = 2021;	//변수 선언후 초기화
		//타입의 범위를 넘어가는 값을 할당할 수는 없다.
		int intVar2;
		//intVar2 = 1231231213123;  ->> out of range 범위를 초과했다는 오류 발생
		
		long longVar = 2021;
		long longVar2 = 123456789012345L; //L or 1
		
		//short type
		short s1 = 100;
		short s2 = 200;
		
		//short result = s1 + s2 ; ->> 타입이 다른 타입이여도 정수와 정수끼리 더할땐 일단 인트로 변환된후 연산된다.
		
		int result = s1+s2;
		
		System.out.println(s1+"+"+s2+"="+result);
		
		// 2진수 , 8진수 , 16진수 표현법
		int bin,oct,hex;
		
		bin = 0b1100; // 0b를 접두어 -> 2진수
		oct = 072;	  // 0을 접두어 -> 8진수
		hex = 0xFF;   // 0x 접두어 -> 16진수
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}
