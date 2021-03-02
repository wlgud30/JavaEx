package com.javaex.basic;

import java.util.Scanner;

public class ConditionalEx {
	
	public static void main(String[] args) {
		//ifEx();
		//ifElseEx();
		//ifPractice();
		//switchEx();
		//switchEx2();
		switchEx3();
	}
	private static void switchEx5() {
		//점수를 입력받아 등급을 표시하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		switch(score) {
			case 100 :
				System.out.println("A등급");
				break;
			case 90 :
				System.out.println("A등급");
				break;
			case 80 :
				System.out.println("A등급");
				break;
			case 70 :
				System.out.println("A등급");
				break;
			case 60 :
				System.out.println("A등급");
				break;
			default : 
				System.out.println("탈락입니다.");
		}
		sc.close();
	}
	private static void switchEx4() {
		//점수를 입력받아 입력된 수가 3의 배수인지 판별하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		if(score/3==0) {
			System.out.println(score + "는 3의 배수 입니다.");
		}else {
			System.out.println(score + "는 3의 배수가 아닙니다");
		}
		System.out.println(score%3==0? "3의 배수입니다":"3의 배수가 아닙니다");
	}
	
	private static void switchEx3() {
		String day = "TUE";
		//요일변수는 지정된 범위의 값만 들어와야 한다 -> 문자열 사용 자제
		String message;
		switch (day){
			case "SUN":
				message="일요일";
				break;
			case "MON":
			case "TUE":
			case "WED":
			case "THU":
				message="열공";
				break;
			case "FRI":
				message="불금";
				break;
			case "SAT":
				message="주말";
				break;
			default : 
				message = "?";
		}
		System.out.println(day + "에는 " + message);
	}
	private static void switchEx2() {
		//월을 입력받아 해당월의 일수를 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		
		switch (month) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				System.out.println(month + "월은 31일 입니다.");
				break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				System.out.println(month + "월은 30일 입니다.");
				break;
			case 2 :
				System.out.println(month + "월은 28일 입니다.");
				break;
			default :
				System.out.println("?");
				break;
		}
		sc.close();
	}
	//switch
	private static void switchEx() {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요\n(1.자바 2.c 3.c++ 4.파이썬)");
		System.out.print("과목번호 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("R101호 입니다.");
			break;
		case 2:
			System.out.println("R202호 입니다.");
			break;
		case 3:
			System.out.println("R303호 입니다.");
			break;
		case 4:	
			System.out.println("R404호 입니다.");
			break;
		default:
			System.out.println("관리자에게 문의하세요.");
			break;
		}
		sc.close();
	}
	//연습문제
	private static void ifPractice() {
		//과목번호를 입력받아 강의실 번호를 출력하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요\n(1.자바 2.c 3.c++ 4.파이썬)");
		System.out.print("과목번호 : ");
		int num = sc.nextInt();
		if(num==1) {
			System.out.println("R01호 입니다.");
		}else if(num==2) {
			System.out.println("R02호 입니다.");
		}else if(num==3) {
			System.out.println("R03호 입니다.");
		}else if(num==4) {
			System.out.println("R04호 입니다.");
		}else {
			System.out.println("상담원에게 문의하세요.");
		}
		sc.close();
	}
	
	//if ~ else if ~ else
	private static void ifElseEx() {
		//숫자를 입력받아 숫자가 0보다 크면 양수 0보다작으면 음수 0일때는 0입니다
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int num = sc.nextInt();
		//if(num>0) {
		//	System.out.println("양수 입니다.");
		//}else if(num<0) {
		//	System.out.println("음수 입니다.");
		//}else {
		//	System.out.println("0입니다");
		//}
		
		if(num==0) {
			System.out.println("0입니다.");
		}else {
			if(num>0) {
				System.out.println("양수입니다");
			}else {
				System.out.println("음수입니다");
			}
		}
		
		sc.close();
	}
	//if 분기문
	private static void ifEx() {
		//점수를 입력받아 점수가 60점 이상이면 합격입니다
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요.");
		int score = sc.nextInt();
		if(score>=60) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
		sc.close();
	}

}
