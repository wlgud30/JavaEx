package com.javaex.basic.reftypes;

public class EnumEx {
	public static void main(String[] args) {

		// enumTest();
		enumTest2();
	}

	private static void enumTest2() {
		Week today = Week.WEDNESDAY;
		String message;
		switch(today) {
		case SUNDAY:
			message = "일요일";
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			message = "열공";
			break;
		case FRIDAY:
			message = "불금";
			break;
		case SATURDAY:
			message = "주말";
			break;
		default : 
			message = "?";
		}
		System.out.printf("%s에는 %s%n",today.name(),message);
	}

	private static void enumTest() {
		Week today = Week.WEDNESDAY;

		System.out.printf("Today is %s(%d)%n", today.name(), today.ordinal());
		// name = 열거상수의이름 ordinal = 순번

		Week other = Week.valueOf("FRIDAY");
		System.out.printf("other is %s(%d)%n", other.name(), other.ordinal());

		// 열거 상수의 순번 비교
		System.out.println(other.compareTo(today));
		// 두 열거 상수의 순번차 compareTo 중요

		Week[] days = Week.values(); // week enum 타입의 모든 열거 상수를 반환
		System.out.println(days.length);

		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i].name() + "," + days[i].ordinal());
		}
	}
}
