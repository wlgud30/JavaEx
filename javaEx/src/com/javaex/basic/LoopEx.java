package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {
	public static void main(String[] args) {
		// whileEx01();
		// whileGugu();
		// doWhileEx01();
		// infLoop();
		// forGugu();
		// continueEx();
		// breakEx();
		//gugu();
		// ex();
		 //Looto();
	}

	private static void Looto() {
		for (int i = 0; i < 6; i++) {
			int ran = (int) (Math.random() * 45) + 1;
			if (i != 5) {
				System.out.print(ran + ",");
			} else {
				System.out.print(ran);
			}
		}
		// while 문으로 만들기
		System.out.println();
		int a =0;
		while(a<6) {
			int ran = (int) (Math.random() * 45) + 1;
			if (a != 5) {
				System.out.print(ran + ",");
			} else {
				System.out.print(ran);
			}
			a++;
		}
	}

	private static void ex() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// while문으로 만들기
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j > 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		int a=1;
		
		while(a<=5) {
			int b=1;
			while(b<=a) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			a++;
		}
	}

	// 구구단
	private static void gugu() {

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println();
		}

		// while 문으로 작성
		int a = 2;
		while (a <= 9) {
			int b = 1;
			while (b <= 9) {
				System.out.println(a + "x" + b + "=" + a * b);
				b++;
			}
			a++;
		}
	}

	private static void breakEx() {
		// 6의 배수이자 14의 배수인 가장 적은 정수 찾기
		int num = 1;
		while (true) {
			if (num % 6 == 0 && num % 14 == 0) {
				break;
			}
			num++;
			System.out.println(num);
		}
	}

	private static void continueEx() {
		// 1에서 20까지의 수에서 2의 배수와 3의 배수를 제외한 숫자를 출력하세요
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	private static void forGugu() {
		// 입력 받은 단의 구구표 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력해주세요.");
		int num = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "x" + i + "=" + num * i);
		}
		sc.close();
	}

	private static void infLoop() {
		// while,do -while 의 경우, 반복 조건은 개발자가 책임
		// 반복 조건이 true 일 경우 무한루프에 빠진다
		// 특별한 경우가 아니라면 무한루프는 피하도록 하자
		while (true) {
			System.out.println("Ctrl+c to Quit");
		}

	}

	// do while 최소 1회는 반드시 실행되어야하는 반복문을 작성
	private static void doWhileEx01() {
		// 사용자의 숫자를 입력받아 더하는 프로그램을 작성하세요 0이면종료
		int total = 0;
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("정수를 입력하세요 [0이면 종료]");
			num = sc.nextInt();
			total = total + num;
			// total +=num;
		} while (num != 0); // num 가 0이 아니면 반복
		System.out.println("합산값 : " + total);
		sc.close();
	}

	// while 반복문을 이용해 구구단
	private static void whileGugu() {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력해 주세요.");
		int num = sc.nextInt();
		while (i <= 9) {
			System.out.println(num + "x" + i + "=" + num * i);
			i++;
		}
		sc.close();
	}

	// while 문
	private static void whileEx01() {
		// i like java0~5 출력
		int i = 0;
		while (i <= 5) {
			System.out.println("I like java" + i);
			i++;
		}
	}
}
