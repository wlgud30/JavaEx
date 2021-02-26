package com.javaex.basic.types;

//실수
//float(4)<double(8)
//정밀도를 포기하고 표현 범위를 넓힌 자료형
//표현 범위 : byte<short<int(4)<long(8)<float(4)<double(8)
public class FloatDoubleEx {

	public static void main(String[] args) {
		float floatVar = 3.14159F; // f or F접미
		double doubleVar = 3.14159; // 실수형 기본은 double
		
		int intVar = 300000000;
		floatVar = 3E7f;
		doubleVar = 314159E-5;
		
		System.out.println(floatVar);
		System.out.println(doubleVar);
		
		//부동소수점 계산의 유의점
		//float double 정밀도 포기하고 표현 범위를 넓힌 자료형
		//정밀계산에 활용시에는 유의
		System.out.println(0.1*3);
		
		
	}
}
