package com.javaex.practice01;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {

		problem05();
	}

	private static void problem05() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int result = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자 :"); // 1
			int num = sc.nextInt();
			if(i==1||num>=result) {
				result = num;
			}
		}
		System.out.println("최대값은 "+ result +" 입니다");
		sc.close();
	}
}
