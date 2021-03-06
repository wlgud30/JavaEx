package com.javaex.basic;

import java.util.Scanner;

public class ConsoleEx {
	public static void main(String[] args) {
		//consoleOutputEx();
		consoleInputEx();
		
	}
	
	//콘솔 출력
	private static void consoleOutputEx() {
		//표준 출력(stdout) : System.out
		//표준 에러(stderr) : System.err
		//메서드 print() -> 출력 후 개행을 하지 않음
		//메서드 println() -> 출력  후 개행
		//printf() 포맷출력 -> String 항목에서 정리
		
		System.out.print("Hello ");
		System.out.println("Java");
		System.out.println("NewLine");
		
		// 이스케이프 문자
		// \n개행 \t탭 \"큰따옴표 \\역슬래시
		System.out.println("Hello \nJava");	//강제 개행
		System.out.println("Hello \t\tJava");	//탭
		System.out.println("Hello \"Java\"");
		
		String filePath ="D:\\myFolder\\myfile.txt";
		System.out.println(filePath);
	}
	
	//콘솔 입력
	private static void consoleInputEx() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요.");
		String name = sc.next();
		System.out.print("나이를 입력해 주세요.");
		int age = sc.nextInt();
		System.out.println("이름은 "+name+" 나이는 "+age);
		sc.close();
	}
}
