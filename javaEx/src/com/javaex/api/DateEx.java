package com.javaex.api;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		//dateClassEx();
		calendarEx();
	}
	//캘린더 객체
	private static void calendarEx() {
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		System.out.printf("현재 : %d년 %d월 %d일\n",now.get(Calendar.YEAR),now.get(Calendar.MONTH)+1,now.get(Calendar.DATE));
		//month 에 +1 을 해주는 이유는 월을 셀때 0부터 시작하기때문 ex)
		//년월일 정보를 알고 싶을때
		custom.set(2012, 8,24);
		System.out.printf("custom : %d년%d월%d일\n",custom.get(Calendar.YEAR),custom.get(Calendar.MONTH)+1,custom.get(Calendar.DATE));
		
		//날씨의 연산
		Calendar future =Calendar.getInstance();		//현재날짜
	
		future.add(Calendar.DATE, 100);
		System.out.printf("custom : %d년%d월%d일\n",future.get(Calendar.YEAR),future.get(Calendar.MONTH)+1,future.get(Calendar.DATE));
		//calendar.day_of_week 1~7 일~토
		int dow = future.get(Calendar.DAY_OF_WEEK);		//요일정보
		System.out.println(dow);
		
		String dowStr;
		switch(dow) {
		case Calendar.SUNDAY:
			dowStr = "일요일";
			break;
		case Calendar.MONDAY:
			dowStr = "월요일";
			break;
		case Calendar.TUESDAY:
			dowStr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowStr = "목요일";
			break;
		case Calendar.FRIDAY:
			dowStr = "금요일";
			break;
		case Calendar.SATURDAY:
			dowStr = "토요일";
			break;
		default:
			dowStr="?";
		}
		System.out.println(dowStr);
	
	}
	
	//날짜시간
	private static void dateClassEx() {
		Date now = new Date();				//현재 날짜와 시간 출력 ex)Mon Mar 08 13:14:34 KST 2021
		System.out.println(now.toString());
		
		//출력 포맷의 변경
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println(df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(now));
		
		
		
		
	}

}
