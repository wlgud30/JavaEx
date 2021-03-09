package com.javaex.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionsEx {
	public static void main(String[] args) {
		
		//arithExceptionEx();
		//arrayExceptionEx();
		//nullPointerExceptionEx();
		throwExceptEX();
		System.out.println("End of Code!");
		
	}
	
	private static void throwExceptEX() {
		//	호출된 메서드 내에서 발생한 예외는 가급적
		//	호출한 메서드 내에서 예외처리를 해주는 것이 바람직하다
		ThrowsExcept except = new ThrowsExcept();
		//Checked 예외 처리 예제
//		try {
//			except.executeChecked();	//checked Exception
//		} catch (IOException e) {
//			System.err.println("Checked 예외 발생!");
//			System.err.println(e.getMessage());
//		}
		
		//unChecked 예외 처리 예제
		try {
			//except.executeRuntime();
			except.divide(100, 0);
		}catch(CustomArithmeticException e) {
			System.err.println(e.getMessage());
			System.err.println(e.getNum1());
			System.err.println(e.getNum2());
		}catch (RuntimeException e) {
			// 호출된 메서드 내에서 발생한 예외를 이곳에서 위임처리
			System.err.println("호출된 메서드에서 unchecekd 에러발생");
			System.err.println(e.getMessage());
		}catch(Exception e) {
			// 혹시 남아있을 수 있는 예외를 처리하기위해 마지막은 Exception catch
			e.printStackTrace();
		}finally {
			System.out.println("예외처리 완료!");
		}
		
	}
	private static void nullPointerExceptionEx() {
		//가장 흔하고, 가장 위험한 오류
		String str = new String("Hello");
		
		str = null;	//참조가 해제
		
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
			System.err.println("널입니다!");
		}
		
		
		
		
	}
	
	private static void arrayExceptionEx() {
		int[] intArray = new int[] {3,6,9};
		try {
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			System.err.println("발생한 예외 : "+ e.getClass().getSimpleName());
		}finally {
			System.out.println("마지막은 여기");
		}
		
		
	}
	
	private static void arithExceptionEx() {
		//키보드로부터 정수를 입력
		//100을 입력받은 수로 나눠 봅시다
		
		Scanner sc = new Scanner(System.in);
		
		double result = 0;
		int num;
		System.out.println("정수를 입력해주세요.");
		
		
		try {
			num = sc.nextInt();
			result = 100/num;
		}catch(ArithmeticException e){
			//구체적인예외를 위쪽에
			System.err.println("0으로는 나눌수 없어요");
			System.err.println("메시지 : "+e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외발생");
		} finally {
			System.out.println("Finally"); 		//예외 발생 여부에 관계없이 항상 마지막에 실행
		}
		
		
		System.out.println(result);
		sc.close();
	}
}
