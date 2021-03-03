package com.javaex.oop;

public class MethodEx {
	public static void main(String[] args) {
		printDivide(5, 3);
		printDivide(5, 0);
		System.out.println(getSum(13, 25));
		System.out.println(getSum2(new double[] {1,2,3,4,5,6,7,8}));
		System.out.println(getSum3(1,2,3,4,5,6,7,8,9,10));
	}
	private static double getSum3(double ... values) {
		//...은 매개변수의 개수를 알수없을때 사용한다.
		return getSum2(values);
	}
	private static double getSum2(double[] values) {
		
		double result = 0;
		for(double value : values) {
			result += value;
		}
		
		return result;
	}
	//반환값을 받고자 한다면 리턴 타입을 지정
	private static double getSum(double num1, double num2) {
		return num1+num2;	//리턴 타입은 반드시 지정한 타입과 일치해야한다
	}
	//반환값이 없을 경우 void 타입 지정
	private static void printDivide(int num1,int num2) {
		if(num2==0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;	//리턴문을 만나면 남은코드 실행 하지않고 다시 호출된 곳으로 되돌아간다
		}
		System.out.println(num1/num2);
	}
}
