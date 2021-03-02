package com.javaex.practice02;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		problem06();
		
	}
	
	private static void problem06() {
		System.out.println("숫자를 입력하세요.");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		if(num%2==0) {
			for(int i = 1 ; i<=num;i++) {
				if(i%2==0) {
					result=result+i;
				}
			}
		}else {
			for(int i = 1 ; i<=num;i++) {
				if(i%2!=0) {
					result=result+i;
				}
			}
		}
		System.out.println("결과값 : "+result);
		sc.close();
	}
}
