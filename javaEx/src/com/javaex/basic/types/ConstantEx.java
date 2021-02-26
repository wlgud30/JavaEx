package com.javaex.basic.types;


//상수 : 변하지않는 수
//선언 초기화 조회는 가능하지만 변경은 불가능하다


public class ConstantEx {
	static final int limit = 110;	//상수
	public static void main(String[] args) {
		//final int limit = 110;		// final -> 할당 이후에 변경 불가 
		//상수 사용 이유
		//코드의 가독성을 높인다
		//변경 불가 -> 코드 안정성 확보
		int speed = 120;
		boolean b1 = speed>limit;
		System.out.println("제한속도 초과 하였습니까?" + b1);
		System.out.println("제한속도는 "+limit+"입니다");
		
		// limit = 100 상수 변경 불가
		
	}

}
