package com.javaex.thread.ex01;

public class MainThread {
	
	public static void main(String[] args) {
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		//쓰레드 시작
		thread.start();		// start() 메서드 내에서 run 메서드를 대신수행
		//주의 run() 을 외부에서 직접 호출하면 멀티쓰레드가 아닌 일반메서드로 실행되게된다
		
		//main thread : A~Z 출력
		for(char ch = 'A' ; ch<='Z';ch++) {
			System.out.println("Main Thread : " + ch);
			try {
				Thread.sleep(300);				//밀리언세컨드단위 0.3초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
