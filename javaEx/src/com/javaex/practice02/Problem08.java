package com.javaex.practice02;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args) {
		problem08();
	}

	private static void problem08() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int var;
		for (;;) {
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("예금액 : ");
				var = sc.nextInt();
				result = result+var;
				continue;
			case 2:
				System.out.print("츌금액 : ");
				var = sc.nextInt();
				if(result<var) {
					System.out.println("잔고를 확인해 주세요.");
				}else {
					result = result-var;
				}
				continue;
			case 3:
				System.out.println("잔고액 : "+result);
				continue;
			case 4:
				System.out.println("프로그램 종료");
				break;
			default : 
				System.out.println("다시 입력해 주세요.");
				continue;
			}
			sc.close();
			break;
		}
		
	}
}
