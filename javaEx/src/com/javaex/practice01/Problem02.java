package com.javaex.practice01;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		problem02();
	}
	
	private static void problem02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		for(int i = 1;i<=num;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
	}

}
