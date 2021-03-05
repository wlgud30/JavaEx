package com.javaex.api.stringclass;

public class StringEx {
	public static void main(String[] args) {
		//stringBasic();
		usefulMethods();
	}
	
	private static void usefulMethods() {
		String source = "Java Programming, JavaScript Programming";
	
		System.out.println("원본 : "+source);
		
		//인덱스 접근
		System.out.println("length : " + source.length());
		System.out.println("5번 인덱스의 글자" + source.charAt(5));
		
		//변환 메서드
		System.out.println("모두 소문자로 : "+source.toLowerCase());
		System.out.println("모두 대문자로 : "+source.toUpperCase());
		
		//검색 메서드
		int index = 0;
		index = source.indexOf("Java");
		System.out.println("first Search : " + index);
		
		index += "Java".length();		// 인덱스를 4글자 뒤로 이동
		index = source.indexOf("Java",index);	//검색 시작 인덱스
		System.out.println("second search : "+ index);
		
		index = source.indexOf("Java",index+"Java".length());
		System.out.println("third search : "+ index);		//검색할 내용이 없을 때 -> -1
		
		index = source.lastIndexOf("Java");
		System.out.println("역방향 검색 : " + index);
		
		//추출
		System.out.println("18번 인덱스~ : "+source.substring(18));
		System.out.println("18~22 : " + source.substring(18, 22));
		
		//치환 메서드
		System.out.println("Replace : "+source.replaceAll("Java", "Python"));
		System.out.println("Replace : "+source.replace("Java", "Python"));
		
		//변환 치환 추출 메서드를 수행해도 원본이 변경되지는 않는다.
		System.out.println("원본 : " +source);		//String 은 불변객체이다(immutable) 치환,변환,추출 할때마다 새로운 String이 선언된다 
	
		//Whitespace 제거	 -> trim() 은 문자열의 공백을 제거한다
		String str = "            hello              ";
		
		System.out.println(str.trim());
	
		//문자열 분절
		String words[] = source.split(" ");
		for(String var : words) {
			System.out.println(var);
		}
		
		//문자열의 비교
		// compareTo : 같으면 0 , 적으면 -1 , 크면 1	주로 Sort 할때 쓰임
		System.out.println("ABC".compareTo("ABD"));
		System.out.println("ABC".compareTo("ABC"));
	}
	
	private static void stringBasic() {
		String s1 = "java";		//리터럴
		String s2 = new String("java");		// 새로운 객체
		String s3 = "java";		//리터럴
		
		System.out.println(s1==s2);		//리터럴과 새로운 객체는 다르지만 리터럴끼린 같다
		System.out.println(s1==s3);
		
		//String char 의 집합
		char letters[] = {'J','a','v','a'};
		String s4 = new String(letters);
		System.out.println(s4);
		
		//valueOf 메서드 -> 기본 타입을 문자열로 변환
		String s5 = String.valueOf(3.14159f);
		System.out.println(s5);
		
	}
}
