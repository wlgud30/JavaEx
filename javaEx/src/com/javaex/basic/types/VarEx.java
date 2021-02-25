package com.javaex.basic.types;

// 변수 연습
public class VarEx {

	public static void main(String[] args) {
		// 변수의 식별자 규정
		// 변수 식별자는 문자,숫자,$,_의 조합으로 생성
		// 숫자로 시작하면 안됨
		// 예약어 사용할 수 없음
		
		// 관례(통상적으로 개발자들간의 약속) : 
		//								소문자로 작성,단어의 조합일 경우,뒷 단어의 첫글자는 대문자(camelCase)
		// 초기화
		/*
		 * int myAge; // 선언 int 타입 데이터를 담을 공간을 할당 myAge = 27; // 초기화,할당
		 */		
		int myAge = 27; //선언과 초기화를 동시에 하는 것도 가능
		// java는 정적 타입 언어다 한번 선언되고나면 그후엔 타입을 변경할 수 없다.
		// myAge = "문자열"; -> 이미 myAge는 int 타입으로 선언되었기 때문에 문자열로 값을 변경할 수 없다(컴파일에러 발생)
		int v1= 10, v2 = 20, v3 = 30;	//한번에 여러 변수를 선언할때
		v1= v2= v3 =40;					//여러 변수에 동시에 같은값을 할당할때
		
		System.out.println("내 나이는"+myAge);
		
	}
	
}
