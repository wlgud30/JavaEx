package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		problem07();
	}
	
	private static void problem07() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			
			System.out.println("숫자 맞추기 게임 시작");
			int answer = (int)(Math.random()*100)+1;
			
			for(;;) {
				System.out.print(">>");
				int a = sc.nextInt();
				if(a>answer) {
					System.out.println("더 낮게");
				}else if(a<answer) {
					System.out.println("더 높게");
				}else {
					System.out.println("정답");
					break;
				}
			}
			System.out.println("게임을 종료 하시겠습니까?(y/n)");
			String yn = sc.next();
			
			if(yn.equals("y")||yn.equals("Y")) {	
				System.out.println("숫자 맞추기 게임 종료");
				sc.close();
				break;
			}else if (yn.equals("n")||yn.equals("N")) {
				continue;
			}	
		}
	}
}
