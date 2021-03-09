package com.javaex.exceptions;

import java.io.IOException;

public class ThrowsExcept {
	public static void executeChecked() throws IOException {	//내부 발생 예외를 호출한 메서드에서 처리할 수 있도록 위임
		System.err.println("강제 Checked 예외 발생");
		//예외 발생
		throw new IOException("강제 예외");		//checked exception 은 반드시 예외처리를 해줘야함
		//IOException 은 checked exception
		
	}
	
	public void executeRuntime() {
		System.err.println("런타임 예외");
		throw new RuntimeException("런타임 익셉션");		//unchecked exception 은 반드시 예외처리를 해야하는건 아님
	
	}
	
	public double divide(int num1,int num2) {
		double result=0;
		try {
			result = num1/num2;
		} catch (ArithmeticException e) {
			//예외 전환 : 보다 구체적인 예외로 전환하는것
			throw new CustomArithmeticException("사용자 정의 Exception", num1, num2);
		}
		
		
		return result;
	}
	
}
