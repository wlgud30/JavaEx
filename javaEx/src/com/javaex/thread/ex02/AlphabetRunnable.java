package com.javaex.thread.ex02;

//run() 메서드만 구현, Thread 생성자로 전달
public class AlphabetRunnable implements Runnable {

	@Override
	public void run() {
		// main thread : A~Z 출력
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(Thread.currentThread().getName()+ " : " + ch);
			try {
				Thread.sleep(300); // 밀리언세컨드단위 0.3초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
