package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
		// 메인 쓰레드의 흐름과는 다른 별도의 흐름
		// thread의 우선순위를 결정할 수 있다 : 1(Main) ~ 7(NOMAL) ~ 10(Max)
		//CPU 자원이 부족할 때 어느 쓰레드를 우선 실행시킬지 결정한다.
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		thread.setPriority(Thread.MAX_PRIORITY);

		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.setName("AlphabetRunnable");
		thread2.setPriority(Thread.MIN_PRIORITY); 		//1
		// 쓰레드 시작
		thread.start(); // start() 메서드 내에서 run 메서드를 대신수행
		// 주의 run() 을 외부에서 직접 호출하면 멀티쓰레드가 아닌 일반메서드로 실행되게된다
		// 생성자에 run() 메서드가 구현된 Runnable 객체를 전달
		thread2.start();

		// Working Thread 의 제어권을 유지하기위해
		// 작업 흐름을 Main 쓰레드에 합류

		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("메인 쓰레드 종료!");

	}

}
