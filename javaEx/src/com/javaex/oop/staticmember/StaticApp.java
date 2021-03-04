package com.javaex.oop.staticmember;

public class StaticApp {
	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		//1번째 로드 static->생성자
		System.out.println("참조 카운트 : " + s1.refCount);
		System.out.println("참조 카운트 : " + StaticEx.refCount);	//static 멤버는 new를 하지 않고도 호출할 수 있다
		//메서드를 실행했을때 static block이 먼저 실행되고 instance 가 생성된다
		
		StaticEx s2 = new StaticEx();
		//2번째 로드 static 블록은 수행되지 않음
		System.out.println("참조 카운트 : "+StaticEx.refCount);	//생성자를 한번 더 불러왔기 때문에 참조카운트가 늘어났다
		System.out.println();
		
		//해제
		s1=null;
		System.out.println("s1 해제 ");
		System.out.println("참조 카운트 : "+StaticEx.refCount);
		
		System.gc();//가비지 콜렉터 호출
		try {
			Thread.sleep(1000);	//1초대기
			System.out.println("참조 카운트 : "+ StaticEx.refCount);
		}catch (Exception e) {
			
		}
		
	}
}
