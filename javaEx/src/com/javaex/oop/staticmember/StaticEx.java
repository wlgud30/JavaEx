package com.javaex.oop.staticmember;

public class StaticEx {
	//클래스 변수 (static)
	//		:모든 인스턴스에서 공유
	//		: static-> instance(x)
	//		: instance ->static(o)
	public static int refCount;
	public static String classVar;
	//	인스턴스변수
	//		:개별 객체 내부에서만 접근
	public String instanceVar;
	
	//static 영역 초기화는 static 블록에서
	//클래스가 로디될 때 단 한번 실행
	static {
		refCount=0;
		classVar="클래스 변수";
		System.out.println("=>Static Block");
		//instanceVar = "인스턴스 변수";	static-> instance 멤버 접근 불가
	}
	
	//생성자
	public StaticEx() {
		refCount++;	//instance -> static(o) 스태틱 변수는 인스턴스에 접근가능
		System.out.println("=> instance 생성");
		System.out.println("=> 참조 count : "+refCount);
	}
	//소멸자
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		System.out.println("소멸자 호출");
		super.finalize();
	}
	
	
}
